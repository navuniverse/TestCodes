/**
 * 
 */
package basics;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author naveen
 *
 * @date 17-Jun-2017
 */
public class StringOperations {

	public static void main(String[] args) {

		substringFetch("919716554117");
		
		stringConcatenation();
		stringConcatenation("naveen");
	}

	private static void stringConcatenation() {
		String testString = null;
		System.out.println(ObjectUtils.defaultIfNull(testString, StringUtils.EMPTY).concat("hello"));
	}

	private static void stringConcatenation(String testString) {
		System.out.println(ObjectUtils.defaultIfNull(testString, StringUtils.EMPTY).concat("\nhello"));
	}

	private static void substringFetch(String testString) {
		if (testString.length() > 10) {
			testString = testString.substring(testString.length() - 10);
		}
		System.out.println("String with 10 digits: " + testString);
	}
}