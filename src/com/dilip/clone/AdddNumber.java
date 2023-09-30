package com.dilip.clone;

public class AdddNumber {
	public static void main(String[] args) {
		Test2<String> t = new Test2();
		t.add("dilip", "dfdfd");
		Test2<Integer> t1 = new Test2();
		t1.add(11, 22);

	}
}

class Test2<T> {
	public <T> T add(T one, T two) {

		if (one.getClass() == Integer.class)
			return (T) (Integer) ((Integer) one + (Integer) two);
		if (one.getClass() == String.class)
			return (T) ((String) one + (String) two);

		return null;

	}
}