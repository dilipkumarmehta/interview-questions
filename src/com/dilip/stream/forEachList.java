package com.dilip.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class forEachList {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// lambda
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));
		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		Stream<String> filter = items.stream().filter(s -> s.contains("B"));
		
		filter.forEach(System.out::println);

	}
}
