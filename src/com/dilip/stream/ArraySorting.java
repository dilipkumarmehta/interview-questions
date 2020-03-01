package com.dilip.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ArraySorting {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 14, 21, 10, 9, 4, 55, 6, 23, 8, 5);
		list.stream().forEach(System.out::println);
		System.out.println("Natural sorting ");
		list.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		System.out.println("desending order sorting");
		list.stream().sorted((s1, s2) -> s2.compareTo(s1)).forEach(System.out::println);
		Order order = new Order(1, 100, "A");
		Order order1 = new Order(2, 11, "A");
		Order order2 = new Order(3, 30, "B");
		Order order3 = new Order(3, 40, "B");
		Order order4 = new Order(4, 50, "C");
		Order order5 = new Order(5, 70, "C");
		Order order6 = new Order(6, 2, "C");
		Order order7 = new Order(7, 120, "A");
		Order order8 = new Order(8, 1, "B");
		Order order9 = new Order(9, 2, "B");

		List<Order> orderList = new ArrayList<Order>();
		orderList.add(order);
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
		orderList.add(order7);
		orderList.add(order8);
		orderList.add(order9);

		// orderList.stream().filter(order ->
		// order.getCatagory()).collect(Collectors.toList());

		List<String> collect = orderList.stream().map(new testFun()).distinct().collect(Collectors.toList());

		Map<String, Integer> collect2 = orderList.stream().collect(Collectors.groupingBy(Order::getCatagory, Collectors.summingInt(Order::getPrice)));
		System.out.println(collect2);

		/*
		 * List<String> cataList = orderList.stream().map(mapper ->
		 * mapper.getCatagory()).distinct()
		 * .collect(Collectors.groupingBy(order::getCatagory,
		 * Collectors.summingInt(order::getPrice)));
		 */
		System.out.println(collect);
		System.out.println(collect);
	}

}

class test implements Predicate<Order> {
	@Override
	public boolean test(Order t) {
		return false;
	}

}

class testFun implements Function<Order, String> {

	@Override
	public String apply(Order o) {

		return o.getCatagory();
	}

}

class toInt implements ToIntFunction<Order> {

	@Override
	public int applyAsInt(Order value) {
		// TODO Auto-generated method stub
		return 0;
	}

}