package com.dilip.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class consume<T> implements Consumer<T> {

	@Override
	public void accept(T t) {
		// TODO Auto-generated method stub

	}

}

class function<T, R> implements Function<T, R> {

	@Override
	public R apply(T t) {
		// TODO Auto-generated method stub
		return null;
	}

}

class predicate<T> implements Predicate<T> {

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		return false;
	}

}

public class Lab3ForEach {
	public static void main(String[] args) {
		Predicate<Boolean> p = (True) -> true;
		
		System.out.println(p.test(false));

		List<String> name = new ArrayList<String>();
		name.add("dilip");
		name.add("dilip1");
		name.add("dilip2");
		name.add("dilip3");
		name.add("dilip4");
		name.add("dilip5");
		Consumer<String> con = new Lb();
		BiConsumer<String, String> cmap = new Lb1();
		Map<String, String> map = new HashMap<String, String>();
		map.put("dilip", "Mehta");
		map.put("dilip", "Mehta");
		map.put("dilip", "Mehta");
		map.put("dilip", "Mehta");
		map.forEach((k, v) -> {
			System.out.println(k + "" + v);
			map.put("dd", "hello");
			map.remove("dilip");
		});

		Stream<Entry<String, String>> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue());
		
		name.forEach((a) -> {
			String ss = a + "MM";
			System.out.println(ss);
		});
	}

}

class Lb implements Consumer<String> {
	@Override
	public void accept(String t) {
		System.out.println(t);

	}

}

//Map
class Lb1 implements BiConsumer<String, String> {

	@Override
	public void accept(String t, String u) {
		System.out.println(t + "-----" + u);

	}

}
