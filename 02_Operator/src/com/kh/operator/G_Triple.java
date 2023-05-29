package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*
	 * *삼항연산자 (항목 3개를 가지고 연산해주는 연산자) **중요**
	 * 
	 * [표현식]
	 * 조건식 ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값;
	 * 조건 ? 참일경우 : 거짓일경우;
	 * 
	 * 이때, 조건식은 반드시 true 또는 false가 나오도록 작성해야함!
	 * 주로 비교, 논리연산자를 통해 작성할것임
	 * 
	 */
	
	public void method1() {
		
		// 입력받은 정수 값이 양수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		//String result = (num > 0) ? "양수입니다" : "양수가 아닙니다";	// 가능
		
		// [실습]
		// xx은(는) xxxxx
		// ex) '7은 양수입니다' or '-99는 음수입니다'
		// 조건 : sysout 한번만 사용
		
		// 방법1
		//String result = (num > 0) ? num + " 은(는) 양수입니다" : num + " 은(는) 음수입니다";
		//System.out.println(result);
		
		// 방법2
		System.out.println(num + "은(는) " + ((num > 0) ? "양수입니다" : "음수입니다"));
			
	}
	
	
	public void method2() {
		
		// [실습]
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후
		// ex) '3은 홀수입니다' or '4는 짝수입니다'
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		
		// 방법1
		String result = (num % 2 == 0) ? num + " 은(는) 짝수입니다" : num + " 은(는) 홀수입니다";
		System.out.println(result);
		
		// 방법2
		//String result = (num % 2 == 0) ? " 짝수입니다" : " 홀수입니다";
		//System.out.println(num + "은(는)" + result);
		
		// ** (num % 2 == 0) : 짝수
		// ** (num % 2 == 1) : 홀수
		
	}
	
	
	public void method3() {
		
		// 사용자에게 종료여부를 입력받아 콘솔에서 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니다" : "계속 진행하겠습니다";
		System.out.println(result);
		
	}
	
	
	public void method4() {
		
		// 영문자 입력 받아서, 영어 소문자인지 아닌지 판별 후 출력
		// 'a는 소문자입니다' or 'F는 소문자가 아닙니다'
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자를 입력해주세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'a' && ch <= 'z') ? ch + "는 소문자 입니다" : ch + "는 소문자가 아닙니다";
		System.out.println(result);
		
		// ** (ch >= 'a') && (ch <= 'z') : 소문자
		// ** (ch >= 'A') && (ch <= 'Z') : 대문자
		
	}
	
	
	public void method5() {
		
		// 삼항연산자 중첩
		// [표현식] 조건식 ? 식1 : 식2;
		// 양수(+5), 음수(-5), 0(0)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수입니다" : (num == 0) ? "0입니다" : "음수입니다";
		System.out.println(result);
		
	}
	
	
	public void method6() {
		
		// 사용자에게 두개의 정수를 입력받고
		// + 또는 -를 입력받아 그에 맞는 연산결과 출력
		// 단, + 또는 - 이외의 다른 문자를 입력했을 경우 "잘못 입력했습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 버퍼에 남아있는 엔터 제거를 위한 코드 작성
		sc.nextLine();
		
		System.out.print("연산자 입력 (+ 또는 -) : ");
		char op = sc.nextLine().charAt(0);
		
		String result = (op == '+') ? (num1 + num2 + "") : (op == '-') ? (num1 - num2 + "") : "잘못 입력했습니다";
		// int + int = int
		// int + 문자열 = 문자열 로 바뀜
		// 따라서 에러나지 않도록 + "" 붙여줌
		
		System.out.println("결과 : " + result);
	}
	
}
