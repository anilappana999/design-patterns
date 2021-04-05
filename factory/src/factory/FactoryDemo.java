package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		ShapeFactory s = new ShapeFactory();
		
		Shape s1 = s.getShape("RECTANGLE");
		s1.draw();

	}

}
