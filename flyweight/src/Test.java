
public class Test {

	private static final String colors[] = { "Red", "Green", "Orange" };

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(1234);
			circle.draw();

		}

	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
