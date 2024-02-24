package com.clone;

public class SallowCone {
	public static void main(String[] args) throws CloneNotSupportedException {
		STest1 t1 = new STest1();
		STest t = new STest(10, t1);
		System.out.println(t.test.j);
		System.out.println(t.a);
		
		STest t2 = (STest) t.clone();
		System.out.println(t2.test.j);
		System.out.println(t2.a);
	}
}

class STest implements Cloneable {
	int a;
	STest1 test;

	public STest(int a, STest1 test) {
		this.a = a;
		this.test = test;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class STest1 {
	public STest1() {
		// TODO Auto-generated constructor stub
	}

	int j = 90;
}