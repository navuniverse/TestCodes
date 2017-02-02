/**
 * 
 */
package functional;

/**
 * @author naveen
 *
 */
public class FunctionalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = null;// "lambda";

		/*
		 * While using lambda functions, we have to provide the body of the abstract method from FunctionInterface and then we can use it anywhere.
		 * We don't have to worry about the methods which we have declared as "default" return type.
		 * For more details about Lambda Expressions - http://www.journaldev.com/2763/java-8-functional-interfaces
		 */
		callLamda((n) -> {
			return n != null;
		}, name);
	}

	public static void callLamda(LamdaFunction function, String name) {
		/*
		 * Using both methods of FunctionInterface here.
		 * The implementation of showMe() is provided in main() method while calling callLambda() method.
		 * The implementation of printMe() is provided in FunctionalInterface only with "default" type.
		 */
		if (function.showMe(name)) {
			function.printMe(name);
		} else {
			function.printMe("InvalidName");
		}
	}

}
