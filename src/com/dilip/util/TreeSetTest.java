package com.dilip.util;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Empployee {
	private String name;
	private int id;

	public Empployee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empployee [name=" + name + ", id=" + id + "]";
	}

      /*  public int hashCode() {
		System.out.println(this.name.hashCode() * this.id);
		return this.name.hashCode() * this.id;
	}*/

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empployee other = (Empployee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class TreeSetTest {
	public static void main(String[] args) {

		Set<Empployee> ts = new HashSet<>();
		Empployee emp = new Empployee("dilipMehta", 1);
		Empployee emp1 = new Empployee("dilipKumar", 3);
		Empployee emp2 = new Empployee("dilipMehta", 1);
		Empployee emp3 = new Empployee("dilipHello", 1);
		Empployee emp4 = new Empployee("dilipKumar", 3);
		ts.add(emp);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		System.out.println(ts);
	}
}
