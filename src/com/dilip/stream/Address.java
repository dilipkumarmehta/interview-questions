package com.dilip.stream;
public class Address {
	private String pin;
	private String street;

	public Address(String pin, String street) {
		super();
		this.pin = pin;
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + "]";
	}

}
