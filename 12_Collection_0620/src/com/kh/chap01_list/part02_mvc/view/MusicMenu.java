package com.kh.chap01_list.part02_mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.chap01_list.part02_mvc.controller.MusicController;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

// 화면을 담당하는 클래스 (출력문, 입력문)
/**
 * @author	lsj
 * @since	2023.06.20
 * @version	1.0
 */
public class MusicMenu {
	
	// 전역으로
	private MusicController mc = new MusicController();	//**
	private Scanner sc = new Scanner(System.in);
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n============ Welcome 별밤 ============");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정곡 삭제");
			System.out.println("4. 특정곡 검색");
			System.out.println("5. 특정곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			
			sc.nextLine();
			
			switch(menu) {
			case 1 : 
				insertMusic();
				break;
			case 2 : 
				selectMusic();
				break;
			case 3 : 
				deleteMusic();
				break;
			case 4 : 
				searchMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 : 
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				return; //**해당 메소드 종료
			default : 
				System.out.println("메뉴를 잘못 선택했습니다. 다시 선택해주세요.");
				break;
			}
		}
	}
	
	
	// [메소드명 누르고 alt + shift + j]
	/** 
	 * 1. 새로운 곡 추가하는 서브화면
	 */
	public void insertMusic() {
		System.out.println("\n============= 새로운 곡 추가 메뉴 (곡 추가하고 끝.)=============");
		
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 곡이 추가되었습니다.");
	}
	
	/** 
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n============= 전체 곡 조회 (곡이 있거나, 없거나) =============");
		
		/*
		ArrayList<Music> list = mc.selectMusic();
		// 밑에 요렇게 하려고 담는건가..?
		
		if(list.isEmpty()) {
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		*/
		
		mc.selectMusic();
		System.out.println(mc.selectMusic());
		
	}
	
	/** 
	 * 3. 특정 곡 삭제해주는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n============= 특정 곡 삭제 (삭제할 곡을 발견했거나, 못했거나) =============");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result == 1) {
			System.out.println("삭제되었습니다.");
			selectMusic(); // 여기에 있는 메소드 호출할거니까
		}else {
			System.out.println("삭제할 곡을 찾지 못했습니다.");
		}
	}
	
	/** 
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n============= 특정 곡 검색 (곡을 검색하여 찾았거나, 못찾았거나) =============");
		
		System.out.print("찾고싶은 곡명(키워드): ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);	//new 배열리스트
		
		System.out.println("\n===== 검색 결과 ======");
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
	}
	
	/** 
	 * 5. 특정 곡 수정해주는 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n============= 특정 곡 수정 (수정할 곡을 찾았거나, 못찾았거나)=============");
		
		System.out.print("수정할 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("원하는 곡명 : ");
		String upTitle = sc.nextLine();
		
		System.out.print("원하는 가수 : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result == 0) {
			System.out.println("수정할 곡을 찾지 못했습니다.");
		}else {
			System.out.println("원하시는 곡명과 가수로 모두 수정되었습니다.");
			selectMusic();
		}
		
	}
	
}
