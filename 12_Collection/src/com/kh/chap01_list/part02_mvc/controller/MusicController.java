package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스!! 출력문 쓰지 않기!! (메소드 모음집)
public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();	// []
	
	{//(필드부)
		// 초기화 블럭
		list.add(new Music("Attention", "뉴진스"));		// [Music[Attention, 뉴진스]]
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "김시연"));
	}
	
	// 1. 곡 추가 (add)
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));				// **쿠키,뉴진스가 새삥,지코 그 다음으로 추가됨 (Zoom 2:18)
	}
	
	// 2. 전체곡 조회 (return)
	public ArrayList<Music> selectMusic() {		// return쓰기위해 자료형 지정해주자! void => ArrayList<Music>
		// 돌려준다 => return
		return list;
	}
	
	// 3. 특정곡 삭제 (remove)
	public int deleteMusic(String title) {
		
		int result = 0;	// 삭제전
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1; // 삭제됨
				break; 		// 반복문 빠져나오기
			}
		}
		return result; // **반환하는 result 자료형이 int 니까 void => int로 변경~
	}
	
	// 4. 특정곡 검색 (keyword contain)
	public ArrayList<Music> searchMusic(String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();	// []
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i)); // 검색된 객체를 searchList에 추가
			}
		}
		// searchList => 텅 비어있을 수도 있음 or 검색된 Music 객체들이 담겨있을 수도 있음
		return searchList; 	// 잘 담았으니 return => searchList의 반환형을 void 자리에 작성
	}
	
	// 4. (심화버전)
	public ArrayList<Music> searchMusic(int menu, String keyword) {
		
		ArrayList<Music> searchList = new ArrayList<>();	// []
		
		if(menu == 1) {	// 곡명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i)); // 검색된 객체를 searchList에 추가
				}
			}
		}else {	// 가수명으로 검색
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i)); // 검색된 객체를 searchList에 추가
				}
			}
		}
		return searchList;
	}
	
	// 5. 특정곡 수정 (.set--)
	public int updateMusic(String title, String upArtist, String upTitle) {
		
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			Music m = list.get(i);	// list.get(i) 여러번 쓰는것보다 m 한번 쓰기 위해 담음
			if(m.getTitle().equals(title)) {
				m.setTitle(upTitle);
				m.setArtist(upArtist);
				result = 1;
				break;
			}
		}
		return result;
	}
		
		
		
	
	
	
	
	
	
}
