
package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen
 * 
 * @Date 29-Jun-2016
 */
public class SubProject extends Project {

	private String child = "child";

	public SubProject() {
		System.out.println("SubProject Called");
	}

	public void myProject(String name) {
		System.out.println("This is Sub-Project: " + name);
	}

	public static void myStaicProject(String name) {
		System.out.println("This is Static Sub-Project: " + name);
	}

	public String getChild() {
		return child;
	}

	public void setChild(String child) {
		this.child = child;
	}

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Project projectSub = new SubProject();
		projectSub.myProject("Inherit");
		projectSub.myStaicProject("Inherit");
		projectSub.myFinalProject("Inherit");

		Project project = new Project();
		project.myProject("Base");
		project.myStaicProject("Base");
		project.myFinalProject("Base");

		SubProject subProject = new SubProject();
		subProject.myProject("Child");
		subProject.myStaicProject("Child");
		subProject.myFinalProject("Child");
		subProject.setChild("sub");

		List<Project> projects = new ArrayList<Project>();
		projects.add(project);
		projects.add(subProject);
		projects.add(projectSub);

		for (Project project2 : projects) {
			if (project2 instanceof SubProject) {
				SubProject subProject2 = (SubProject) project2;
				System.out.println("true: " + subProject2.getChild());
			}
		}

		// Compilation Error
		// SubProject subProj = new Project();

	}

}
