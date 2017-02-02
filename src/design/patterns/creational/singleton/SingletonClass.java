/**
 * 
 */
package design.patterns.creational.singleton;

/**
 * Class with singleton functionality i.e., only one object will be created and
 * used for this class
 * 
 * @author naveen.kumar
 * 
 */
public class SingletonClass {

    private static SingletonClass singletonClass = new SingletonClass();

    /**
     * Private Constructor to restrict any new instance creation of this class
     */
    private SingletonClass() {

    }

    /**
     * Method to get the single instance of {@link SingletonClass}
     * 
     * @return singletonClass
     */
    public static SingletonClass getInstance() {
        if (null == singletonClass) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    /**
     * Method to destroy the singleton instance
     */
    public static void flush() {
        singletonClass = null;
    }
}
