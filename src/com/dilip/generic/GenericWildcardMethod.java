package com.dilip.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardMethod {
	public static void main(String[] args) {
		MethodGeneric g = new MethodGeneric();
		List<String> list = new ArrayList<String>();
		g.gemericAdd(list);
		List<Integer> numList = new ArrayList<Integer>();
		g.gemericadd1(numList);

		List<Object> supList = new ArrayList<Object>();
		g.gemericadd2(supList);
		List<Order> supList1 = new ArrayList<Order>();
		g.gemericadd2(supList1);

	}

}

class MethodGeneric {

	public void gemericAdd(List<?> list) {

	}

	// can be same type or it's child
	public void gemericadd1(List<? extends Number> list) {
		list.forEach(System.out::print);

	}

	// same type or if x is class then super type ,of interface means it's
	// implementation
	public void gemericadd2(List<? super TT> list) {

	}
}