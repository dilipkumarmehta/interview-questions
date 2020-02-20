package dilip.desing.patter;

public class FactoryDemo {
	public static void main(String[] args) {
		FactoryExample fact = new FactoryExample();
		Shape shape = fact.getShape("CIRCLE");
		shape.drow();
	}

}

class FactoryExample {

	public Shape getShape(String name) {

		if (name.equals("RACTANGE")) {
			return new Rectangle();
		}
		if (name.equals("CIRCLE")) {
			return new Circle();
		}
		return null;
	}

}