package com.dilip.java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {
	public static void main(String[] args) {
		DateTime.show();
	}
}

class DateTime {
	public static void show() {
		LocalDate date = LocalDate.now();

		System.out.println(date);
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}