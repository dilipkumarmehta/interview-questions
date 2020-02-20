package com.number;

public class Factorial {
	public static void main(String[] args) {
		int a=new FactorialCal().fact(5);
	System.out.println(a);
	}
}

class FactorialCal {
	public int fact(int n) {
		if (n < 1) {
			return 1;
		}
		return n*fact(n - 1) ;

	}

}