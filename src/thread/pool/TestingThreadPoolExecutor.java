/**
 * 
 */
package thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author naveen.kumar
 * 
 */
public class TestingThreadPoolExecutor {

	public static void threadTest() {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		List<Long> list = new ArrayList<Long>();
		for (long i = 1; i < 100000; i++) {
			list.add(i);
		}
		for (final Long i : list) {
			executorService.submit(new Runnable() {

				@Override
				public void run() {
					if (i % 10000 == 0) {
						System.out.println("Inside Loop --> At index " + i);
					}

				}
			});
		}
		System.out.println("Out of Loop--> Shutting down initiated");
		executorService.shutdown();
		System.out.println("Out of Loop--> Shutting down completed");
		System.out.println("Out of Loop--> Service Status. Shutdown: " + executorService.isShutdown() + "  Terminated: "
				+ executorService.isTerminated());

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// RejectedExecutionHandler implementation
		RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

		// Get the ThreadFactory implementation to use
		ThreadFactory threadFactory = Executors.defaultThreadFactory();

		// creating the ThreadPoolExecutor
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 2, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1), threadFactory,
				rejectionHandler);

		// start the monitoring thread
		WorkerThreadPoolExecutor workerThreadPoolExecutor = new WorkerThreadPoolExecutor(executorPool, 3);

		Thread monitorThread = new Thread(workerThreadPoolExecutor);

		monitorThread.start();

		// submit work to the thread pool
		for (int i = 1; i <= 10; i++) {
			executorPool.execute(new WorkerThread("cmd" + i));
		}

		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// shut down the pool
		executorPool.shutdown();

		// shut down the monitor thread
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		workerThreadPoolExecutor.shutdown();

		threadTest();
	}

}
