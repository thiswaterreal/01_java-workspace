package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	// 0. 메소드 생성
	public void practice4() {
		
		// 1. 스캐너 생성
		// 2. 문자열을 입력 받기 + 변수로 저장
		// 3. 출력 (3번)
		// 4. 스캐너 반납
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
		sc.close();
	}
	
}
