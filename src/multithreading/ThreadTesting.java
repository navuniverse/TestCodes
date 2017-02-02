/**
 * 
 */
package multithreading;

import java.util.Scanner;

/**
 * @author naveen.kumar
 * 
 */
public class ThreadTesting implements Runnable {

    /**
     * @param args
     */
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int numberOfThreads = 0;
        System.out.print("Enter number of threads to execute: ");
        numberOfThreads = scan.nextInt();

        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new ThreadTesting());
            thread.setName(i + 1 + "");
            thread.start();
            try {
                if (Integer.parseInt(thread.getName()) % 3 == 0) {
                    throw new IllegalArgumentException();
                }
                Thread.sleep(2000);
            } catch (IllegalArgumentException e) {
                System.out.println("Thread " + thread.getName()
                        + " Throwing exception");
            } catch (InterruptedException e) {
                System.out.println("Thread " + thread.getName()
                        + " Interrupted");
            }
        }
        System.out.println("Main complete ");
    }


    @Override
    public void run() {
        System.out.println("Running Thread: " + Thread.currentThread());
        System.out.println("Thread " + Thread.currentThread().getName()
                + " complete");
    }

}
