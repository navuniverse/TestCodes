/**
 * 
 */
package inheritance;

/**
 * @author naveen
 *
 * @date 28-Jun-2017
 */
public class ClassB implements IntB {

	@Override
	public int add(int a) {
		return a;
	}

	public static void main(String[] args) {
		ClassB classB = new ClassB();
		System.out.println(classB.add(1, 2));
	}
}