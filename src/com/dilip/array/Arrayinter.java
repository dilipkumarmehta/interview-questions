package com.dilip.array;
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
			if(inter[i]>0)
			System.out.println(inter[i]);

		}
	}
}
