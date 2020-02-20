package com.dilip.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateChar {
	public static void main(String[] args) {
		String str = "Programminggg";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				}
			}
		}
		for (Entry<Character, Integer> it : map.entrySet()) {
			if (it.getValue() > 1) {
				System.out.println(it.getKey() + "\t" + it.getValue());
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

	}
}
