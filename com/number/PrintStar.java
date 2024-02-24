package com.number;

public class PrintStar {

	public static void main(String[] args) {
		int n = 5;
		int p=1;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <p; k++) {
				System.out.print(" *");
			}
			p +=2;
			System.out.println();
		}

	}
}

