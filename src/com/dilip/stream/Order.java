package com.dilip.stream;

public class Order {
	private int orderId;
	private String orderName;
	private int price;
	private String orderCat;
	Address address;

	public Order(int orderId, String orderName, int price, String orderCat, Address address) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
		this.orderCat = orderCat;
		this.address = address;
	}

	public Order(int orderId, String orderName, int price, String orderCat) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
		this.orderCat = orderCat;
	}
	public Order(int orderId, int price, String orderName) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.price = price;
	}
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrderCat() {
		return orderCat;
	}

	public void setOrderCat(String orderCat) {
		this.orderCat = orderCat;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderName=" + orderName + ", price=" + price + ", orderCat=" + orderCat
				+ "]";
	}
}
