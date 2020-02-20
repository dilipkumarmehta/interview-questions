package dilip.desing.patter;

public interface Shape {

	public void drow();
}

class Circle implements Shape {

	@Override
	public void drow() {
		System.out.println("drow Xircle");

	}

}

class Rectangle implements Shape {

	@Override
	public void drow() {
		System.out.println("Ractangle ");

	}

}

class Square implements Shape {

	@Override
	public void drow() {
		System.out.println("Square");

	}

}