package com.dilip.exception;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test t = new Test();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("ss");
			throw new NullPointerException();
		}

	}
}

class Test {
	public int getdata() {
		int a;
		try {
			throw new NullPointerException();
			//return a = 90/0;
		} catch (Exception e) {
			a = 9;
			System.out.println(e.getMessage());
		} finally {
			a = 10;
		}
		return a;
	}
}