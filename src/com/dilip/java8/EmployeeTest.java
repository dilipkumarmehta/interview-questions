package com.dilip.java8;

class EmployeeTest implements Comparable<EmployeeTest> {

	private Integer id = -1;
	private String firstName = null;
	private String lastName = null;

	public EmployeeTest(Integer id, String fName, String lName) {
		this.id = id;
		this.firstName = fName;
		this.lastName = lName;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "EmployeeTest [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int compareTo(EmployeeTest o) {
		// TODO Auto-generated method stub
		return -(this.id - o.id);
	}

	// getters and setters
}