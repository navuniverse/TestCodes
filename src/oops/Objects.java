/**
 * 
 */
package oops;


/**
 * @author naveen
 *
 * @date 15-Mar-2017
 */
public class Objects {

	public static void main(String[] args) {
		// Instrumentation
		Integer integer = new Integer(10);

		System.out.println(ObjectSizeFetcher.getObjectSize(integer));
	}
}
