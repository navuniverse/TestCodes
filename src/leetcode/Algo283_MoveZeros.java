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
public class Algo283_MoveZeros {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		if (nums.length > 1) {
			moveZeroes(nums);

			System.out.println(Arrays.toString(nums));
		}
	}

	public static void moveZeroes(int[] nums) {

		int lastValidIndex = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				int temp = nums[lastValidIndex];
				nums[lastValidIndex] = nums[i];
				nums[i] = temp;
				lastValidIndex++;
			}
		}
	}
}