package com.dilip.exception;

class CustomExceptionDemo {
	public static void main(String[] args) {
		Test4 t = new Test4();
		for (int i = 2; i < 40; i++) {
			try {
				System.out.println(t.showNumber(i));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class Test4 {
	public int showNumber(int i) {

		if (i % 2 == 0) {
			// throw new NumberDividedByZero(i);
			try {
				throw new NumberDividedByZero(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
			// return i;
		}
		return i;
	}
}