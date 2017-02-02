/*
 * 3CLogic Inc. CONFIDENTIAL
 * Unpublished Copyright (c) 2007-2014 3CLogic Inc., All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property of COMPANY. The intellectual and technical concepts contained
 * herein are proprietary to COMPANY and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained
 * from COMPANY.  Access to the source code contained herein is hereby forbidden to anyone except current COMPANY employees, managers or contractors who have executed 
 * Confidentiality and Non-disclosure agreements explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication or disclosure  of  this source code, which includes  
 * information that is confidential and/or proprietary, and is a trade secret, of  COMPANY.   ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, 
 * OR PUBLIC DISPLAY OF OR THROUGH USE  OF THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE 
 * LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
 * TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.                
 */
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
					System.out.println("After rotation: " + (i + 1) + "-" + count + " :: " + Arrays.toString(arrayToRotate) + ", temp= " + temp
							+ ", j= " + j + ", k= " + k);
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
