package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		Goods computer = new Goods("LG그램" , 900000);
		Goods camera = new Goods("니콘", 400000);
		Goods cup = new Goods("머그컵", 2000);
		
		Goods[] goodsArray = new Goods[3];
		
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		for (int i = 0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}
		
	}

}
