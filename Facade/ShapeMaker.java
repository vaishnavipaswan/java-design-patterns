package Facade;

public class ShapeMaker {

	private Circle c;
	private Rectangle r;
	private Square s;
	private Triangle t;
	
	public ShapeMaker() {
		c=new Circle();
		r=new Rectangle();
		t=new Triangle();
		s=new Square();
	}
	void drawCircle() {
		c.draw();
	}
	void drawTriangle() {
		t.draw();
	}
	void drawRectangle() {
		r.draw();
	}
	void drawSquare() {
		s.draw();
	}
}
