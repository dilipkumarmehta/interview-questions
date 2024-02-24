package com.dilip.ds;

import java.util.Arrays;

public class CustomeArrayList {

	private Object[] myStore;
	private int actSize = 0;

	CustomeArrayList() {
		myStore = new Object[2];
	}

	public void addElement(int value) {
		if (myStore.length - actSize <= 2) {
			System.out.println(myStore.length - actSize);
			increaseListSize();
		}
		myStore[actSize++] = value;
	}

	public Object get(int index) {
		if (index <= actSize) {
			return myStore[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, myStore.length * 2);
		System.out.println("\nNew length: " + myStore.length);
	}

	public static void main(String[] args) {
		CustomeArrayList ca = new CustomeArrayList();
		for (int i = 0; i < 20; i++) {
			ca.addElement(10);
			System.out.println(ca.get(0));
			
		}

	}
}
