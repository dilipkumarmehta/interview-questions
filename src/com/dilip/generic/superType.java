package com.dilip.generic;

class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}

public class superType {
	public static void main(String[] args) {
		Box<? super Number> box = new Box<>(10);
		// You can set values of types that are supertypes of Number
		box.setValue(3.14); // OK, since Double is a supertype of Number
		box.setValue(42); // OK, since Integer is a supertype of Number
		System.out.println("hello");
		// You cannot set values of types that are not supertypes of Number
		// box.setValue("Hello"); // Not allowed, String is not a supertype of Number
	}
}
