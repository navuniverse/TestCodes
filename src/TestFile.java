import java.io.IOException;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

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
		// File file = new File("C:\\Users\\Naveen\\Desktop\\new 4.txt");
		// BufferedReader reader = new BufferedReader(new FileReader(file));
		// String line = "", metadataFileText = "";
		// while ((line = reader.readLine()) != null) {
		// metadataFileText += line + "\r\n";
		// }
		// reader.close();
		// System.out.println("file reading completed");
		// FileWriter writer = new FileWriter(file);
		// writer.write(metadataFileText.replaceAll("!-METADATA_SCHEMA-!", "metadata"));
		// writer.close();
		// System.out.println("file content replaced");

		long time = DateTime.now(DateTimeZone.forID("Asia/Kolkata")).getMillis()/1000;
		String currentTimestamp = String.valueOf(time);
		System.out.println(currentTimestamp);

		// Gson gson = new Gson();
		// Date date = new Date();
		// System.out.println(date);
		//
		// System.out.println(gson.toJson(date));
		//
		// try {
		// SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
		// Date parsedDate = dateFormat.parse("2017-03-31 16:30:33");
		// System.out.println(parsedDate);
		// } catch (ParseException e) {
		// e.printStackTrace();
		// }
		//
		// LocalDate localDate = LocalDate.parse("2016-04-01");
		// System.out.println(localDate);
		// System.out.println(localDate.toString());
	}

}
