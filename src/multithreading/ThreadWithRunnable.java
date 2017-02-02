package multithreading;

/**
 * Class showing the functionality of Java threads by implementing the
 * {@link Runnable} interface
 * 
 * @author naveen.kumar
 * 
 */
public class ThreadWithRunnable implements Runnable {

    Thread thread;

    /**
     * Parameterised constructor to create a new thread
     * 
     * @param thread
     */
    public ThreadWithRunnable(String threadName) {
        // create new thread
        thread = new Thread(this, threadName);
        System.out.println("Thread Name: " + thread.getName());

        // start the thread
        thread.start();
    }

    /**
     * Default Constructor
     */
    public ThreadWithRunnable() {
        super();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        // display info about the current thread
        for (int i = 0; i < 5; i++)
            System.out.println("Current Thread from ThreadWithRunnable: "
                    + Thread.currentThread()+i);

    }

}
