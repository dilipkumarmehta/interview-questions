package com.dilip.util;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeMulti implements Comparable<EmployeeMulti> {
	String name;
	String password;
	int id;
	String educatin;
	String marks;

	public EmployeeMulti(String name, String password, int id, String educatin, String marks) {
		super();
		this.name = name;
		this.password = password;
		this.id = id;
		this.educatin = educatin;
		this.marks = marks;
	}

	@Override
	public int compareTo(EmployeeMulti otherEmployee) {
		// return this.name.compareTo(otherEmployee.name);
		int c;
		c = this.id - otherEmployee.id;
		if (c == 0)
			c = this.name.compareTo(otherEmployee.name);
		if (c == 0)
			c = this.password.compareTo(otherEmployee.password);
		if (c == 0)
			c = this.educatin.compareTo(otherEmployee.educatin);
		return c;
	}

	@Override
	public String toString() {
		return "EmployeeMulti [name=" + name + ", password=" + password + ", id=" + id + ", educatin=" + educatin
				+ ", marks=" + marks + "]";
	}

}

public class ComparableMultiFiledSort {
	public static void main(String[] args) {

		EmployeeMulti emp1 = new EmployeeMulti("adilip", "bkumar", 22, "aamca", "200");
		EmployeeMulti emp2 = new EmployeeMulti("adilip", "bkumar", 1, "amca", "500");
		EmployeeMulti emp3 = new EmployeeMulti("bdilip", "dkumar", 5, "bmca", "600");
		EmployeeMulti emp4 = new EmployeeMulti("dilip", "ckumar", 7, "dmca", "800");
		EmployeeMulti emp5 = new EmployeeMulti("fdilip", "fkumar", 10, "pmca", "300");
		EmployeeMulti emp6 = new EmployeeMulti("edilip", "ekumar", 3, "zmca", "100");

		ArrayList<EmployeeMulti> list = new ArrayList<EmployeeMulti>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);

		System.out.println("list Before sorting : \n" + list);
		System.out.println("\n");
		Collections.sort(list);

		for (EmployeeMulti employeeMulti : list) {
			System.out.println(employeeMulti);
		}

	}
}