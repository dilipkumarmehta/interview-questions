package com.clone;

public class DeepClonig {
	public static void main(String[] args) throws CloneNotSupportedException {
		Test1 t1 = new Test1(20);
		System.out.println();
		System.out.println();
		System.out.println();
		Test t = new Test(10, t1);
		System.out.println(t.test.j);
		System.out.println(t.a);
		Test t2 = (Test) t.clone();
		System.out.println(t2.test.j);
		System.out.println(t2.a);
	}
}

class Test implements Cloneable {
	int a;
	Test1 test;

	public Test(int a, Test1 test) {
		this.a = a;
		this.test = test;
	}

	public Object clone() throws CloneNotSupportedException {
		Test1 test1 = new Test1(test.j);
		Test t = new Test(a, test1);
		return t;

	}
}

class Test1 {
	int j = 90;

	public Test1(int j) {
		super();
		this.j = j;
	}

}
