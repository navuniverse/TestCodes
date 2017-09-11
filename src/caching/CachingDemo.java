/**
 * 
 */
package caching;

import java.util.concurrent.ConcurrentMap;

import org.joda.time.DateTime;

import com.google.gson.Gson;

/**
 * @author naveen
 *
 * @date 04-Sep-2017
 */
public class CachingDemo {

	public static void main(String[] args) throws InterruptedException {

		Gson gson = new Gson();

		HazelcastConfig hazelcastConfig = new HazelcastConfig();

		ConcurrentMap<String, String> concurrentMap = hazelcastConfig.tabletMetricsUpdatedMap();

		concurrentMap.put("one", "1");

		System.out.println(DateTime.now() + ": Map Data" + gson.toJson(concurrentMap));

		concurrentMap.put("two", "2");

		System.out.println(DateTime.now() + ": Map Data" + gson.toJson(concurrentMap));

		concurrentMap.put("three", "3");

		System.out.println(DateTime.now() + ": Map Data" + gson.toJson(concurrentMap));

		System.out.println(DateTime.now() + ": Map Value : " + concurrentMap.get("one"));

		System.out.println(DateTime.now() + ": Again: " + concurrentMap.get("one"));
	}
}