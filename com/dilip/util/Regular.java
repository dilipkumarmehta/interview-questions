package com.dilip.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
	public static void main(String[] args) {

		// String s = "ababscdfabadsfsavabdfabdfaaaaabab";
		String s = "abababababaababavaakjoeiielkjvnvcnlkjdefiue;ldfa;dfpoelfdlkd";

		String reg = "ab";
		Pattern p = Pattern.compile(reg);
		Matcher matcher = p.matcher(s);
		while (matcher.find()) {
			System.out.println(matcher.start() + "\t" + matcher.group() + "\t" + matcher.end());
		}

		String str = "abababababaababavaakjoeiielkjvnvcnlkjdefiue;ldfa;dfpoelfdlkd";
		String reg1 = "ab";
		Pattern p1 = Pattern.compile(str);
		Matcher m = p1.matcher(reg1);
		while (m.find()) {
			System.out.println(m.start() + "\t" + m.end() + m.group());
		}

	}
}
