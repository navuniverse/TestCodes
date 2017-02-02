/**
 * 
 */
package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author naveen
 *
 */
public class HandlingStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);

		IntStream.range(1, 20).filter(number -> number > 10).forEach(number -> System.out.println(number));

		List<Integer> integers = IntStream.range(10, 20).boxed().collect(Collectors.toList());
		System.out.println(ArrayUtils.toString(integers.toArray()));
		
		
		List<Integer> list = integers.stream().filter(num -> num > 12).skip(2).collect(Collectors.toList());
		System.out.println(ArrayUtils.toString(list.toArray()));
		
		Map<Integer, Integer> nummap = list.parallelStream().sorted().collect(Collectors.toMap(num -> num, num -> num));
		System.out.println(nummap.toString());
		
	}

}
