package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		/*
		Shape s01 = new Shape("빨강","노랑");
		System.out.println(s01.toString());
		
		s01.draw();
		*/
		Rectangle[] rArray = new Rectangle[2];
		Circle[] cArray = new Circle[2];
		Triangle[] tArray = new Triangle[2];
		
		
		Rectangle r01 = new Rectangle("빨강","검정",6,4);
		Rectangle r02 = new Rectangle("파랑","검정",7,7);
		
		rArray[0] = r01;
		rArray[1] = r02;
		
		for (int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Circle c01 = new Circle("파랑","빨강",3);
		Circle c02 = new Circle("검정","파랑",6);
		
		cArray[0] = c01;
		cArray[1] = c02;
		
		for (int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle t01 = new Triangle("초록","파랑",6,8);
		Triangle t02 = new Triangle("빨강","검정",4,4);
		
		tArray[0] = t01;
		tArray[1] = t02;
		
		for(int i = 0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
	}

}
