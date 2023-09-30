package com.dilip.util;

import java.util.Map.Entry;
import java.util.TreeMap;

class Dogs {// implements Comparable<Dogs> {
	String color;
	int size;

	Dogs(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	//@Override
	/*public int compareTo(Dogs o) {
		return o.color.compareTo(this.color);
	}*/
}

public class TreeMapTest {
	public static void main(String[] args) {
		Dogs d1 = new Dogs("red", 30);
		Dogs d2 = new Dogs("black", 20);
		Dogs d3 = new Dogs("white", 10);
		Dogs d4 = new Dogs("white", 40);
		TreeMap<Dogs, Integer> treeMap = new TreeMap();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		for (Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}