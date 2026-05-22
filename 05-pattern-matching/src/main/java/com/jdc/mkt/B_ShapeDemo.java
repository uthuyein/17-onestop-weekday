package com.jdc.mkt;

public class B_ShapeDemo {
	public static void main(String[] args) {
		double area = areaWithRecordPattern(new Square(15));
		System.out.println(area);
	}
	
	static double areaWithRecordPattern(Shapes shape) {
		if(shape instanceof Triangle(double b,double h)) {
			return (b*h)/2;
			
		}else if(shape instanceof Square(double s)) {
			return Math.pow(s, 2);
			
		}
		return 0;
	}
	static double areaWithoutRecordPattern(Shapes shape) {
		if(shape instanceof Triangle t) {
			return (t.base()*t.height())/2;
			
		}else if(shape instanceof Square s) {
			return Math.pow(s.width(), 2);
			
		}
		return 0;
	}
}

sealed interface Shapes permits Triangle, Square {
}

record Triangle(double height, double base) implements Shapes {
}

record Square(double width) implements Shapes {
}
