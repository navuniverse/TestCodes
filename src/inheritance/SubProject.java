/*
 * 3CLogic Inc. CONFIDENTIAL
 * Unpublished Copyright (c) 2007-2014 3CLogic Inc., All Rights Reserved.
 * 
 * NOTICE: All information contained herein is, and remains the property of COMPANY. The intellectual and technical concepts contained
 * herein are proprietary to COMPANY and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained
 * from COMPANY. Access to the source code contained herein is hereby forbidden to anyone except current COMPANY employees, managers or contractors who have executed
 * Confidentiality and Non-disclosure agreements explicitly covering such access.
 * 
 * The copyright notice above does not evidence any actual or intended publication or disclosure of this source code, which includes
 * information that is confidential and/or proprietary, and is a trade secret, of COMPANY. ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC PERFORMANCE,
 * OR PUBLIC DISPLAY OF OR THROUGH USE OF THIS SOURCE CODE WITHOUT THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE
 * LAWS AND INTERNATIONAL TREATIES. THE RECEIPT OR POSSESSION OF THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS
 * TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT MAY DESCRIBE, IN WHOLE OR IN PART.
 */
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
