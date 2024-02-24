package com.dilip.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Serialiation1 {
	public static void main(String[] args) throws ClassNotFoundException {
		String path = "C:\\ATT\\hello.txt";
		File file = new File(path);
		try {
			/*
			 * OutputStream fos = new FileOutputStream(file); Test t = new Test(1, 2,
			 * "dili", "bangalore"); ObjectOutputStream oos = new ObjectOutputStream(fos);
			 * oos.writeObject(t);
			 */
			InputStream input = new FileInputStream(file);
			ObjectInputStream ooins = new ObjectInputStream(input);
			Test t= (Test) ooins.readObject();
			System.out.println(t);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Test implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int a;
	private int b;
	private String name;
	private String address;

	public Test(int a, int b, String name, String address) {
		this.a = a;
		this.b = b;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", name=" + name + ", address=" + address + "]";
	}

}