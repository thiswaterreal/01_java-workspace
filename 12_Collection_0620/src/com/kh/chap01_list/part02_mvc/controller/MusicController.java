package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!! (메소드 모음집)
public class MusicController {

	ArrayList<Music> list = new ArrayList<>();
	{
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥말고헌삥", "수쟌"));
	}
	
	
	// 1. 곡 추가 (add)
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));		// Music객체생성
	} //다시돌아감
	
	// 2. 전체곡 조회 (return)
	public ArrayList<Music> selectMusic() {
		return list; 	//**
	}
	
	// 3. 특정곡 삭제 (remove)
	public int deleteMusic(String title) {
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);	//** 해당 인덱스 삭제
				result = 1;
				break;
			}
		}
		return result;
	}
	
	// 4. 특정곡 검색 (keyword contain)
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>(); //[] 
		//** 내가 검색한 키워드들만 싹 모아놓은 리스트!! 따로 맹근 것! (zoom 3:10)
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i)); //** 내가 찾은 그것 텅빈 서치리스트에 추가!
			}
		}
		return searchList;
	}
	
	// 4. (심화버전)_메소드 오버로딩 매개변수 다르니까
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(menu == 1) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}else { // menu == 2(가수명)
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList; //**
	}
	
	// 5. 특정곡 수정 (.set--)
	public int updateMusic(String title, String upTitle, String upArtist) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
	}

	
	
	// [의문..] 
	
	// 언제 ArrayList<>형 list인 값 반환하고, 언제 result 활용한 값 반환하나 ??
	// 전체리스트 첫조회(list), 검색결과만모아놓은리스트 첫조회(searchList)
	// 나머지때는 0,1로 결과나누고 리스트 보여주고 싶으면 selectMusic()메소드 호출?
	
	/* [ArrayList<>형인 list 반환]
	// 3. 특정곡 삭제 (remove)
	public ArrayList<Music> deleteMusic(String title) {
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
			}
		}
		return list;
	}
	*/
	
	/* [int형인 result 활용한 값 반환]
	// 3. 특정곡 삭제 (remove)
	public int deleteMusic(String title) {
	
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}
	*/
	
	
}
