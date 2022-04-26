package com.javaex.ex14;

public class figure {

	public static void main(String[] args) {
		Ractangle[] ractangle = new Ractangle[2];
		Ractangle r1 = new Ractangle("빨강","검정",4,4);
		Ractangle r2 = new Ractangle("주황","검정",5,5);
		ractangle[0] = r1;
		ractangle[1] = r2;
		
		for(int i = 0; i<ractangle.length; i++) {
			ractangle[i].draw();
		}
		
		Triangle[] triangle = new Triangle[2];
		Triangle t1 = new Triangle("빨강","검정",4,4);
		Triangle t2 = new Triangle("보라","검정",10,10);
		triangle[0] = t1;
		triangle[1] = t2;
		
		for(int i = 0 ;i<triangle.length; i++) {
			triangle[i].draw();
		}
		
		Circle[] circle = new Circle[2];
		Circle c1 = new Circle("보라","빨강",3);
		Circle c2 = new Circle("보라","검정",3);
		circle[0] = c1;
		circle[1] = c2;
		
		for(int i = 0; i<circle.length; i++) {
			circle[i].draw();
		}
		
		
		
		
		
	}

}
