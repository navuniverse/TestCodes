import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Naveen
 *
 * @Date 28-Dec-2015
 */
public class TestFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Naveen\\Desktop\\new 4.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "", metadataFileText = "";
		while ((line = reader.readLine()) != null) {
			metadataFileText += line + "\r\n";
		}
		reader.close();
		System.out.println("file reading completed");
		FileWriter writer = new FileWriter(file);
		writer.write(metadataFileText.replaceAll("!-METADATA_SCHEMA-!", "metadata"));
		writer.close();
		System.out.println("file content replaced");

	}

}
