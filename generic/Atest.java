package com.generic;

public class Atest<T> {

	T Obj;

	public Atest(T obj) {
		super();
		Obj = obj;
	}

	public T getObj() {
		return Obj;
	}

	public void setObj(T obj) {
		Obj = obj;
	}

}
