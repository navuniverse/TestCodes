package arrays;

import java.util.Arrays;

/**
 * @author Naveen
 * 
 * @Date 01-Oct-2016
 */
public class CharArray {

	public static char[] reverse(char[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			char temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("OriginalArray = " + Arrays.toString(array));
		char[] reverseArray = reverse(array);
		System.out.println("ReversedArray = " + Arrays.toString(reverseArray));

	}

}