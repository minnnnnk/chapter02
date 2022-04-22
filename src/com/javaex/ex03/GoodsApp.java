package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
	//카메라	
	Goods camera = new Goods();
	camera.setName("니콘");
	camera.setPrice(400000);
	
	
	//그램
	Goods computer = new Goods();
	
	computer.setName("LG그램");
	computer.setPrice(900000);

	//컵
	Goods cup = new Goods();
	cup.setName("머그컵"); 
	cup.setPrice(2000);
	

	
	camera.showInfo();
	computer.showInfo();
	cup.showInfo();
	
	}
	
}
