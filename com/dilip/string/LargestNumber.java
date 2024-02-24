package com.dilip.string;

import java.util.Arrays;
import java.util.Comparator;

class Test1 {
	public String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {
			arr[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a, String b) {
				return (b + a).compareTo(a + b);
			}
		});
		System.out.println(arr);
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}

		while (sb.charAt(0) == '0' && sb.length() > 1)
			sb.deleteCharAt(0);
		System.out.println(sb.charAt(0));
		System.out.println(sb.toString());
		return sb.toString();
	}
}

public class LargestNumber {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 30, 34, 05, 9 };

		new Test1().largestNumber(arr);
	}
}
