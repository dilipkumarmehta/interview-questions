package com.generic;

public class AdddNumber {
	public static void main(String[] args) {
		Test<String> t = new Test();
		t.add("dilip", "dfdfd");
		Test<Integer> t1 = new Test();
		t1.add(11, 22);

	}
}

class Test<T> {
	public <T> T add(T one, T two) {

		if (one.getClass() == Integer.class)
			return (T) (Integer) ((Integer) one + (Integer) two);
		if (one.getClass() == String.class)
			return (T) ((String) one + (String) two);

		return null;

	}
}