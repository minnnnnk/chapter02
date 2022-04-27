package com.javaex.ex15;

public class Rectangle extends Shape {
	//필드
	private int width;
	private int height;
	//생성자
	public Rectangle () {
		super();
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	
	
	
	//메소드 gs
	public String getFillColor() {
		return fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	
	//메소드 일반
	@Override
	public String toString() {
		return "Ractangle [fillColor=" + fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("[면색:" + super.fillColor + ", 선색:" + super.lineColor + 
		                        ", 가로:" + this.width + ", 세로:" + this.height + 
		                        "] 사각형을 그렸습니다. " );
	}
	
}
