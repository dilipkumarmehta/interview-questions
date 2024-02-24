package com.dilip.oops;

public class OveridingExmple {
	public static void main(String[] args) {
		Overiding1 obj = new Overiding1();
		obj.show();

	}
}

class Overriding {

	public void show() {
		System.out.println("Hello how are you");
	}
}

class Overiding1 extends Overriding {

}