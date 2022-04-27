package com.javaex.ex16;

public class Circle extends Shape{
	//필드
	private int radius;

	
	
	//생성자
	public Circle() {
		
	}
	public Circle(String fillColor, String lineColor,int radius) {
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}
	
	
	//메소드 gs
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	//메소드 일반
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public void draw() {
		System.out.println("[면색:" + super.fillColor + ", 선색:" + super.lineColor + 
		                        ", 반지름" + this.radius+ 
		                        "] 원을 그렸습니다. " );
	}
	public double area() {
		double area = 3.14*radius*radius;
		return area;
	}
	
}
