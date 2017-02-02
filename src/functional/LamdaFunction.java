/**
 * 
 */
package functional;

/**
 * @author naveen
 *
 */
@FunctionalInterface
public interface LamdaFunction {

	boolean showMe(String name);

	default void printMe(String name) {
		System.out.println("My name is: " + name);
	}
}
