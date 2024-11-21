package btgt.btc3.MangRectangleVaTriangle;

public class Rectangle extends Shape {
	private int length, width;

	public Rectangle() {
	}

	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {

		return this.length * this.width;
	}

}
