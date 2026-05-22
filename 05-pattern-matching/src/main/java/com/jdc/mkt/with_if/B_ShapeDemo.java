package com.jdc.mkt.with_if;

import com.jdc.mkt.Square;
import com.jdc.mkt.Triangle;
import com.jdc.mkt.Shape;

public class B_ShapeDemo {
	public static void main(String[] args) {
		double area = areaWithRecordPattern(new Square(15));
		System.out.println(area);
	}
	
	static double areaWithRecordPattern(Shape shape) {
		if(shape instanceof Triangle(double b,double h)) {
			return (b*h)/2;
			
		}else if(shape instanceof Square(double s)) {
			return Math.pow(s, 2);
			
		}
		return 0;
	}
	
	static double areaWithoutRecordPattern(Shape shape) {
		if(shape instanceof Triangle t) {
			return (t.base()*t.height())/2;
			
		}else if(shape instanceof Square s) {
			return Math.pow(s.width(), 2);
			
		}
		return 0;
	}
}

