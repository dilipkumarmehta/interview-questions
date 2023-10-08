package com.dilip.generic;

class IntegerPrinter1 {

	Integer thingToPrint;

	public IntegerPrinter1(Integer thingToPrint) {

		this.thingToPrint = thingToPrint;
	}

	public void print() {
		System.out.println(thingToPrint);
	}
}

public class IntegerPrinter {

	public static void main(String[] args) {
		IntegerPrinter1 p=new IntegerPrinter1(10);
		p.print();
	}
}
