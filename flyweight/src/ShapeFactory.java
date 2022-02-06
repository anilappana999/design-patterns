
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static final Map circleMap = new HashMap<>();

	public static Shape getShape(String Color) {

		Circle circle = (Circle) circleMap.get(Color);
		if (circle != null) {
			return circle;
		} else {
			circle = new Circle(Color);

			circleMap.put(Color, circle);
		}
		return circle;
	}
}
