package com.dilip.string;

class MyTest {
	public static void maxMin(int arr[]) {
		int mx = arr[0];
		int min = 0;
		int min1 = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > mx) {
				min = mx;
				mx = arr[i];
			}
			if (arr[i] < min1) {
			
				min1=arr[i];
			}

		}
		System.out.println(mx);
		System.out.println(min1);
	}
}

public class lowHigh {
	public static void main(String[] args) {
		int arr[] = { 11, 2, 3, 11, 2, 33, 2, 5, 6, 3, 1, 4, 5, 2, 45, 5, 222 };
		MyTest.maxMin(arr);
	}
}
