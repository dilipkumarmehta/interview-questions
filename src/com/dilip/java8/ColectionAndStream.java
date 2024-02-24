package com.dilip.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColectionAndStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
		 list.stream()
	    .filter(name -> name.startsWith("f"))
	    .map(String::toUpperCase)
	    .sorted()
	    .forEach(System.out::println);
		 
		 Map<String,Collection<String>> map=new HashMap<String,Collection<String>>();
		 
		 for (var entry : map.entrySet()) {
			    System.out.println(entry.getKey() + "/" + entry.getValue());
			}
		 
		 
	}
}
