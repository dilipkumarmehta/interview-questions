package com.java.techie.collectors;

public class Employee {
	private int emaiID;
	private String name;
	private int age;
	private int salary;
	private String dept;

	public Employee(int emaiID, String name, int age, int salary, String dept) {
		super();
		this.emaiID = emaiID;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmaiID() {
		return emaiID;
	}

	public void setEmaiID(int emaiID) {
		this.emaiID = emaiID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emaiID=" + emaiID + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dept="
				+ dept + "]";
	}

}
