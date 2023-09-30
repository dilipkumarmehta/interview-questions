package com.dilip.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
	int id;
	String sname;
	int age;
	int salary;

	public Employee(int id, String sname, int age, int salary) {
		super();
		this.id = id;
		this.sname = sname;
		this.age = age;
		this.salary = salary;
	}

	public int compareTo(Employee arg0) {

		return this.id - arg0.id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}

public class ComparableComparator {
	public static void main(String[] args) {
		Employee em = new Employee(4, "Dilip", 22, 2200);
		Employee em1 = new Employee(2, "ADilip", 20, 3000);
		Employee em2 = new Employee(4, "Dilip", 22, 2200);
		Employee em3 = new Employee(2, "BDilip", 22, 400);
		Employee em4 = new Employee(5, "Pilip", 21, 2200);
		Employee em5 = new Employee(6, "CAAA", 22, 100);
		Employee em6 = new Employee(2, "AAA", 2, 200);
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(em);
		empList.add(em1);
		empList.add(em2);
		empList.add(em3);
		empList.add(em4);
		empList.add(em5);
		empList.add(em6);
		// sort based on id comparable interface
		Collections.sort(empList);
		System.out.println(empList);
		// sort based on id Comparator interface
		Collections.sort(empList, new MyComparator());
		for (Employee employee : empList) {
			System.out.println(employee.getId() + "\t" + employee.getSname() + "\t" + employee.getAge() + "\t"
					+ employee.getSalary());
		}

	}
}
