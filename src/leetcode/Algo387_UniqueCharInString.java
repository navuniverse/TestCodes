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
public class Algo387_UniqueCharInString {

	public static void main(String[] args) {

		String s = "l";

		int index = firstUniqChar(s);

		System.out.println("Index: " + index);
	}

	public static int firstUniqChar(String s) {

		int index = -1;

		if (s == null || s.length() == 0) {
			return index;
		}

		if (s.length() == 1) {
			return 0;
		}

		Map<Character, Boolean> charRepeatMap = new HashMap<>();

		char[] chars = s.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			charRepeatMap.put(chars[i], charRepeatMap.get(chars[i]) != null);
		}

		for (int i = 0; i < chars.length; i++) {

			if (!charRepeatMap.get(chars[i])) {
				index = i;
				break;
			}
		}

		return index;
	}
}