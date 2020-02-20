package dilip.desing.patter;

public class FacadePatter {
	public static void main(String[] args) {
		Shape shape;
		shape = new Circle();
		shape = new Square();
		shape = new Rectangle();
		shape.drow();

		Shapemaker shapeMaker = new Shapemaker();
		shapeMaker.drowCircle();
	}
}

class Shapemaker {
	private Shape circle;
	private Shape rectangle;
	private Shape square;

	Shapemaker() {
		circle = new Circle();
		rectangle = new Square();
		square = new Rectangle();
	}

	public void drowCircle() {
		circle.drow();
	}

	public void drowSquare() {
		rectangle.drow();
	}

	public void drowRactangle() {
		square.drow();
	}
}
