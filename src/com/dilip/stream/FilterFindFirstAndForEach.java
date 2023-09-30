package com.dilip.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterFindFirstAndForEach {
	public static void main(String[] args) {
		List<User> list = User.getUsers();

		System.out.println("Using findFirst() ---");
		User user = list.stream().filter(u -> u.getName().endsWith("sh")).findFirst().orElse(null);

		System.out.println(user.getName());

		System.out.println("Using forEach() ---");

		list.stream().filter(tt -> tt.getName().endsWith("sh")).forEach(u -> System.out.println(u.getName()));
		System.out.println("Befor sorted");

		list.sort((User user2, User user1) -> user2.getId() - user1.getId());
		list.forEach(System.out::print);
	}

}

class User {
	private int id;
	private String name;
	private int age;

	public User(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Dinesh", 20));
		list.add(new User(2, "Kamal", 15));
		list.add(new User(3, "Vijay", 25));
		list.add(new User(4, "Ramesh", 30));
		list.add(new User(5, "Mahesh", 18));
		return list;
	}
}
