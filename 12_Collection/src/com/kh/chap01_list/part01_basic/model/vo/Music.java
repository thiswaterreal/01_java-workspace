package com.kh.chap01_list.part01_basic.model.vo;

public class Music {

	private String title;
	private String artist;
	
	public Music() {}
	// o
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// r
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	// s
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}
	
	
	
	
	
}
