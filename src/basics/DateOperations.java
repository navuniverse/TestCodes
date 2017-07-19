/**
 * 
 */
package basics;

import java.text.ParseException;
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

	public static void main(String[] args) throws Exception {

		timezoneOperations();

		dateOperations();

		calendarOperations();
		
		localDateOperations();
	}

	private static void localDateOperations() throws InterruptedException {
		Date date = new Date(DateTime.now(DateTimeZone.forID("Asia/Kolkata")).getMillis());

		System.out.println(date);

		org.joda.time.LocalDate localDate = org.joda.time.LocalDate.fromDateFields(date);

		System.out.println("LocalDate1: " + localDate);

		Thread.sleep(100);
		Date date2 = new Date(DateTime.now(DateTimeZone.forID("Asia/Kolkata")).getMillis());

		System.out.println(date2);

		org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.fromDateFields(date);

		System.out.println("LocalDate2: " + localDate2);

		System.out.println(localDate.equals(localDate2));
	}

	private static void timezoneOperations() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String stringdate = sdf.format(date);
		System.out.println(stringdate);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		date = dateFormat.parse(stringdate);

		System.out.println(date);

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