package com.dilip.patter;

// The Product (Complex Object)
class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String address;

	public Person(String firstName, String lastName, int age, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address
				+ "]";
	}

	// Getters for properties (or use a fluent builder for these)
}

// The Builder
class PersonBuilder {
	private String firstName;
	private String lastName;
	private int age;
	private String address;

	@Override
	public String toString() {
		return "PersonBuilder [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address="
				+ address + "]";
	}

	public PersonBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("THIS " + this);
		return this;
	}

	public PersonBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public PersonBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public PersonBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public Person build() {
		return new Person(firstName, lastName, age, address);
	}
}

// Client code
public class BuilderPatternExample {
	public static void main(String[] args) {
		Person person = new PersonBuilder().setFirstName("John").setLastName("Doe").setAge(30).setAddress("123 Main St")
				.build();
		System.out.println(person);
		System.out.println("Created Person: " + person.getFirstName() + " " + person.getLastName());
	}
}
