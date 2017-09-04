/**
 * 
 */
package basics;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author naveen
 *
 * @date 03-Sep-2017
 */
public class RandomNumberOperations {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			int randomInt = ThreadLocalRandom.current().nextInt(4, 8);

			System.out.println(System.currentTimeMillis() + ": " + randomInt);
		}

	}
}