package com.dilip.string;

public class duplicate {
	public static void main(String[] args) {
		String s[] = "dilip".split("");
		System.out.println("dfds");
		for (String s1 : s) {
			int len = 0;
			for (int i = 0; i < s.length - 1; i++) {
				if (s[i].equals(s1)) {
					len++;
				}
			}
			if (len > 1) {
				System.out.println("duplicate elements" + s1);
			}
		}
	}
}
