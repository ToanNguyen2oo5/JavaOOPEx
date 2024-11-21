package btgt.btc3.MangRectangleVaTriangle;

import java.util.Scanner;

public abstract class Shape {
	protected String color;
	public Shape() {};
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public void nhapTT() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập màu: ");
		this.color=input.next();
	}
	public abstract double getArea();

	@Override
	public String toString() {
		return "Shape [color=" + color +  ", getArea()=" + getArea() + "]";
	}

	
	
}
