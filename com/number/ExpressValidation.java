package com.number;

import java.util.HashMap;
import java.util.Map;

public class ExpressValidation {
	public static void main(String[] args) {
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();

		String s = "{{}}(({))}[]";

		char[] crr = s.toCharArray();
		String sarr[] = s.split("");

		for (char c : crr) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);// [-1,{-2,
			}

		}
		

		m.forEach((k, v) -> System.out.println(k + "\t" + v));
		boolean validation = true;
		for (Map.Entry<Character, Integer> m1:m.entrySet()) {
			Character k = m1.getKey();
			Integer v = m1.getValue();
			
			if (k == '(') {
				Integer v1 = m.get(')');
				if (v != v1) {
					validation = true;
				}
			}
			if (k == '[') {
				Integer v1 = m.get(']');
				if (v != v1) {
					validation = true;
				}

			}
			if (k == '{') {
				Integer v1 = m.get('}');
				if (v != v1) {
					validation = true;
				}
			}
			
		}
		if(validation) {
			System.out.println("Not valid string");
		}else {
		System.out.println("It's valid string");
		}
		
		
		

	}
}