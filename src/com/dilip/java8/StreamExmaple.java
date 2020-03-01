package com.dilip.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExmaple {
	public static void main(String[] args) {

		EmployeeTest e = new EmployeeTest(1, "adilip", "Mehta");
		EmployeeTest e1 = new EmployeeTest(2, "bdilip", "Mehta");
		EmployeeTest e2 = new EmployeeTest(5, "ddilip", "Mehta");
		EmployeeTest e3 = new EmployeeTest(4, "rdilip", "Mehta");
		EmployeeTest e4 = new EmployeeTest(0, "pdilip", "Mehta");

		List<EmployeeTest> emp = new ArrayList();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		List<EmployeeTest> collect = emp.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(collect);
		List<EmployeeTest> collect2 = emp.stream().sorted((s, s1) -> s.getFirstName().compareTo(s1.getFirstName()))
				.limit(2).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		
	}
}
