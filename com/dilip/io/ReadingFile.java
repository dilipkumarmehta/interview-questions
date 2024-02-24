package com.dilip.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ReadingFile {

	public static void main(String[] args) {
		String path = "D:\\myfiles\\hello.txt";

		File file = new File(path);
		wordCount(file);
	}

	public static void wordCount(File file) {
		InputStream ist;
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			ist = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(ist));
			String line = "";
			while ((line = br.readLine()) != null) {
				// s System.out.println(line);
				String str[] = line.toLowerCase().split("\\s");
				for (int i = 0; i < str.length; i++) {
					if (map.containsKey(str[i])) {
						map.put(str[i], map.get(str[i]) + 1);
					}
					if (!map.containsKey(str[i])) {
						map.put(str[i], 1);
					}
				}
				System.out.println(map);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}