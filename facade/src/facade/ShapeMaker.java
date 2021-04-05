package facade;

public class ShapeMaker {

	private Shape cir;
	private Shape rect;
	private Shape squ;

	public ShapeMaker() {
		this.cir = new Circle();
		this.rect = new Rectangle();
		this.squ = new Square();
	}

	public void drawCircle() {
		cir.draw();
	}

	public void drawRectnagle() {
		rect.draw();
	}

	public void drawSquare() {
		squ.draw();
	}

}
