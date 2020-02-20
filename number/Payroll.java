package com.number;

public class Payroll<T> {

	public static void main(String[] args) {
		PayrollTest p = new PayrollTest<Employee1>(null);
	}
}

class PayrollTest<T> {

	T obje;

	public PayrollTest(T t) {
		obje = t;
	}

	public T getObje() {
		return obje;
	}

	public void setObje(T obje) {
		this.obje = obje;
	}

}

class Employee1 {
	int name;
}