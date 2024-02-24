package com.dilip.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class FindtextInFile {
	public static void main(String[] args) throws FileNotFoundException {
		String file = "D:\\file.txt";
		Scanner s = new Scanner(new File(file));

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		while (s.hasNextLine()) {
			String nextLine = s.nextLine();
			char ch[] = nextLine.toCharArray();
			for (char c : ch) {
				if (hashMap.containsKey(c)) {
					hashMap.put(c, hashMap.get(c) + 1);
				} else {
					hashMap.put(c, 1);
				}
			}
			System.out.println(hashMap);
			if (nextLine.contains("dilip")) {
				System.out.println("present");
				System.out.println("nextLine" + nextLine);
			} else {
				System.out.println("Not present");
			}
		}
	}
}
