package com.dilip.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("A", null);
		map.put("B", "dilip2");
		map.put("C", "dilip3");
		map.put("D", "dilip4");
		map.put("E", "dilip5");
		map.put("F", "dilip6");
		map.put("G", "dilip7");

		List<Order> orList = new ArrayList<Order>();
		Order order = new Order(1, "AA", 100, "Dilip");
		Order order1 = new Order(2, "AA", 5000, "Dilip");
		Order order2 = new Order(3, "BB", 6000, "Dilip");
		Order order3 = new Order(4, "CC", 7000, "Mehta");
		Order order4 = new Order(5, "CC", 3000, "Mehta");
		Order order5 = new Order(6, "BB", 4000, "Mehta");
		Order order6 = new Order(6, "BB", 4000, null);
		Order order7 = new Order(6, null, 4000, "Mehta");
		Order order8 = null;
		orList.add(order);
		orList.add(order1);
		orList.add(order2);
		orList.add(order3);
		orList.add(order4);
		orList.add(order5);
		orList.add(order6);
		orList.add(order7);
		orList.add(order8);

		List<String> collect = map.entrySet().stream().filter(m -> m.getKey() != null && m.getValue() != null)
				.map(mapper -> mapper.getValue().toUpperCase()).collect(Collectors.toList());

		System.out.println(collect);
		Optional<List<Order>> orderList = Optional.ofNullable(orList);

		List<String> collect2 = orderList.get().stream().filter(ord -> ord != null && ord.getOrderName() != null)
				.map(mapper -> mapper.getOrderName().toUpperCase()).collect(Collectors.toList());

		System.out.println(collect2);

		Address address = new Address("1234", "ranchi");
		Address address1 = new Address("12346", "Daltonganj");
		Address address2 = new Address(null, "Daltonganj");
		Address address3 = new Address("12346", null);
		Address address4 = null;
		List<Order> orList1 = new ArrayList<Order>();
		Order orderAdd = new Order(1, "AA", 100, "Dilip", address);
		Order order11 = new Order(2, "AA", 5000, "Dilip", address1);
		Order order21 = new Order(3, "BB", 6000, "Dilip", address2);
		Order order31 = new Order(4, "CC", 7000, "Mehta", address3);
		Order order41 = new Order(5, "CC", 3000, "Mehta", address4);
		Order order51 = new Order(6, "BB", 4000, "Mehta");
		Order order61 = new Order(6, "BB", 4000, null);
		Order order71 = new Order(6, null, 4000, "Mehta");
		Order order81 = null;
		orList1.add(orderAdd);
		orList1.add(order1);
		orList1.add(order11);
		orList1.add(order21);
		orList1.add(order31);
		orList1.add(order41);
		orList1.add(order51);
		orList1.add(order61);
		orList1.add(order71);
		orList1.add(order81);
		System.out.println(orList1);
		// get order address which order id 1;
		List<Address> collect3 = orList1.stream().filter(ord -> ord != null && ord.getOrderId() == 1)
				.map(mapper -> mapper.getAddress()).collect(Collectors.toList());
		System.out.println(collect3);

	}

}
