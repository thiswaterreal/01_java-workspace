package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	
	// 0. 메소드 생성
	public void practice2() {
		
		// 1. 스캐너 생성
		// 2. 두 수를 입력받는 가이드 문구 출력 & 입력받기
		// 3. 연산결과 출력
		// 4. 스캐너 반납
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 결과 : " + (num1 / num2));
		
	}
	
}
