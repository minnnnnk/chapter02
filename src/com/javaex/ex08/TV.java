package com.javaex.ex08;

public class TV {
	//필드
	private int channel;
	private int voluem;
	private boolean power;
	
	
	
	
	//생성자
	public TV() {
		
	}
	
	public TV(int channel, int voluem, boolean power) {
		this.channel = channel;
		this.power = power;
		this.voluem = voluem;
	}
	
	
	//메소드 -gs
	public int getChannel() {
		return channel;
	}
	public int getVoluem() {
		return voluem;
	}
	public boolean isPower() {
		return power;
	}
	
	
	//메소드 -일반
	
	
	
	public void power(boolean on) {
		if(on==true) {
			System.out.println("전원이 켜져있습니다");
		} else {
			System.out.println("전원이 꺼져있습니다");
		}
	}
	
	public void channel(int channel) {
		 if (channel>255) {
			 this.channel = 255;
		 } else if (channel<=0) {
			 this.channel = 1 ;
		 }
	}
	
	public void channel(boolean channel) {
		if (channel==true) {
			this.channel++;
		} else  {
			this.channel--;
		}
	}
	
	public void volume(int volume) {
		if (volume>100) {
			this.voluem = 100;
		} else if (volume<0) {
			this.voluem = 0;
		}
	}
	
	public void volume(boolean volume) {
		if (volume == true) {
			this.voluem++;
		} else {
			this.voluem--;
		}
	}
	public void status() {
		System.out.println(voluem);
		System.out.println(channel);
	}
}
