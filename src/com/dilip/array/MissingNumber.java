package com.dilip.array;

public class MissingNumber {
	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0;
		int arr[] = { 1, 2, 3, 4, 5, 7, 11, 10, 8, 9 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			//System.out.println(arr[i]);
		}
		System.out.println(sum);
		for (int i = 1; i <= arr.length + 1; i++) {
			sum1 = sum1 + i;
			//System.out.println(i);
		}
		System.out.println(sum1);
		System.out.println(sum1 - sum);

	}
	
	
}
