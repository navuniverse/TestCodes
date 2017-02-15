package arrays;

import java.util.Arrays;

/**
 * @author Naveen
 * 
 * @Date 29-Jun-2016
 */
public class RotateArray {

	public static void leftRotate(int[] arrayToRotate, int rotateByIndexes) {
		if (arrayToRotate != null && arrayToRotate.length > 0) {
			int sizeOfArray = arrayToRotate.length;
			int gcd = gcd(rotateByIndexes, sizeOfArray);
			int temp = arrayToRotate[0];
			int i, j, k, count;
			for (i = 0; i < gcd; i++) {
				temp = arrayToRotate[i];
				j = i;
				count = 0;
				while (true) {
					count++;
					k = j + rotateByIndexes;
					if (k >= sizeOfArray) {
						k = k - sizeOfArray;
					}
					if (k == i) {
						break;
					}
					arrayToRotate[j] = arrayToRotate[k];
					System.out.println("After rotation: " + (i + 1) + "-" + count + " :: " + Arrays.toString(arrayToRotate) + ", temp= " + temp + ", j= " + j + ", k= " + k);
					j = k;

				}
				arrayToRotate[j] = temp;
				System.out.println("After rotation: " + (i + 1) + " :: " + Arrays.toString(arrayToRotate));
			}
		}
	}

	public static int gcd(int number1, int number2) {
		if (number2 == 0) {
			return number1;
		} else {
			return gcd(number2, number1 % number2);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Initial Array :: " + Arrays.toString(array));
		leftRotate(array, 3);
		System.out.println("Final Array :: " + Arrays.toString(array));

	}

}
