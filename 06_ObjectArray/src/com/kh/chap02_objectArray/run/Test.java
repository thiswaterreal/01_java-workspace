package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class Test {

	public static void main(String[] args) {
		
		// 배열만 생성
		Phone[] ps = new Phone[3];
		
		//객체생성 및 초기화
		ps[0] = new Phone();
		ps[1] = new Phone("아이폰", "애플", 1380000, "14pro");
		ps[2] = new Phone("갤럭시", "삼성", 1200000, "s23");
		
		ps[0].setName("벨벳폰");
		ps[0].setBrand("엘지");
		ps[0].setPrice(1000000);
		ps[0].setSeries("1");
		
		// 정보 모두 출력
		for(int i=0; i<ps.length; i++) {
			System.out.println(ps[i].information());
		}
		
		// 총가격
		int sum = 0;
		for(int i=0; i<ps.length; i++) {
			sum += ps[i].getPrice();	//**
		}
		System.out.println("총가격 : " + sum);
		
		// 평균가격
		System.out.println("평균가격 : " + sum/ps.length);
		
		// 구매하고자 하는 휴대폰 이름 입력받아 해당 휴대폰 정보 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 휴대폰 이름 : ");
		String buy = sc.nextLine();
		
		for(int i=0; i<ps.length; i++) {
			if(ps[i].getName().equals(buy)) {
				System.out.println(ps[i].information());
			}
		}
		
		
		
		
	}

}
