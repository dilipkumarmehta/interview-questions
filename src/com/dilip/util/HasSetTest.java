package com.dilip.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.TreeSet;

public class HasSetTest {
public static void main(String[] args) {
	HashSet s=new HashSet();
	s.add(null);
	s.add(null);
	s.add(null);
	System.out.println(s);
	
	TreeSet tr=new TreeSet<>();
	//tr.add(null);
	//System.out.println(tr);
	
	HashMap hm=new HashMap();
	hm.put(null,null);
	hm.put(null,null);
	System.out.println(hm);
	
	TreeMap tm=new TreeMap();
	//tm.put(null,null);
	System.out.println(tm);
	
 Hashtable ht=new Hashtable();
 //ht.put(null, null);
 System.out.println(ht);
	
	
}
}
