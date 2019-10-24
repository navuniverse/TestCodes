import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * 
 */

/**
 * @author naveen
 *
 * @date 29-Aug-2019
 */
public class SessionGenerator {

	public static void main(String[] args) {

		List<String> names =
				Arrays.asList(
						"Ankit Jindal",
						"Akshit",
						"Deepchand",
						"Diwakar",
						"Gaurav",
						"Govind",
						"Jai Singh",
						"Jitin",
						"Khushboo",
						"Kuldeep",
						"Mayank",
						"Naveen Kumar",
						"Pranav",
						"Rajesh",
						"Rajkumar",
						"Rohit Gupta",
						"Sahil",
						"Shivam",
						"Sudhanshu",
						"Vaibhav",
						"Vibhav",
						"Yatin");

		LocalDate startDate = LocalDate.of(2019, Month.SEPTEMBER, 12);

		int size = names.size();

		Set<String> processed = new HashSet<>();

		System.out.println("Thought Day - - - -  Person");

		while (size > 0) {

			String name = names.get(new Random().nextInt(names.size()));

			while (!processed.add(name)) {
				name = names.get(new Random().nextInt(names.size()));
			}

			System.out.println(startDate + "  - - - -  " + name);

			startDate = startDate.plusDays(7);
			size--;

		}

	}

}