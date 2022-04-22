package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song goodday = new Song();
		
		goodday.setTitle("좋은날");
		goodday.setArtist("아이유");
		goodday.setAlbum("Real");
		goodday.setYear(2010);
		goodday.setTrack("3번 track");
		goodday.setComposer("이민수 작곡");
		
		Song lie = new Song();
		
		lie.setTitle("거짓말");
		lie.setArtist("BIGBANG");
		lie.setAlbum("Always");
		lie.setYear(2007);
		lie.setTrack("2번 track");
		lie.setComposer("G-DRAGON 작곡");
		
		Song ending = new Song();
		
		ending.setTitle("벚꽃엔딩");
		ending.setArtist("버스커버스커");
		ending.setAlbum("버스커버스커1집");
		ending.setYear(2012);
		ending.setTrack("4번 track");
		ending.setComposer("장범준 작곡");
		
		goodday.showInfo();
		lie.showInfo();
		ending.showInfo();
		
	}

}
