package com.javaex.ex14;

public class figure {

	public static void main(String[] args) {
		Ractangle[] rArray = new Ractangle[2];
		Ractangle r1 = new Ractangle("빨강","검정",4,4);
		Ractangle r2 = new Ractangle("주황","검정",5,5);
		rArray[0] = r1;
		rArray[1] = r2;
		
		for(int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		Triangle[] tArray = new Triangle[2];
		Triangle t1 = new Triangle("빨강","검정",4,4);
		Triangle t2 = new Triangle("보라","검정",10,10);
		tArray[0] = t1;
		tArray[1] = t2;
		
		for(int i = 0 ;i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		Circle[] cArray = new Circle[2];
		Circle c1 = new Circle("보라","빨강",3);
		Circle c2 = new Circle("보라","검정",3);
		cArray[0] = c1;
		cArray[1] = c2;
		
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		
		
		
		
	}

}
