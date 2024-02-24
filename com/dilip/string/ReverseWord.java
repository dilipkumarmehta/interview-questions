package com.dilip.string;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Java is best programming languag";
		String[] st = str.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			// System.out.print(st[i]);/
			show(st[i]);
			// System.out.print(" ");
		}
	}

	public static void show(String s) {
		int l = s.length()-1;
		
		for (int i = l; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print("\t");
	}
}
