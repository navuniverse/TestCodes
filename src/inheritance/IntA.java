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
public interface IntA {

	int add(int a);

	default int add(int num1, int num2) {
		System.out.println("Its A");
		return num1 + num2;
	}
}