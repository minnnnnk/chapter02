package com.javaex.ex08;

public class TV {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	
	
	
	//생성자
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.power = power;
		this.volume = volume;
	}
	
	
	//메소드 -gs
	public int getChannel() {
		return channel;
	}
	public int getVoluem() {
		return volume;
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
			this.volume = 100;
		} else if (volume<0) {
			this.volume = 0;
		}
	}
	
	public void volume(boolean volume) {
		if (volume == true) {
			this.volume++;
		} else {
			this.volume--;
		}
	}
	public void status() {
		System.out.println(volume);
		System.out.println(channel);
	}
}
