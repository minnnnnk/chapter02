package com.javaex.ex04;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//메모리에 올리는일
	}
	
	public Point(int x, int y) {
		//메모리에 올리는일
		this.x = x;
		this.y = y;
	}
	public Point(int x) {
		//메모리에 올리는일
		this.x = x;
	}
	
	//메소드 -gs
	
	public void setX(int x) {
		 this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//메소드-일반
	public void draw() {
		System.out.println("점[x="+getX()+",  y="+getY()+"]을 그렸습니다.");
	}
}
