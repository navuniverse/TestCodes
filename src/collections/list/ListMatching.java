/**
 * 
 */
package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * @author naveen
 *
 * @date 06-Jun-2017
 */
public class ListMatching {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("cde");
		list.add("bcd");

		List<String> list2 = new ArrayList<>();
		list2.add("bcd");
		list2.add("cde");

		if (!Collections.disjoint(list, list2)) {
			System.out.println("true by disjoint");
		} else {
			System.out.println("false by disjoint");
		}

		if (CollectionUtils.containsAny(list, list2)) {
			System.out.println("true by contains any");
		} else {
			System.out.println("false by contains any");
		}

	}
}