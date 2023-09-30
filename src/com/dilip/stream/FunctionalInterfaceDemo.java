package com.dilip.stream;

import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;

class predicateimpl implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {

		if (t % 2 == 0) {
			return true;
		} else
			return false;
	}

}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,343);
		//list.forEach(System.out::print);
		predicateimpl p=new predicateimpl();
		//list.stream().filter(p).forEach(System.out::println);
		list.stream().filter(t->list.get(0)>2).forEach(System.out::println);
		
		long count = list.stream().filter(predicate->	predicate>8&&predicate>9).count();
		//	System.out.println(count);
	}
}
