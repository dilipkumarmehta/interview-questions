package com.dilip.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


public class FlatMapExampl {
	String name;
	List<String> items;

	public FlatMapExampl(String name, String... items) {
		this.name = name;
		this.items = Arrays.asList(items);
	}

	public List<String> getItems() {
		return items;
	}

	public static void main(String[] args) {
		FlatMapExampl amazon = new FlatMapExampl("amazon", "Laptop", "Phone");
		FlatMapExampl ebay = new FlatMapExampl("ebay", "Mouse", "Keyboard");
		List<FlatMapExampl> FlatMapExampls = Arrays.asList(amazon, ebay);

		System.out.println("-------- Without flatMap() ---------------------------");
		List<List<String>> mapReturn = FlatMapExampls.stream().map(FlatMapExampl::getItems).collect(Collectors.toList());
		System.out.println("\t collect() returns: " + mapReturn);

		System.out.println("\n-------- With flatMap() ------------------------------");
		List<String> flatMapReturn = FlatMapExampls.stream().map(FlatMapExampl::getItems).flatMap(Collection::stream)
				.collect(Collectors.toList());
		System.out.println("\t collect() returns: " + flatMapReturn);
	}
}
