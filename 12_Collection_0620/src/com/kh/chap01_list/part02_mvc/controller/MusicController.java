package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!! (메소드 모음집)
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();		//** ArrayList 'list' **
	
	{
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "이수진"));
	}
	
	// 1. 곡 추가 (add)
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	// 2. 전체곡 조회
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	// 3. 특정곡 삭제 (remove)
	public int deleteMusic(String title) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break; //**
			}
		}
		return result;
	}
	
	// 4. 특정곡 검색
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();	//** ArrayList 'searchlist' **
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
	}
	
	// 5. 특정곡 수정 (.set--)
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break; //**
			}
		}
		return result;
	}

	
	
}
