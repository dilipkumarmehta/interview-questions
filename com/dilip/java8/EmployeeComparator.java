package com.dilip.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparator {
	public static void main(String[] args) {
		ArrayList<EmployeeTest> employees = getUnsortedEmployeeList();

		// Compare by first name and then last name
		Comparator<EmployeeTest> compareByName = Comparator.comparing(EmployeeTest::getId)
				.thenComparing(EmployeeTest::getFirstName).thenComparing(EmployeeTest::getLastName);
		
		Collections.sort(employees, compareByName);
		employees.forEach(emp -> System.out.println(emp));

	}

	private static ArrayList<EmployeeTest> getUnsortedEmployeeList() {
		ArrayList<EmployeeTest> list = new ArrayList<>();
		list.add(new EmployeeTest(2, "Lokesh", "Gupta"));
		list.add(new EmployeeTest(1, "Alex", "Gussin"));
		list.add(new EmployeeTest(4, "Brian", "Sux"));
		list.add(new EmployeeTest(5, "Neon", "Piper"));
		list.add(new EmployeeTest(5, "Aeon", "Piper"));
		list.add(new EmployeeTest(3, "David", "Beckham"));
		list.add(new EmployeeTest(7, "Alex", "Beckham"));
		list.add(new EmployeeTest(6, "Brian", "Suxena"));
		return list;
	}
}
