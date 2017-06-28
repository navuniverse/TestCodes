/**
 * 
 */
package basics;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author naveen
 *
 * @date 28-Jun-2017
 */
public class NumberOperations {

	public static void main(String[] args) {

		double amount = 12345.12;

		Locale locale = new Locale("en", "in");
		System.out.println(NumberFormat.getCurrencyInstance(locale).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount));
	}
}
