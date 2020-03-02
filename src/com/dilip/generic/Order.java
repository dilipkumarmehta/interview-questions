package com.dilip.generic;

class TT extends Order {

	public TT(int id, int price, String catagory) {
		super(id, price, catagory);
		// TODO Auto-generated constructor stub
	}

}
public class Order {
	int id;
	int price;
	String catagory;

	public Order(int id, int price, String catagory) {
		super();
		this.id = id;
		this.price = price;
		this.catagory = catagory;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

}
