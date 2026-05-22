package com.jdc.mkt.with_switch;


import com.jdc.mkt.Circle;
import com.jdc.mkt.Rectangle;
import com.jdc.mkt.Shape;
import com.jdc.mkt.Square;

public class A_ShapeDemo {

	public static void main(String[] args) {
		double area = useWithRecordPattern(new Square(45));
		System.out.println("Area ::: " + area);
	}

	static double useWithTypePattern(Shape shape) {
		return switch (shape) {
		case Circle c -> Math.PI * Math.pow(c.radius(), 2);
		case Rectangle r -> r.width() * r.height();
		case Square s -> Math.pow(s.width(), 2);
		default -> 0;
		};
	}

	static double useWithRecordPattern(Shape shape) {
		return switch (shape) {
		case Circle(double r)-> Math.PI * Math.pow(r, 2);
		case Rectangle(double w,double h) -> w * h;
		case Square(double w) -> Math.pow(w, 2);
		default -> 0;
		};
	}
}
