package basics;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * @author Naveen
 *
 * @Date 07-Oct-2016
 */
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println(NumberUtils.isNumber("-123"));
		System.out.println(NumberUtils.isNumber("123"));
		System.out.println(NumberUtils.isNumber("+123"));
		System.out.println(NumberUtils.isNumber("123.2"));
		System.out.println(NumberUtils.isNumber("123d"));

		double amount = 2149.00;
		float rate = 20;
		amount = amount * (1 + (rate / 100));

		System.out.println(amount);
		System.out.println(roundToPlaces(amount, 0));

	}

	/*
	 * public static int main(String[] args) {
	 * System.out.println("HelloWorld");
	 * return 0;
	 * }
	 */

	public static double roundToPlaces(double value, int places) {
		double numberToDivide = 1;
		while (places > 0) {
			numberToDivide *= 10;
			places--;
		}
		double number = Double.valueOf(numberToDivide);
		return Math.round(value * number) / number;
	}
}