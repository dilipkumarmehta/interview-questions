package com.dilip.ds;



public class Searching {
	public static void main(String[] args) {
		BubbleSort.bubbleSort();

	}
}

class BubbleSort {
	public static void bubbleSort() {
		int arr[] = { 1, 5, 2, 4, 8, 6, 7, 0, 3 }; // 10- 0-9
		int lengh = arr.length;
		for (int i = 0; i < lengh; i++) {
			for (int j = 0; j < lengh - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
			lengh--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
