package com.dilip.clone;

public class GenericsTypeOld<T> {
	private T t;
	public T get() {
		return t;
	}


	public void set(T t) {
		this.t = t;
	}


	public static void main(String args[]){
			GenericsTypeOld<String> type = new GenericsTypeOld();
			type.set("Pankaj"); 
			String str =type.get(); //type casting, error prone and can cause ClassCastException
			System.out.println("done");
			System.out.println(10/0);
		}
}
