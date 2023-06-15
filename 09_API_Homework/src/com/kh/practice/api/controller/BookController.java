package com.kh.practice.api.controller;

import com.kh.practice.api.model.vo.Book;
import java.text.SimpleDateFormat;
import java.util.Date;


public class BookController {

	// private 접근제한자로 크기 5의 Book 객체 배열 생성
	private Book[] bk = new Book[5];
	
	public void printAll() {
		{
			// 각각의 인덱스에 접근하여 샘플 데이터 넣어서 객체 생성
			bk[0] = new Book("자바의정석", "차은우", "나무", new Date(2023-1900, 5-1, 24), 10000);
			bk[1] = new Book("여러분 화이팅", "주지훈", "사과", new Date(2023-1900, 5-1, 24), 20000);
			bk[2] = new Book("API의 모든 것", "문동은", "오렌지", new Date(2023-1900, 5-1, 24), 35000);
			bk[3] = new Book("언어의 천재", "장원영", "키위", new Date(2023-1900, 5-1, 24), 70000);
			bk[4] = new Book("개발왕국", "시연쌤", "바나나", new Date(2023-1900, 5-1, 24), 80000);
		}
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		// 1) for loop문 방법
		/*
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i]);
		}
		*/
		// 2) for each문 방법 (향상된 for문)
		for(Book a : bk) {
			System.out.println(a);
		}
	}
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값 ==> String --> int로 변환 작업 (int price라는 변수에 담으시오)
		// "20000" --> 20000
		String str = newPrice;
		int price = Integer.parseInt(str);
		
		// 2. 매개변수로 전달받은 newDate값 ==> String --> Date로 변환 작업 (Date publishDate에 담으시오)
		// '-'를 구분자로 StringTokenizer를 이용하여 문자열 분리 후 각각 년,월,일 을 Date에 적용
		// 1) StringTokenizer를 이용한 방법
		// 1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로분리("2020", "07", "01")
		// 1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
		// 1_3) year, month, date 가지고 Date객체 생성하기
		
		
		
		// 2) split 메소드를 이용한 방법
		// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
		// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서int 변수들에 담기
		// 2_3) year, month, date 가지고 Date객체 생성하기
		
		
		
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을가지고
		// Book클래스의 매개변수 생성자를 통해 생성
		
		
		
		
	}
	
	public void printBookPublisherDate() {}
	
	public void searchBook(String searchTitle) {
		
	}
	

	
	
}
