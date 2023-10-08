package com.dilip.stream;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

class predicate1<T> implements Predicate<T> {

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		return false;
	}

}

public class PredicateInterface {

	public static void main(String[] args) throws ClassNotFoundException {
		ArrayList<String> al = new ArrayList<>();
		al.stream().filter(null);
		al.stream().flatMap(null);
		// Stream<T> filter(Predicate<? super T> predicate);
		al.stream().collect(null, null, null);

	}
}
