package com.dilip.ds;

public class MergeSort {

	public static void main(String[] args) {

		int i = 0, j = 0, k = 0;
		int arr[] = { 5, 6, 7, 8 };// i
		int arr1[] = { 1, 2, 3, 4 };// j
		int a[] = new int[8];// k
		while (i < arr.length && j < arr1.length) {
			if (arr[i] <=arr1[j]) {
				a[k] = arr[i];
				i++;
			} else {
				a[k] = arr1[j];
				j++;
			}
			k++;
		}
		while (j < arr1.length) {
			a[k] = arr1[j];
			j++;
			k++;
		}

		while (i < arr.length) {
			a[k] = arr1[i];
			i++;
			k++;
		}
		for (int l = 0; l < a.length; l++) {
			System.out.println(a[l]);
		}

	}
}
