package btgt.btc3.resizeablecircle;

public class Circle implements GeometricObject {
	protected double radius =1;

	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 2*this.radius*Math.PI;
	}
	
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
}
