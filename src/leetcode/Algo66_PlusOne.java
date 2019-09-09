/**
 * 
 */
package leetcode;

import java.util.Arrays;

/**
 * @author naveen
 *
 * @date 30-Jul-2019
 */
public class Algo66_PlusOne {

	public static void main(String[] args) {

		int[] nums = { 9, 9, 9 };

		if (nums.length > 0) {
			int[] out = plusOne(nums);

			System.out.println(Arrays.toString(out));
		}
	}

	public static int[] plusOne(int[] nums) {

		int digits = 0;
		int number = 0;
		int carry = 0;

		boolean allNine = false;

		for (int i = 0; i < nums.length; i++) {

			if (digits == 0) {
				if (nums[i] == 9) {
					allNine = true;
				}
			} else {
				allNine &= (nums[i] == 9 && allNine);
			}

			digits++;
		}

		if (allNine) {
			digits++;
		}

		int[] out = new int[digits];

		for (int i = nums.length - 1; i >= 0; i--) {

			if (i == nums.length - 1) {
				number = nums[i] + 1;
			} else {
				number = nums[i] + carry;
			}

			System.out.println("Number: " + number);

			out[digits - 1] = number % 10;

			carry = number / 10;

			System.out.println("Number: " + number + ", Carry: " + carry + ", Digits: " + digits);

			digits--;

			System.out.println("Digits After: " + digits);
		}

		if (digits == 1) {

			if (number > 9) {
				out[digits - 1] = carry;
			} else {
				out[digits - 1] = number;
			}
		}

		return out;

	}
}