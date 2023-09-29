package com.dilip.language.fundamental;

public class GetMethodOfclass {
	public static void main(String[] args) {
		Class c = java.lang.Class.class;
		Class[] methods = c.getClasses();
		for (Class s : methods) {
			System.out.println(s);
		}
	}
}
