package com.dilip.util;

import java.util.Comparator;

class MyComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee arg0, Employee arg1) {

		int id = arg0.getId() - arg1.getId();
		if (id != 0) {
			return id;
		}
		int sname = arg0.sname.compareTo(arg1.sname);
		if (sname != 0) {
			return sname;
		}
		int age = arg0.getAge() - arg1.getAge();
		if (age != 0) {
			return age;
		}
		return arg0.getSalary() - arg1.getSalary();
		/*
		 * if (age != 0) { return age; } return
		 * arg0.sname.compareTo(arg1.sname);
		 */
	}

}