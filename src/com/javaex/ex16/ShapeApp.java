package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[6];
		
		//사각형 2개
		Shape r01= new Rectangle("빨강","검정",4,4);
		Shape r02= new Rectangle("주황","검정",5,5);
		//원 두개
		Shape c01 = new Circle("노랑","검정",6);
		Shape c02 = new Circle("초록","검정",7);
		//삼각형두개
		Shape t01 = new Triangle("파랑","검정",7,7);
		Shape t02 = new Triangle("검정","노랑",7,5);
		
		//배열에 도형
		sArray[0] = r01;
		sArray[1] = r02;
		sArray[2] = c01;
		sArray[3] = c02;
		sArray[4] = t01;
		sArray[5] = t02;
		
		
		for (int i =0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
	}

}
