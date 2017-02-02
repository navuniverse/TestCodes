/**
 * 
 */
package thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author naveen.kumar
 * 
 */
public class ScheduledThreadPool {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Runnable command = new WorkerThread("Scheduled Thread");
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        // scheduling the thread to run after 20 seconds
        executor.schedule(command, 20, TimeUnit.SECONDS);
        for (int i = 1; i <= 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

    }

}
