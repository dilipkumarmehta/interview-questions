package com.dilip.array;

import java.util.Arrays;

//Write a program to find intersection of two sorted arrays in Java
public class Arrayinter {
	public static void main(String[] args) {
		int arr[] = { 21, 34, 41, 22, 35 };
		int arr1[] = { 61, 34, 45, 21, 11 };
		int inter[] = new int[arr.length];
		int t = 0;
		// {34, 21}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					inter[t] = arr[i];
					t++;
				}
			}

		}
		for (int i = 0; i < inter.length; i++) {
			if (inter[i] > 0)
				System.out.println(inter[i]);

		}
		System.out.println("###################");
		int[] array = { 10, 20, 30, 40, 50 };

		// Element to search
		int target = 30;

		// Get index of the target element using a lambda expression
		int index = Arrays.stream(array).boxed() // Convert int to Integer
				.mapToInt(Integer::intValue) // Convert Integer to int
				.boxed() // Convert int to Integer again
				.filter(value -> value == target) // Filter elements equal to target
				.findFirst() // Get the first occurrence
				.orElse(-1); // Default value if not found
	}
}
