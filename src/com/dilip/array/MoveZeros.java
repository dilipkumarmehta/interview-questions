package com.dilip.array;

public class MoveZeros {
	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 };
		

		 moveZerosToEnd(arr);

		// Print the modified array
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

	public static void moveZerosToEnd(int[] arr) {
		int zeroIndex = 0; // Initialize the index where the next 0 should be placed
		int arr1[] = { 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1 };
		// Iterate through the array
		for (int i = 0; i < arr.length; i++) {
			// If the current element is not 0, swap it with the element at zeroIndex
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[zeroIndex];
				arr[zeroIndex] = temp;
				System.out.println(zeroIndex);
				System.out.println(arr[zeroIndex] );
				zeroIndex++; // Move the zeroIndex to the right
				System.out.println(zeroIndex);
			System.out.println();
			}
		}
	}
}
