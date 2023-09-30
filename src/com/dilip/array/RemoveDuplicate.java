package com.dilip.array;


public class RemoveDuplicate {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,3,2};
		Tesduplic.removeDUpl(arr);
	}
}

class Tesduplic {
	public static void removeDUpl(int arr[]) {
		int l = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i] == arr[j]) {
					for (int j2 = j; j2 < arr.length-1; j2++) {
						arr[j2] = arr[j2 + 1];
					}
					l--;
				}
				
			}
		}
		for (int i = 0; i <l; i++) {
			System.out.println(arr[i]);
		}
	}

}
