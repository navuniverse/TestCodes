/**
 * 
 */
package basics;

/**
 * @author naveen
 *
 * @date 22-Jun-2017
 */
public class IntegerOperations {

	public static void main(String[] args) {
		Integer integer = new Integer(5);
		System.out.println(modifyInteger(integer));
	}

	private static Integer modifyInteger(Integer integer) {
		integer = 10;
		return integer;
	}
}