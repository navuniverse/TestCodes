/**
 * 
 */
package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author naveen
 *
 * @date 02-May-2017
 */
public class LogParser {

	public static void main(String[] args) {
		JSONArray jsonArray = new JSONArray(
				"[{ 'user': 'A', 'page': 1},{ 'user': 'B', 'page': 5},{ 'user': 'A', 'page': 2},{ 'user': 'A', 'page': 1},{ 'user': 'B', 'page': 2},{ 'user': 'C', 'page': 7},{ 'user': 'C', 'page': 3},{ 'user': 'A', 'page': 3},{ 'user': 'C', 'page': 1},]");

		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < jsonArray.length(); i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			List<Integer> tlist = map.get(jsonObject.get("user"));
			if (tlist == null) {
				tlist = new ArrayList<Integer>();
				map.put((String) jsonObject.get("user"), tlist);
			}
			tlist.add((Integer) jsonObject.get("page"));
		}
		System.out.println(map);
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
			List<Integer> list = entry.getValue();
			for (int j = 0; j < list.size() - 1; j++) {
				if (j + 1 < list.size()) {
					String str = map1.get(list.get(j));
					if (str != null) {
						str = str + "," + String.valueOf(list.get(j + 1));
						map1.put(list.get(j), str);
					} else {
						map1.put(list.get(j), String.valueOf(list.get(j + 1)));
					}
				}
			}
		}
		System.out.println(map1);
	}
}
