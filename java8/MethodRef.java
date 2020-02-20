package com.dilip.java8;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("dilip", "kuamr", "mehta", "nidhi");
		A a = AA::show;
		A1 a1 = new AA1()::show;}}

@FunctionalInterface
interface A {public void show();}
class AA {public static void show() {
		System.out.println("AA show");}}

@FunctionalInterface
interface A1 {public void show(int i);
}
class AA1 {public void show(int i) {System.out.println("AA show");}
}