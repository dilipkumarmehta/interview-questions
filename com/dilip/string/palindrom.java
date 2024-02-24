package com.dilip.string;

public class palindrom {
	public static void main(String[] args) {
		String string1 = "madasm";
		String str = "";
		for (int i = string1.length()-1; i >= 0; i--) {
            str=str+string1.charAt(i);
		}
		if(string1.equals(str))
		{
			System.out.println("palindrom");
		}else{
			System.out.println("not palindrom");
		}
	}
}
