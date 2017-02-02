/**
 * 
 */
package thread.pool;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author naveen.kumar
 * 
 */
public class WorkerThreadPoolExecutor implements Runnable {

    private ThreadPoolExecutor executor;

    private int seconds;

    private boolean run = true;

    public WorkerThreadPoolExecutor(ThreadPoolExecutor executor, int delay) {
        this.executor = executor;
        this.seconds = delay;
    }

    public void shutdown() {
        this.run = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        while (run) {
            System.out
                    .println(String
                            .format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                                    executor.getPoolSize(),
                                    executor.getCorePoolSize(),
                                    executor.getActiveCount(),
                                    executor.getCompletedTaskCount(),
                                    executor.getTaskCount(),
                                    executor.isShutdown(),
                                    executor.isTerminated()));
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
