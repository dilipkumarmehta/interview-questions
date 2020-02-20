package dilip.desing.patter;

public class AbstractFactory {
	public static void main(String[] args) {
		ShapeFactory shapeFac = new ShapeFactory();
		Shape shapeObject = shapeFac.getShapeObject("RAC");
		shapeObject.drow();

		CircleFactory cirFact = new CircleFactory();
		Shape shapeObject2 = cirFact.getShapeObject("CIR");

		shapeObject2.drow();
	}

}

abstract class AbstractFac {

	public abstract Shape getShapeObject(String typename);
}

class ShapeFactory extends AbstractFac {
	@Override
	public Shape getShapeObject(String typename) {
		if (typename.equals("RAC")) {
			return new Rectangle();
		}
		return null;
	}

}

class CircleFactory extends AbstractFac {

	@Override
	public Shape getShapeObject(String typename) {
		if (typename.equals("CIR")) {
			return new Circle();
		}
		return null;
	}

}