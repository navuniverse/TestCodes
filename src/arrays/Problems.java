/*
 * 3CLogic Inc. CONFIDENTIAL
 * Unpublished Copyright (c) 2007-2014 3CLogic Inc., All Rights Reserved.
 *
 * NOTICE:  All information contained herein is, and remains the property of COMPANY. The intellectual and technical concepts contained
 * herein are proprietary to COMPANY and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained
 * from COMPANY.  Access to the source code contained herein is hereby forbidden to anyone except current COMPANY employees, managers or contractors who have executed 
 * Confidentiality and Non-disclosure agreements explicitly covering such access.
 *
 * The copyright notice above does not evidence any actual or intended publication or disclosure  of  this source code, which includes  
 * information that is confidential and/or proprietary, and is a trade secret, of  COMPANY.   ANY REPRODUCTION, MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, 
 * OR PUBLIC DISPLAY OF OR THROUGH USE  OF THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, AND IN VIOLATION OF APPLICABLE 
 * LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF  THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
 * TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.                
 */
package arrays;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.xerces.parsers.DOMParser;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author Naveen
 * 
 * @Date 14-Jul-2016
 */
public class Problems {

	static Scanner scanner = new Scanner(System.in);

	private static void occurenceInArrayCount(Integer[][] arrays) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer[] mainArray : arrays) {
			Set<Integer> distinctNumbers = new HashSet<Integer>(Arrays.asList(mainArray));
			for (Integer element : distinctNumbers) {
				if (map.containsKey(element)) {
					map.put(element, map.get(element) + 1);
				} else {
					map.put(element, 1);
				}
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	private static void sumInArray() {
		int sum = 0;
		int size = 0;
		sum = scanner.nextInt();
		size = scanner.nextInt();
		Integer[] numbers = new Integer[size];
		int i = 0;
		while (scanner.hasNext() && i < size) {
			numbers[i] = scanner.nextInt();
			i++;
		}
		Arrays.sort(numbers);
		i = 0;
		int j = size - 1;
		while (i < j) {
			if (numbers[i] + numbers[j] == sum) {
				System.out.println(1);
				break;
			} else if (numbers[i] + numbers[j] < sum) {
				i += 1;
			} else if (numbers[i] + numbers[j] > sum) {
				j -= 1;
			}
		}
	}

	private static void numberEncoding() {
		int i = 0;
		String string = scanner.nextLine();
		Integer[] integers = {};
		if (string != null && !string.isEmpty()) {
			String[] tokens = string.split(" ");
			if (tokens != null && tokens.length > 0) {
				integers = new Integer[tokens.length];
				for (String token : tokens) {
					integers[i] = Integer.valueOf(token);
					i++;
				}
			}
		}
		for (i = 0; i < integers.length; i++) {
			if (i == 0) {
				System.out.print(integers[i] + " ");
			}
			if (i > 0) {
				int diff = integers[i] - integers[i - 1];
				if (diff > 127 || diff < -127) {
					System.out.print(-128 + " ");
				}
				System.out.print(integers[i] + " ");
			}
		}

	}

	private static void polygonCheck() {
		int size = 0;
		int i = 0;

		List<String> strings = new ArrayList<String>();
		while (scanner.hasNext() && size < 5) {
			strings.add(scanner.nextLine());
			size++;
		}
		Integer[] integers = {};
		int squares = 0, rectangles = 0, polygons = 0;
		long side1, side2, side3, side4;
		if (strings != null && !strings.isEmpty()) {
			for (String string : strings) {
				String[] tokens = string.split(" ");
				if (tokens != null && tokens.length > 0) {
					integers = new Integer[tokens.length];
					for (i = 0; i < tokens.length; i++) {
						integers[i] = Integer.valueOf(tokens[i]);
					}
					side1 = integers[0];
					side2 = integers[1];
					side3 = integers[2];
					side4 = integers[3];
					if (side1 != side2) {
						if (side1 != side3) {
							if (side1 != side4) {
								polygons++;
							} else if (side2 != side3) {
								polygons++;
							} else {
								rectangles++;
							}
						} else if (side2 != side4) {
							polygons++;
						} else {
							rectangles++;
						}
					} else if (side1 != side3) {
						if (side3 != side4) {
							polygons++;
						} else {
							rectangles++;
						}
					} else if (side1 != side4) {
						polygons++;
					} else {
						squares++;
					}
				}
			}
		}
		System.out.println(squares + " " + rectangles + " " + polygons);
	}

	private static void parseLog(JSONArray jsonArray) {
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

	private static void readString() {
		String string = scanner.nextLine();
		System.out.println(string);
	}

	/**
	 * Constraints: 0 <= a,b <= 50 & 1 <= n <= 15
	 * 
	 * Pattern: (a + pow(2,0) * b) + (a + pow(2,0) * b + pow(2,1) * b) + ....+ (a + pow(2,0) * b + pow(2,1) * b +....+ pow(2,n-1) * b)
	 */
	private static void recursiveList() {
		int testCases = scanner.nextInt();
		int[] arrA = new int[testCases];
		int[] arrB = new int[testCases];
		int[] arrN = new int[testCases];
		String output = "";
		for (int i = 0; i < testCases; i++) {
			arrA[i] = scanner.nextInt();
			arrB[i] = scanner.nextInt();
			arrN[i] = scanner.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			int currentSum = 0;
			int lastSum = 0;
			int counter = 0;
			while (counter < arrN[i]) {
				currentSum = (int) Math.pow(2, counter) * arrB[i];
				output += (lastSum + currentSum + arrA[i]) + " ";
				lastSum += currentSum;
				++counter;
			}
			output += " \n";
		}
		System.out.println(output);
	}

	private static void readEOFString() {
		String line = null;
		String output = "";
		int lineNumber = 0;
		while (scanner.hasNextLine()) {
			line = scanner.nextLine();
			if (line == null || line.isEmpty()) {
				break;
			}
			output += ++lineNumber + " " + line + "\n";
		}
		System.out.println(output);
	}

	private static void patternMatcher(String username) {
		String string = "(^([A-Za-z]\\w{7,29})\\b$)";
		Pattern pattern = Pattern.compile(string);
		Matcher matcher = pattern.matcher(username);
		if (matcher.find()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	private static void domParser(String input) {
		String output = "";
		try {
			DOMParser parser = new DOMParser();
			parser.parse(new InputSource(new StringReader(input)));
			Document document = parser.getDocument();
			output += document.getDocumentElement().getTextContent() + "\n";
		} catch (SAXException | IOException e) {
			output += "None\n";
			e.printStackTrace();
		}
		System.out.println(output);
	}

	private static void lexicographicCompare(String inputString, int substringLength) {
		String[] substringArray = new String[inputString.length() - substringLength + 1];
		for (int i = 0; i < inputString.length() - substringLength + 1; i++) {
			substringArray[i] = inputString.substring(i, i + substringLength);
		}
		if (substringArray.length > 0) {
			Arrays.sort(substringArray);
			/* Lexicographic highest */
			System.out.println(substringArray[0]);
			/* Lexicographic lowest */
			System.out.println(substringArray[substringArray.length - 1]);
		}
	}

	private static void palindromeCheck(String inputString) {
		String output = "No";
		if (inputString != null && inputString.length() > 0) {
			if (inputString.equals(new StringBuilder(inputString).reverse().toString())) {
				output = "Yes";
			}
		}
		System.out.println(output);
	}

	private static void stringBasics(String inputString1, String inputString2) {
		String output = inputString1.length() + inputString2.length() + "\n";
		if (inputString1.compareTo(inputString2) > 0) {
			output += "Yes\n";
		} else {
			output += "No\n";
		}
		output += inputString1.substring(0, 1).toUpperCase().concat(inputString1.substring(1)) + " "
				+ inputString2.substring(0, 1).toUpperCase().concat(inputString2.substring(1));
		System.out.println(output);
	}

	private static void findSubstrings(String s) {
		if (s != null && !s.isEmpty()) {
			List<String> vowels = new ArrayList<String>() {
				private static final long serialVersionUID = -7351751579312488683L;

				{
					add("a");
					add("e");
					add("i");
					add("o");
					add("u");
				}
			};
			char[] stringArray = s.toCharArray();

			String maxString = null;
			String minString = null;

			List<Integer> vowelOccurences = new ArrayList<Integer>();
			List<Integer> consonentOccurences = new ArrayList<Integer>();
			for (int i = 0; i < stringArray.length; i++) {
				if (vowels.contains(String.valueOf(stringArray[i]))) {
					vowelOccurences.add(i);
				} else {
					consonentOccurences.add(i);
				}
			}
			for (Integer vowelOccur : vowelOccurences) {
				for (Integer consonentOccu : consonentOccurences) {
					if (consonentOccu > vowelOccur) {
						if (null == maxString && null == minString) {
							maxString = s.substring(vowelOccur, consonentOccu + 1);
							minString = s.substring(vowelOccur, consonentOccu + 1);
						}

						if (maxString.compareTo(s.substring(vowelOccur, consonentOccu + 1)) < 0) {
							maxString = s.substring(vowelOccur, consonentOccu + 1);
						}

						if ((s.substring(vowelOccur, consonentOccu + 1)).compareTo(minString) < 0) {
							minString = s.substring(vowelOccur, consonentOccu + 1);
						}
					}
				}

			}

			System.out.println(minString);
			System.out.println(maxString);

		}
	}

	/**
	 * The main method to call the required methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Integer arrays[][] = { { 6, 2, 2, 0, 4 }, { 5, 0, 2, 6, 7, 1 }, { 6, 7, 9, 9 } };
		occurenceInArrayCount(arrays);

		JSONArray jsonArray = new JSONArray(
				"[{ 'user': 'A', 'page': 1},{ 'user': 'B', 'page': 5},{ 'user': 'A', 'page': 2},{ 'user': 'A', 'page': 1},{ 'user': 'B', 'page': 2},{ 'user': 'C', 'page': 7},{ 'user': 'C', 'page': 3},{ 'user': 'A', 'page': 3},{ 'user': 'C', 'page': 1},]");
		parseLog(jsonArray);

		sumInArray();

		numberEncoding();

		polygonCheck();

		readString();

		recursiveList();

		readEOFString();

		patternMatcher("Swakk5659._harbujklniblju");

		domParser("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");

		lexicographicCompare("welcometojava", 3);

		palindromeCheck("madam");

		stringBasics("java", "java");

		findSubstrings("aba");
	}

	class Comparator {

		public boolean compare(String string1, String string2) {
			return (string1.equals(string2));
		}

		public boolean compare(int int1, int int2) {
			return (int1 == int2) ? true : false;
		}

		public boolean compare(int[] array1, int[] array2) {
			boolean same = false;
			if (array1.length == array2.length) {
				same = true;
				for (int i = 0; i < array1.length; i++) {
					if (array1[i] != array2[i]) {
						same = false;
						break;
					}
				}
			}
			return same;

		}
	}
}
