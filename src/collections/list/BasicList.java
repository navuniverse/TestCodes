/**
 * 
 */
package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author naveen
 *
 * @date 28-Jul-2019
 */
public class BasicList {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(4);

		System.out.println(integers.size());

		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);

		System.out.println(integers);
		integers.remove(0);
		
		
		System.out.println(integers);
		System.out.println(integers.size());
	}
}