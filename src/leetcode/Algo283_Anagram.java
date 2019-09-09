/**
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author naveen
 *
 * @date 30-Jul-2019
 */
public class Algo283_Anagram {

	public static void main(String[] args) {

		String s = "rat";
		String t = "car";
		
		isAnagram(s, t);

		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {

		if (s == null && t == null) {
			return true;
		}

		if (s == null || t == null) {
			return false;
		}

		if (s.length() != t.length()) {
			return false;
		}

		Map<Character, Integer> charCountMap = new HashMap<>();

		for (char c : s.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		for (char c : t.toCharArray()) {

			int count = charCountMap.getOrDefault(c, 0);

			if (count == 0) {
				return false;
			}

			charCountMap.put(c, count - 1);

		}

		return true;
	}
}