package com.dilip.array;

public class NthMinElement {
	public static void main(String[] args) {
		int arr[] = { 12, 1, 13, 4, 15, 6, 7, 8, 9, 10, 12, 3, 43, 5,27};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] >arr[j - 1]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}

		}
		for (int j = 0; j < arr.length ; j++) {
			System.out.println(arr[j]);
		}
	}
}
