package com.dilip.util;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1> {
	String name;
	String id;

	public Employee1(String name, String id) {
	
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(Employee1 otherEmployee) {
		System.out.println("This: "+this+" otherEmployee: "+otherEmployee);
		return  this.name.compareTo(otherEmployee.name);

	}

	@Override
	public String toString() {
		return "Employee{" + "name=" + name + ", id=" + id + '}';
	}
}

public class ComparableExample {
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1("aa", "4");
		Employee1 emp2 = new Employee1("cc", "2");
		Employee1 emp3 = new Employee1("bb", "1");

		ArrayList<Employee1> list = new ArrayList<Employee1>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);

		//System.out.println("list Before sorting : \n" + list);

		Collections.sort(list);

	//	System.out.println("\nlist after sorting on basis of name(ascending order) : \n" + list);

	}
}