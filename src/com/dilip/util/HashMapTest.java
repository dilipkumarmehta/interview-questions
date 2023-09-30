package com.dilip.util;
import java.util.HashMap;
import java.util.Map.Entry;

class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public String toString() {
		return color + " dog";
	}

	@Override
	public int hashCode() {
		System.out.println("hsdcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
}

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Dog, Integer> hashMap = new HashMap();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);
		// print size
		System.out.println(hashMap.size());
		// loop HashMap
		for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
			//System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}
	}
}