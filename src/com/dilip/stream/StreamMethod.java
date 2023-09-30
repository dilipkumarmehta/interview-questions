package com.dilip.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMethod {
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(4);
		ls.add(5);
		ls.add(60);
		ls.add(8);
		ls.add(9);
		ls.add(34);
		ls.add(3);
	ls.stream().filter(l->l>10).forEach(System.out::println);

		
		

	}
}
