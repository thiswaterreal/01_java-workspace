package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {

		// (복습)
		int[] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
				
		// for loop문 => 단순한 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		////////////////// 여기부터 시작 ////////////////////
		
		Phone[] phones = new Phone[3];	// 배열 생성!!
		
		/*
		System.out.println(phones);		// 주소값 나옴
		System.out.println(phones[0]);	// null
		*/
		
		phones[0] = new Phone(); //기본생성자	// null null null null
		phones[1] = new Phone("아이폰", "애플", 1380000, "14pro");
		phones[2] = new Phone("갤럭시", "삼성", 1200000, "s23");
		
		phones[0].setName("벨벳폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(1000000);
		phones[0].setSeries("1");
		
		int total = 0;
		for(int i=0; i<phones.length; i++) { // 0, 1, 2
			System.out.println(phones[i].information()); // 전체(3) 정보 출력
			total += phones[i].getPrice();	// 누적합
		}
		System.out.println("총 가격 : " + total);
		//System.out.println("평균 가격 : " + total / 3);
		System.out.println("평균 가격 : " + total / phones.length);
		
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력받아
		// 해당 휴대폰을 잧은 후에 그 가격을 알려주도록
		// 구매하고자 하는 휴대폰 이름 입력 : 벨벳폰
		// 당신이 구매하고자 하는 휴대폰의 가격은 1000000원 입니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 이름 입력 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(search)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice() + "원 입니다.");
			}
		}
		

		
	}

}
