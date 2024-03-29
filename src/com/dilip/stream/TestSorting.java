package com.dilip.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = getDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		/*
		 * //sort by age before java 8 Collections.sort(listDevs, new
		 * Comparator<Developer>() {
		 * 
		 * @Override public int compare(Developer o1, Developer o2) { return
		 * o1.getAge() - o2.getAge(); } });
		 */
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		
		listDevs.forEach((devloper) ->System.out.println(devloper));

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
		result.add(new Developer("alvin", new BigDecimal("80000"), 20));
		result.add(new Developer("jason", new BigDecimal("100000"), 10));
		result.add(new Developer("iris", new BigDecimal("170000"), 55));

		return result;

	}

}