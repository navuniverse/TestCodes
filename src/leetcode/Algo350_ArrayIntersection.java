/**
 * 
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author naveen
 *
 * @date 30-Jul-2019
 */
public class Algo350_ArrayIntersection {

	public static void main(String[] args) {

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		if (nums1.length > 0 && nums2.length > 0) {
			int[] out = intersect(nums1, nums2);

			System.out.println(Arrays.toString(out));
		}
	}

	private static int[] intersect(int[] nums1, int[] nums2) {

		if (nums1.length == 0 || nums2.length == 0) {
			return new int[] {};
		}

		Map<Integer, Integer> numbersMap = new HashMap<>();

		for (int i = 0; i < nums1.length; i++) {
			numbersMap.put(nums1[i], numbersMap.getOrDefault(nums1[i], 0) + 1);
		}

		List<Integer> duplicates = new ArrayList<>();

		for (int i = 0; i < nums2.length; i++) {

			Integer count = numbersMap.get(nums2[i]);

			if (count != null && count > 0) {
				numbersMap.put(nums2[i], count - 1);
				duplicates.add(nums2[i]);
			}
		}

		int[] out = new int[duplicates.size()];
		int i = 0;

		for (Integer num : duplicates) {

			out[i++] = num;

		}

		return out;

	}
}