/**
 * 
 */
package inheritance;

/**
 * @author naveen
 *
 * @date 28-Jun-2017
 */
@FunctionalInterface
public interface IntB extends IntA {

	default int add(int num1, int num2) {
		System.out.println("Its B");
		return num1 + num2;
	}
}