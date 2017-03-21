/**
 * 
 */
package oops;

import java.lang.instrument.Instrumentation;

/**
 * @author naveen
 *
 * @date 15-Mar-2017
 */
public class ObjectSizeFetcher {

	private static Instrumentation instrumentation;

	public static void premain(String args, Instrumentation inst) {
		instrumentation = inst;
	}

	public static long getObjectSize(Object object) {
		return instrumentation.getObjectSize(object);
	}
}