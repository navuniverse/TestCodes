/**
 * 
 */
package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author naveen
 *
 * @date 22-Mar-2018
 */
public class Streaming {

	public static void main(String[] args) {

		// long map4PopulationStart = System.currentTimeMillis();
		streamMap();
		parrallelStream();
		foEach();
		classicForLopp();

		// long map4PopulationEnd = System.currentTimeMillis();
		// System.out.println("Time Populatated in: " + (map4PopulationEnd - map4PopulationStart));
	}

	private static void classicForLopp() {
		List<Integer> integers = populateValues();

		Map<String, Integer> map4 = new HashMap<>();
		long map4PopulationStart = System.currentTimeMillis();
		System.out.println("ForMap4 Populating");
		for (Integer i : integers) {
			map4.put(String.valueOf(i), i);
		}
		long map4PopulationEnd = System.currentTimeMillis();
		System.out.println("ForMap4 Populatated in: " + (map4PopulationEnd - map4PopulationStart));
		integers = null;

	}

	private static void foEach() {
		List<Integer> integers = populateValues();

		Map<String, Integer> map1 = new HashMap<>();
		long map1PopulationStart = System.currentTimeMillis();
		System.out.println("ForEachMap1 Populating");
		integers.forEach(i -> map1.put(String.valueOf(i), i));
		long map1PopulationEnd = System.currentTimeMillis();
		System.out.println("ForEachMap1 Populatated in: " + (map1PopulationEnd - map1PopulationStart));
		integers = null;
		map1.clear();
	}

	private static void parrallelStream() {
		List<Integer> integers = populateValues();

		Map<String, Integer> map3 = new HashMap<>();
		long map3PopulationStart = System.currentTimeMillis();
		System.out.println("ParallelStreamMap3 Populating");
		map3 = integers.parallelStream().collect(Collectors.toMap(k -> String.valueOf(k), v -> v));
		long map3PopulationEnd = System.currentTimeMillis();
		System.out.println("ParallelStreamMap3 Populatated in: " + (map3PopulationEnd - map3PopulationStart));
		integers = null;
	}

	private static void streamMap() {
		List<Integer> integers = populateValues();
		Map<String, Integer> map2 = new HashMap<>();
		long map2PopulationStart = System.currentTimeMillis();
		System.out.println("Stream Map2 Populating");
		map2 = integers.stream().collect(Collectors.toMap(k -> String.valueOf(k), v -> v));
		long map2PopulationEnd = System.currentTimeMillis();
		System.out.println("Stream Map2 Populatated in: " + (map2PopulationEnd - map2PopulationStart));
		integers = null;
	}

	private static List<Integer> populateValues() {
		List<Integer> integers = new ArrayList<>();

		long startTime = System.currentTimeMillis();
		System.out.println("List Populating: " + startTime);

		for (int i = 0; i < 10000000; i++) {
			integers.add(i);
		}

		long populationTime = System.currentTimeMillis();
		System.out.println("List Populated In: " + (populationTime - startTime));
		return integers;
	}
}