/**
 * 
 */
package basics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * @author naveen
 *
 * @date 23-Jun-2017
 */
public class DateOperations {

	public static void main(String[] args) {

		timezoneOperations();

		dateOperations();

		calendarOperations();
	}

	private static void timezoneOperations() {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

		Date date = new Date();
		System.out.println(sdf.format(date));

	}

	private static void dateOperations() {
		Date date = new Date(DateTime.now(DateTimeZone.forID("Asia/Kolkata")).getMillis() - 15 * 60000);

		System.out.println(date);

		System.out.println(DateTime.now(DateTimeZone.forID("Asia/Kolkata")).getMillis());

		System.out.println(System.currentTimeMillis());
	}

	private static void calendarOperations() {
		String day = "5";
		String month = "8";
		String year = "2015";

		LocalDate localDate = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
		System.out.println(localDate.getDayOfWeek());
	}
}