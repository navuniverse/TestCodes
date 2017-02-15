package inheritance;

/**
 * @author Naveen
 * 
 * @Date 29-Jun-2016
 */
public class Project {

	public Project() {
		System.out.println("Project Called");
	}

	public void myProject(String name) {
		System.out.println("This is Project: " + name);
	}

	public static void myStaicProject(String name) {
		System.out.println("This is Static Project: " + name);
	}

	public final void myFinalProject(String name) {
		System.out.println("This is Final Project: " + name);
	}
}
