package com.dilip.ds;

//int arr[] = { 1, 2, 4, 5, 3, 43, 4, 5, 7 };
//n-1 time sort
public class BibbelSort {

	static void bubbleSort(int[] arr) {

		String string = "dilip kumar mehta abb bcc dd pp kk";
		String str[] = string.split(" ");
		int n = str.length;

		String temp = "";
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				// if(arr[j-1] > arr[j]){
				if (str[j + 1].compareTo(str[j]) > 0) {
					// swap elements
					temp = str[j + 1];
					str[j + 1] = str[j];
					str[j] = temp;
				}

			}
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 3, 43, 4, 5, 7 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
