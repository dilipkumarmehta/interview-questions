package com.dilip.lamda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lab3ForEach {
	public static void main(String[] args) {
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
			map.put("dd","hello");
			map.remove("dilip");
		});

		map.forEach(cmap);

		// name.forEach(con);
		// lambda expression
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