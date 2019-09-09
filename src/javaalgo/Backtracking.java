/**
 * 
 */
package javaalgo;

import java.util.Arrays;

/**
 * @author naveen
 *
 * @date 20-Jul-2019
 */
public class Backtracking {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		getBinary(arr.length, arr);
	}

	static void getBinary(int n, int[] arr) {

		System.out.println("received n= " + n + " and arr[] = " + Arrays.toString(arr));

		if (n < 1) {
			System.out.println(Arrays.toString(arr));
		} else {
			arr[n - 1] = 0;
			getBinary(n - 1, arr);

			arr[n - 1] = 1;
			getBinary(n - 1, arr);
		}

	}
}