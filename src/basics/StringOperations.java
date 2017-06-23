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

		stringCocatenation();
		stringCocatenation("naveen");
	}

	private static void stringCocatenation() {
		String testString = null;
		System.out.println(ObjectUtils.defaultIfNull(testString, StringUtils.EMPTY).concat("hello"));
	}

	private static void stringCocatenation(String testString) {
		System.out.println(ObjectUtils.defaultIfNull(testString, StringUtils.EMPTY).concat("\nhello"));
	}
}