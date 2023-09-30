package com.dilip.array;

public class DuplicatArray {

	public static void main(String[] args) {
		// new test().set();

		int arr[] = { 1, 1, 33, 2, 3, 4, 4, 5, 50, 50, 100 };
		int index[] = new int[255];
		for (int i = 0; i < arr.length; i++) {
			int a = arr[i];
			index[a] += 1;
			// index[a]=index[a] + 1;
			// valu of inde[i] +1
			// 0+1,1+1 .....
		}
		int i = 0;
		while (i < 255) {
			if (index[i] > 0) {
				System.out.println(index[i] + "\t" + i);
			}
			i++;
		}
	}

}

class test {

	public void set() {
		String s = "dilipdilip";
		char ch[] = s.toCharArray();
		int a[] = new int[122];
		char ch1 = ' ';
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			a[c] += 1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				System.out.println(a[i] + "" + (char) i);
		}
	}
}
