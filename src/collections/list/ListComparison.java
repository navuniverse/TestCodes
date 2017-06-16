/**
 * 
 */
package collections.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;

/**
 * @author naveen
 *
 * @date 16-Jun-2017
 */
public class ListComparison {

	public static void main(String[] args) {
		System.out.println(DateTime.now() + " Starting List Comparison");

		List<String> stringList1 = generateRandomStringList(500000);
		System.out.println(DateTime.now() + " Generated List1 with size: " + stringList1.size());

		List<String> stringList2 = generateRandomStringList(500000);
		System.out.println(DateTime.now() + " Generated List2 with size: " + stringList2.size());

		List<Integer> hashList1 = stringList1.parallelStream().map(string -> string.hashCode()).collect(Collectors.toList());
		System.out.println(DateTime.now() + " Generated HashList1 with size: " + hashList1.size());

		List<Integer> hashList2 = stringList2.parallelStream().map(string -> string.hashCode()).collect(Collectors.toList());
		System.out.println(DateTime.now() + " Generated HashList2 with size: " + hashList2.size());

		Set<String> set1 = new HashSet<>();
		set1.addAll(stringList1);
		System.out.println(DateTime.now() + " Generated Set1 with size: " + set1.size());

		Set<String> set2 = new HashSet<>();
		set2.addAll(stringList2);
		System.out.println(DateTime.now() + " Generated Set2 with size: " + set2.size());

		List<String> stringDiff = new ArrayList<>();
		for (String key : set1) {
			if (!set2.contains(key)) {
				stringDiff.add(key);
			}
		}
		System.out.println(DateTime.now() + " After Comparison List Size: " + stringDiff.size());

		// List<Integer> intersection = new ArrayList<>();
		// for (Integer integer : hashList1) {
		// if (!hashList2.contains(integer)) {
		// intersection.add(integer);
		// }
		// }
		//
		// System.out.println(DateTime.now() + " After Comparison List Size: " + intersection.size());
	}

	private static List<String> generateRandomStringList(int size) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			list.add(RandomStringUtils.randomAlphanumeric(6).toUpperCase());
		}

		return list;
	}
}