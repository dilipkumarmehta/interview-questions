package com.dilip.lamda;

public class Lab2Lambda {
	public static void main(String[] args) {

		AA aa = new BB();
		aa.show();

		AA aa1 = new AA() {
			@Override
			public void show() {
				System.out.println("hello amnnonemus calss");
			}

		};
		aa1.show();
		//()->{} ==> means method of implementation 
		AA aa2= ()->{
			System.out.println("hello lambda interface");
		};
		aa2.show();
	}

}

interface AA {
	void show();
}

class BB implements AA {

	@Override
	public void show() {
		System.out.println("hello");

	}

}