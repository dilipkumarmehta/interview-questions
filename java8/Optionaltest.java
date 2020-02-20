/*package com.dilip.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class Optionaltest {
	public static void main(String[] args) {

		List<Employee> empSet = null;
		empSet = new ArrayList<Employee>();
		Employee emp = new Employee(1, "dilip", "bangalore");
		Employee emp1 = new Employee(1, "dilip", "bangalore");
		Employee emp2 = new Employee(1, "dilip", "bangalore");
		Employee emp3 = new Employee(2, "dilip", "bangalore");
		Employee emp4 = new Employee(2, "dilip", "bangalore");
		Employee emp5 = null;
		Optional<List<Employee>> ofNullable = Optional.ofNullable(empSet);

		Optional.ofNullable(empSet).map(List::stream).orElse(Stream.empty()).filter(Objects::nonNull)
				.forEach(emplist -> {
					System.out.println(emplist.getAddress());

				});
	}
}
*/