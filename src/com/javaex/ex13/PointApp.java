package com.javaex.ex13;

public class PointApp {

	public static void main(String[] args) {
		Point p = new Point(4,4);
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blud");
		
		p.showInfo();
		cp1.showInfo();
		cp2.showInfo();
	}

}
