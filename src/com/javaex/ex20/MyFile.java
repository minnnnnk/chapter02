package com.javaex.ex20;

import java.io.IOException;

//제임스
public class MyFile {
	//필드
	
	//생성자
	public MyFile() {
		
	}
	//메소드 gs
	
	//메소드 일반
	public String read(String path) {
		String result = "학교종이 떙떙땡 어서모이자";
		return result;
		
	}
	
	public String read2(String path) {
		String result ="";
		try {
			throw new IOException();
		}catch( IOException e) {
			System.out.println(path+  " no file");
		}finally {
			
		}
		return result;
	}
	
}
