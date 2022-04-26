package com.javaex.ex14;

public class Triangle extends Ractangle {
	//필드

	//생성자
	public Triangle() {
		
	}
	public Triangle(String fillColor, String lineColor, int width, int height) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	//메소드 gs
	

		
		
	//메소드 일반
	@Override
	public String toString() {
		return "Triangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	public void draw() {
		System.out.println("면색:"+super.fillColor+", 선색:" +super.lineColor+ ", 가로:" +super.width+", 세로:" +super.height+" 삼각형을 그렸습니다");
	}
	
}
