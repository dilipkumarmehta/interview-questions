package com.dilip.number;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			int count = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count < 2) {
				System.out.println("it is prime number" + i);
			}
			count = 0;
		}
		for (int i = 0; i < 100; i++) {
			printPrime(i);
		}

	}

	public static boolean printPrime(int n) {
		int count = 0;
		if (n == 0) {
			System.out.println("");
			return false;
		}
		for (int i = 1; i <= n ; i++) {
			if (n % i == 0) {
				count++;
			}

		}
		if (count == 2) {
			System.out.println("prime number " + n);
		}
		return false;
	}
}