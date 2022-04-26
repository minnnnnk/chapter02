package com.javaex.ex10;

public class GoodsApp {
	//static 사전조사

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램" , 900000);
		System.out.println(computer.toString());
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		System.out.println(camera.toString());
		
		Goods cup = new Goods("머그컵" , 2000);
		System.out.println(cup.toString());
	}

}
