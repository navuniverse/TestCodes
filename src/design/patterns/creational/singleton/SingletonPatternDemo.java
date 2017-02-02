/**
 * 
 */
package design.patterns.creational.singleton;

/**
 * Class to demo the functionality of Singleton pattern
 * 
 * @author naveen.kumar
 * 
 */
public class SingletonPatternDemo {

    /**
     * Main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        // getting two instance of SingletonClass
        SingletonClass singletonClassFirst = SingletonClass.getInstance();
        SingletonClass singletonClassSecond = SingletonClass.getInstance();

        // checking the singleton condition. Should be same
        if (singletonClassFirst.equals(singletonClassSecond)) {
            System.out
                    .println("Correct!!! Singleton property holds. Same objects found!!!");
        } else {
            System.out
                    .println("Wrong!!! Singleton property failed. Different Object found!!!");
        }

        // destroying the singleton instance of SingletonClass
        SingletonClass.flush();

        // getting new instance of SingletonClass
        singletonClassSecond = SingletonClass.getInstance();

        // checking the singleton condition. Should be different
        if (singletonClassFirst.equals(singletonClassSecond)) {
            System.out
                    .println("Wrong!!! Singleton property holds. Same objects found!!!");
        } else {
            System.out
                    .println("Correct!!! Singleton property failed. Different Object found!!!");
        }

        // destroying the singleton instance of SingletonClass
        SingletonClass.flush();
    }

}
