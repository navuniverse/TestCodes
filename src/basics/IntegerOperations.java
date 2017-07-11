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

		boxingNumbers();
	}

	private static void boxingNumbers() {
		Integer num1 = 5;
		long long1 = 7l;

		Double number = (double) num1 / long1;

		System.out.println(number);
	}

	private static Integer modifyInteger(Integer integer) {
		integer = 10;
		return integer;
	}
}