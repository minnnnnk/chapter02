package com.javaex.ex20;
//정우성
public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile mf= new MyFile();
		
		String str = mf.read("myFile.txt");
		
		System.out.println(str);
		
		String str2 = mf.read2("myFile.txt");
		System.out.println(str2);
	}

}
