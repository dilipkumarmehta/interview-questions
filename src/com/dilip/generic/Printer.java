package com.dilip.generic;

import java.util.ArrayList;
import java.util.List;

class Printer1<T> {
	T thingToPrint;

	Printer1(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(thingToPrint);
	}

}

public class Printer {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("dilip");
		Printer1<ArrayList<String>> p = new Printer1(al);
		printList(al);
	}

	private static void printList(List<? > myList) {

	}
}