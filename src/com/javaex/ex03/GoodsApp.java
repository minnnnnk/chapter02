package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
	//카메라	
	Goods camera = new Goods();
	camera.setName("니콘");
	camera.setPrice(400000);
	
	String cameraName = camera.getName();
	int cameraPrice = camera.getPrice();
	
	System.out.println(cameraName);
	System.out.println(cameraPrice);
	
	//그램
	Goods computer = new Goods();
	
	computer.setName("LG그램");
	computer.setPrice(900000);

	String computerName = computer.getName();
	int computerPrice = computer.getPrice();
	
	System.out.println(computerName);
	System.out.println(computerPrice);
	
	//컵
	Goods cup = new Goods();
	
	cup.setName("머그컵"); 
	cup.setPrice(2000);
	
	String cupName = cup.getName();
	int cupPrice = cup.getPrice();
	
	System.out.println(cupName);
	System.out.println(cupPrice);
	
	camera.showInfo();
	
	}
	
}
