/**
 * 
 */
package multithreading;

/**
 * Class to run the threads
 * 
 * @author naveen.kumar
 * 
 */
public class ThreadExecutor {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        // creating new threads
        Thread thread1 = new Thread(new ThreadWithRunnable(), "Thread1");
        Thread thread2 = new Thread(new ThreadWithRunnable(), "Thread2");

        // creating new instance of ThreadWithRunnable class to run the thread
        @SuppressWarnings("unused")
        ThreadWithRunnable threadWithRunnable = new ThreadWithRunnable(
                "Thread3");
        
        // start the threads
        thread1.start();
        thread2.start();

        try {
            // create a delay of 1 second b/w threads
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Hey...We got a problem here. : "
                    + e.getMessage());
        }

        // display info about the current thread
        System.out.println("Current Thread from ThreadExecutor: "
                + Thread.currentThread());
    }

}
