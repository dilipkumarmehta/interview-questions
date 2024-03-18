package com.java.techie.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.TreeMap;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class GroupByDeptMaxSalary {
	private static Map<String, Optional<Employee>> collect;

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		Employee emp = new Employee(1, "dilip", 240, 2200, "IT");
		Employee emp1 = new Employee(2, "dilip1", 420, 233, "Support");
		Employee emp2 = new Employee(3, "dilip2", 343, 9000, "DevOps");
		Employee emp4 = new Employee(3, "dilip2", 333, 5000, "DevOps");
		Employee emp3 = new Employee(4, "dilip3", 2410, 2555, "Lead");

		empList.add(emp);
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		System.out.println("highest Salary By department solution1");

		
		Map<String, Optional<Employee>> collect4 = empList.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getName)))));
		collect4.forEach((k,v)->System.out.println(k+"\t value: "+v.get().getEmaiID()));
		
		 Map<Integer, List<Employee>> groupedByAge = empList.stream()
	                .collect(Collectors.groupingBy(Employee::getAge));

	        // Sort age groups in descending order
	        TreeMap<Integer, List<Employee>> sortedByAgeDesc = new TreeMap<>(Collections.reverseOrder());
	        sortedByAgeDesc.putAll(groupedByAge);
	        
	        // Sort each group by name
	        sortedByAgeDesc.forEach((age, persons) -> {
	            persons.sort(Comparator.comparing(Employee::getName));
	           // System.out.println("Age: " + age);
	           // persons.forEach(person -> System.out.println("Name  "+person.getName()+"  Age:"+person.getAge()));
	        });
	        
	        
	        
		
		Comparator<Employee> reversed = Comparator.comparing(Employee::getAge).reversed();
		

		// System.out.println("Higest Salary By department solution2");
		Optional<Employee> collect2 = empList.stream()
				.collect(Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))));
		// System.out.println(collect2.get());

		//System.out.println("Higest Salary By department solution3");
		Map<Employee, List<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDept))
				.entrySet().stream()
				.collect(Collectors.toMap(
						e -> e.getValue().stream().max(Comparator.comparing(Employee::getSalary)).get(),
						Entry::getValue));

		map.forEach((k, v) -> {
		//System.out.println(k);
			for (Employee e : v) {
				//System.out.printf("    %s%n", e);
			}
			//System.out.println();
		});

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "IT");
		m.put(2, "HR");
		m.put(3, "IT");
		m.put(4, "FINANCE");
		m.put(5, "RH");
		m.put(6, "Finance");
		m.put(7, "IT");
		Map<Integer, String> collect3 = m.entrySet().stream()
				.collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));

	}
}
