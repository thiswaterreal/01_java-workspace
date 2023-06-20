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
	private MusicController mc = new MusicController();
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
		
		System.out.println("곡 추가가 완료되었습니다.");
	}
	
	/** 
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n============= 전체 곡 조회 (곡이 있거나, 없거나) =============");
		
		ArrayList<Music> list = mc.selectMusic();	//**
	
		if(list.isEmpty()) {
			System.out.println("존재하는 곡이 없습니다.");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
	}
	
	/** 
	 * 3. 특정 곡 삭제해주는 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n============= 특정 곡 삭제 (삭제할 곡을 발견했거나, 못했거나) =============");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);	//**
		
		if(result == 0) {
			System.out.println("삭제할 곡을 찾지 못하였습니다.");
		}else {
			System.out.println("삭제를 완료하였습니다");
			selectMusic();
		}
	}
	
	/** 
	 * 4. 특정 곡 검색해주는 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n============= 특정 곡 검색 (곡을 검색하여 찾았거나, 못찾았거나) =============");
		/* 1. 기본버전
		System.out.print("검색할 곡명 (키워드) : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);
		*/
		
		// 2. 심화버전
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.print(">> 메뉴 선택 : ");
		int menu = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu, keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색하신 곡을 찾지 못하였습니다.");
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
		
		System.out.print("곡명을 수정하세요 : ");
		String upTitle = sc.nextLine();
		
		System.out.print("가수를 수정하세요 : ");
		String upArtist = sc.nextLine();
		
		int result = mc.updateMusic(title, upTitle, upArtist);
		
		if(result == 0) {
			System.out.println("수정할 곡을 찾지 못하였습니다.");
		}else {
			System.out.println("수정을 완료하였습니다.");
			selectMusic();
		}
		
	}
	
	
	// [의문]
	
	/*[ArrayList<>형인 list 반환]
	// 3.
	public void deleteMusic() {
		System.out.println("\n============= 특정 곡 삭제 (삭제할 곡을 발견했거나, 못했거나) =============");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		ArrayList<Music> list = mc.deleteMusic(title);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	*/
	
	/* [result 활용한 값 반환]
	// 3.
	public void deleteMusic() {
		System.out.println("\n============= 특정 곡 삭제 (삭제할 곡을 발견했거나, 못했거나) =============");
		
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);	//**
		
		if(result == 0) {
			System.out.println("삭제할 곡을 찾지 못하였습니다.");
		}else {
			System.out.println("삭제를 완료하였습니다");
			selectMusic();
		}
	}
	*/
	
	
	
	
	
	
}
