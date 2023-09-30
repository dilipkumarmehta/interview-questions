package com.dilip.exception;

/**
 * @author Sudhir
 *
 */
public class NumberDividedByZero extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int number;

	public NumberDividedByZero() {

	}

	public NumberDividedByZero(int i) {
		this.number = i;
	}

	public String getMessage() {
		return number+"\t"+"divide by  2";

	}

	@Override
	public String toString() {
		return "NumberDividedByZero [number=" + number + "]";
	}

	
}
