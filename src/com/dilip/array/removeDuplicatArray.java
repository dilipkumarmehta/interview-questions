package com.dilip.array;

public class removeDuplicatArray {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5, 50, 50, 100 };
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					while (j < size - 1) {
						arr[j] = arr[j + 1];
						j++;
					}
					size--;
				}
			}

		}
		for (int i = 0; i < size; i++) {
		System.out.println(arr[i]);
		}
	}
}
