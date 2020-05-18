package org.capg.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LongestOccuringChar {

	public static void FindLongestOccuringChar(String str) {
		if (!str.isEmpty() && str != null) {
			String noSpaceStr = str.replaceAll("\\s", "");
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			ArrayList<Character> indexAl = new ArrayList<Character>();

			for (int i = 0; i < noSpaceStr.length(); i++) {
				char sChar = noSpaceStr.charAt(i);
				indexAl.add(sChar);

				int index = noSpaceStr.indexOf(sChar);

				if (hm.containsKey(sChar)) {
					hm.put(sChar, hm.get(sChar) + 1);
				} else

					hm.put(sChar, 1);

			}

			int maxOccurrences = Collections.max(hm.values());

			Set<Map.Entry<Character, Integer>> es = hm.entrySet();
			for (Map.Entry<Character, Integer> e : es) {
				if (e.getValue() == maxOccurrences) {
					System.out.println("char is: "  + e.getKey() + " Occurence is: " + e.getValue() + " " + " index is : "
							+ indexAl.indexOf(e.getKey()));
				}
			}

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input string");
		String str = s.next();
		// String str="aabbb bbcc";
		FindLongestOccuringChar(str);
	}

}
