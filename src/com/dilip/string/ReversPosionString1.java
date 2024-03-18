package com.dilip.string;

public class ReversPosionString1 {
	public static void main(String[] args) {

		String s = "dilip kumar mehta dilip how are you";
		String[] split = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : split) {

			String newstr=null;
			if (str.equals("dilip")) {
				String r[] = str.split("");
				StringBuilder rsb = new StringBuilder();
				int l = str.length();
				for (String rs : r) {
					String string = r[l - 1];
					rsb.append(string);
					l--;
				}
				System.out.println(rsb+"\t");
				newstr=rsb.toString();
				sb.append(newstr+"\t");
			}else {
				newstr=str;	
				sb.append(newstr+"\t");
			}
			
		}
		System.out.println(sb);

	}
}
