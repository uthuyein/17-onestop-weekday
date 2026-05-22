package com.jdc.mkt;

@SuppressWarnings("unused")
public class A_ShapeDemo {
	public static void main(String[] args) {
//		Implicit
		Shape circle = new Circle(40);
		Shape rectangle = new Rectangle(30, 20);
		
//		Explicit
		Circle c = (Circle) circle;

		useWithPatternMatching(circle);
	}
	
	static void useWithPatternMatching(Shape shape) {
		if (shape instanceof Circle circle) {
			Circle c = circle;
			System.out.println("This is type of circle."+c.area());
			
		}else {
			System.out.println("This not type of circle.");
		}
	}
	
	static void useWithoutPatternMatching(Shape shape) {
		if (shape instanceof Circle) {
			Circle c = (Circle) shape;
			System.out.println("This is type of circle.");
			
		}else {
			System.out.println("This not type of circle.");
		}
	}
}

sealed interface Shape permits Circle, Rectangle {
	double area();
}

record Rectangle(double width, double length) implements Shape {
	@Override
	public double area() {
		return width * length;
	}
}

record Circle(double radius) implements Shape {
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
