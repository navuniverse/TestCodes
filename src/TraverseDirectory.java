import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * Class to find all the pom.xml files in a directory and execute the maven
 * command on each pom file
 * 
 * @author naveen.kumar
 * 
 */
public class TraverseDirectory {

	public static List<String> pomfiles = new ArrayList<String>();

	/**
	 * Method to find all the pom.xml files in given directory
	 * 
	 * @param directoryName
	 *            the directory name
	 * @return the list of pom.xml files
	 */
	public static List<String> listFilesAndFilesSubDirectories(String directoryName) {

		File directory = new File(directoryName);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		if (fList != null) {
			for (File file : fList) {
				String fileName = file.getName();
				if (file.isFile()) {
					// check whether the fileName is pom and of type xml
					if (fileName.equalsIgnoreCase("pom.xml") && (fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()).equalsIgnoreCase("xml"))) {
						pomfiles.add(file.getAbsolutePath());
					}
					// skipping the directories where no pom file can be found
					// or not to be used
				} else if (file.isDirectory() && !(fileName.endsWith("target") || fileName.endsWith("src"))) {
					listFilesAndFilesSubDirectories(file.getAbsolutePath());
				}
			}
		}
		return pomfiles;
	}

	/**
	 * Method to change run the "mvn clean install" command on each pom.xml file
	 * by first changing directory in cmd
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public static void executeMaven(String filePath) throws IOException {
		// changing the command prompt directory and executing mvn clean install
		Process process = Runtime.getRuntime().exec("cmd /c cd /d " + filePath + " && mvn clean install -settings=../settings.xml");

		// printing the execution output to keep track of execution
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s = null;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}
	}

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the arguments
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// getting the list of all valid pom.xml files
		List<String> pomfiles = listFilesAndFilesSubDirectories("E:/BoxTone/BTA-Fullers");

		if (!pomfiles.isEmpty()) {
			for (String pomFile : pomfiles) {
				// executing maven command on each pom files
				pomFile = pomFile.substring(0, pomFile.lastIndexOf("\\"));
				executeMaven(pomFile);
			}
		} else {
			System.out.println("No POM File in your directory!!!!!");
		}
	}

}
