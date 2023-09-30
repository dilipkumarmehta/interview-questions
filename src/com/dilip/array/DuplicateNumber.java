package com.dilip.array;

public class DuplicateNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 3, 4, 3, 5, 6 };
		int darr[] = new int[57];
		char ch = ' ';
		for (int i = 0; i < arr.length; i++) {
			ch = (char) arr[i];
			darr[ch] += 1;
			
		}
	for (int i = 1; i <7; i++) {
		System.out.println(darr[i]);
	}
	}
}