package com.dilip.string;

public class StringQuestion {
	public static void main(String[] args) {
		String ss = "dilipfjdkfjdk dilip kumar mehta dilip kumar";
		int i = 0, j = ss.length();
		char ch = '0';
		int a[] = new int[123];
		while (i < j) {
			ch = ss.charAt(i++);
			a[ch] += 1;
		}
		i = 0;
		while (i < 123) {
			if (a[i] >= 1) {
				System.out.println((char) i + "\t" + a[i]);
			}
			i++;
		}
	}
}