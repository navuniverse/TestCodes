/**
 * 
 */
package oops;

/**
 * @author naveen
 *
 * @date 15-Feb-2017
 */
public class AccessCheck {

	public AccessCheck() {
		System.out.println("Constructor");
	}

	public static final synchronized void main(String[] args) {
		System.out.println("Main");
	}

}