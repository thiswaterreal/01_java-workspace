package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		
		// 복습 //
		
		
		// 방법1. 기본생성자로 생성한 후 setter 메소드를 이용해서 값 초기화
		/*
		Book bk = new Book();	// 기본생성자만 만들었을 땐 : null, null, 0, null
		
		bk.setTitle("자바의 정석");
		bk.setAuthor("차은우");
		bk.setPrice(10000);
		bk.setPublisher("kh");
		*/
		
		
		// 방법2. 매개변수 생성자를 통해서 아싸리 생성과 동시에 값 초기화
		// Book bk = new Book("자바의 정석", "차은우", 10000, "kh");
		
		
		// [응용] 사용자에게 입력받은 값으로 객체 생성 후 초기화
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		Book bk = new Book(title, author, price, publisher); // 매개변수 생성자 //입력받
		
		System.out.println(bk.information());
		*/
		
		
		// 세개의 Book 객체를 관리해야 한다면?
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		// 3권의 도서에 대한 정보를 반복적으로 사용자에게 입력 받기
		// => 입력받은 후 각 객체 생성과 동시에 값 초기화(값대입)
		for(int i=0; i<3; i++) { // i = 0, 1, 2
			
			System.out.println(i+1 + "번째 도서정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
			// 객체 생성 끝
			
			// 전체 도서 정보 조회하기 => 일일히 각 객체의 출력문 작성(반복문 활용x)
			System.out.println(bk1.information());
			System.out.println(bk2.information());
			System.out.println(bk3.information());
			
			// 도서 제목으로 검색하는 서비스
			System.out.print("검색할 책 제목 : ");
			String search = sc.nextLine();
			
			if(bk1.getTitle().equals(search)) {
				System.out.println(bk1.information());
			}
			if(bk2.getTitle().equals(search)) {
				System.out.println(bk2.information());
			}
			if(bk3.getTitle().equals(search)) {
				System.out.println(bk3.information());
			}
		
			
			
			
		}
	
	}


