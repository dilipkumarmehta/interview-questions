package com.dilip.java8;

import java.util.function.Function;

public class functionInterfac {

	public static void main(String[] args) {
		Function<Integer, Double> fun = t -> t / 10.1;
		System.out.println(fun.apply(100));

		test1<Integer, Integer> t = new test1<Integer, Integer>();
		Integer apply = t.apply(12);
		System.out.println(apply);

	}
}

class test1<T, R> implements Function<T, R> {

	@Override
	public R apply(T t) {

		return (R) t;
	}

}