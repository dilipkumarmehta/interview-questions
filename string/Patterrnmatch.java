package com.dilip.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patterrnmatch {

	public static void main(String[] args) {
		String string = "ababbabbab";
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher(string);
		while (m.find()){
			System.out.println("Found [" + m.group() + "] starting at " + m.start() + " and ending at " + (m.end() - 1));

		}

	}

}
