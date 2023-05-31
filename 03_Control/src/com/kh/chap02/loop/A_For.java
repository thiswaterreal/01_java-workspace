package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/*
	 * 반복문
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두 종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * 
	 * ** for문
	 * 
	 * [표현법]
	 * for(초기식; 조건식; 증감식) {			// 반복 횟수를 지정하기 위해 제시하는 것들
	 * 	반복적으로 실행시키고자 하는 구문;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행"되는 구문
	 * 			(보통 반복문 안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건을 작성"하는 구문
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성한다)
	 * 
	 * - 증감식 : "반복문을 제어하는 변수 값을 증감"시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용함)
	 */
	
	public void method1() {
		
		// "안녕하세요"를 5번 반복해서 실행하기
		for(int i = 1; i<=5; i++) { // i값이 1에서부터 5까지 매번 1씩 증가하는 동안 반복 수행 (1,2,3,4,5 => 5회 수행)
			// 반복할 코드				// 선처리 후증감
			System.out.println("안녕하세요");
		}
		
		for(int i = 0; i<=4; i++) { // i값이 0에서부터 4까지 매번 1씩 증가하는 동안 반복 수행 (0,1,2,3,4 => 5회 수행)
			System.out.println("반갑습니다");
		}
		
		for(int i = 11; i<=15; i++) { // (11,12,13,14,15 => 5회 수행)
			System.out.println("저리가세요");
		}
		
		for(int i = 1; i<=9; i+=2) { // i값이 1에서부터 9까지 매번 2씩 증가하는 동안 반복 수행 (1,3,5,7,9 => 5회 수행)
			System.out.println("미안합니다");
		}
		
	}
	
	public void method2() {
		
		// 1부터 5까지 출력
		// for문
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		// 1 2 3 4 5 (사이사이 공백을 넣어서 출력) //print
		for(int i=1; i<=5; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method3() {
		
		// 5 4 3 2 1 출력
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method4() {
		
		// 1~10까지의 홀수 출력
		// 1 3 5 7 9
		
		/* 방법1
		for(int i=1; i<=9; i+=2) {		 // i값이 1부터 9까지 매번 2씩 증가되는 동안 반복 수행 (5번)
			System.out.print(i + " "); // 'i+=2' : 2씩 증가
		}
		*/
		
		// 방법2
		for(int i=1; i<=10; i++) {		 // i값이 1부터 10까지 매번 1씩 증가되는 동안 반복 수행 (10번)
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		
		// 1~10까지의 짝수 출력
		// 2 4 6 8 10
		for(int i=2; i<=10; i+=2) {		// 'i+=2' : i값에 2씩 증가
			System.out.print(i + " ");
		}
		
	}
	
	public void method5() {
		
		// 1 2 3 4 ... 8 9 10 for문 고정
		for(int i=0; i<=9; i++) {
			System.out.print((i+1) + " ");
		}
		
	}
	
	public void method6() {
		
		// 1에서부터 10까지의 총 합계
		
		// 방법1. int sum = 1 + 2 + ... + 10;
		
		// 방법2.
		/*
		 * int sum = 0;
		 * sum += 1; => sum = sum + 1; 0 + 1
		 * sum += 2; => sum = sum + 2; 0 + 1 + 2
		 * sum += 3; => sum = sum + 3; 0 + 1 + 2 + 3
		 * ...
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙을 찾자!
		 * sum 변수에 누적해서 합산하는게 반복적으로 진행됨
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는것을 파악할 수 있음
		 * 
		 */
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; // **누적합 공식 (모르겠으면 일단 암기!) //sum에 i씩만큼 증가하여 더해줌
		}
		
		System.out.println("1부터 10까지의 합 : " + sum);
		
	}
	
	public void method7() {
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * 
		 * sum += i; (누적합 공식)
		 */
		
		// 사용자에게 값을 입력받아 '1부터 ~ 입력받은 수' 까지의 합계 출력
		Scanner sc = new Scanner(System.in);
		
			
			System.out.print("1이상의 정수 : ");
			int num = sc.nextInt();
			
			if(num > 0) {
				// 누적합
				// 1. sum 변수만들기
				int sum = 0;
				// 2. for문 돌리기
				for(int i=1; i<=num; i++) {
					// 누적합 공식
					sum += i;
				}
				System.out.println("1부터 " + num + "까지의 합 : " + sum);
				
				
			}else {
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
			
		}
		
	
	
	public void method8() {
		
		// 1에서부터 어떤 랜덤값(1~10 사이의 랜덤값) 까지의 총 합계
		
		// 자바에서 제공하는 클래스 (Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서
		 * 매번 다른 랜덤값을 얻어 낼 수 있음
		 * Math.random(); 이런식으로 호출 => 0.0 ~ 0.999999 사이의 랜덤값 발생
		 * 								(0.0 <=		<1.0)
		 */
		
		// int random = Math.random(); //불가능, double형이라서 안됨
		//				0.0 ~ 1.0		0.0 ~ 0.999999
		// int random = Math.random() * 10;
		//				0.0 ~ 10.0		0.0 ~ 9.99999
		// int random = Math.random() * 10 + 1;
		//				1.0 ~ 11.0		1.0 ~ 10.99999
		int random =(int)(Math.random() * 10 + 1);			// 1부터 10까지 랜덤수 공식
		//				1 ~ 11			1 ~ 10				// 시작수(+), 마지막수(*)
		
		System.out.println("1~10 사이의 랜덤값 : " + random);
		
		// 누적합 구하는 방법
		// 1. sum 변수 만들기
		int sum = 0;
		// 2. for문 돌리기
		for(int i=1; i<=random; i++) {
			// 누적합 공식
			sum += i;
		}
		// 1부터 random 까지의 합계
		System.out.println("1부터 " + random + "까지의 합계 : " + sum);
		
	}
	
	public void method9() {
		
		String str = "Hello";
		
		// 각 인덱스별 문자를 뽑아서 출력
		/*
		 * H	=> str.charAt(0); 출력
		 * e	=> str.charAt(1); 출력
		 * l	=> str.charAt(2); 출력
		 * l	=> str.charAt(3); 출력
		 * o	=> str.charAt(4); 출력
		 * 
		 */
		
		for(int i=0; i<=4; i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public void method10() {
		
		// 사용자에게 문자열 입력받아서 (str 변수에 대입)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		// 각 인덱스별 문자를 뽑아서 출력
		
		// apple의 길이 : 5글자
		// 01234
		
		// strawberry : 10글자
		// 0123456789
		
		// kiwi : 4글자
		// 0123
		
		// 아하! 마지막 인덱스는 항상 (문자열의 길이 -1) 이구나!
		// 추출하고자 하는 인덱스값이 (문자열의 길이 -1) 까지 매번 1씩 증가
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i=0; i<str.length(); i++) {	// 0~5 => 0 1 2 3 4 5
			System.out.println(str.charAt(i));	// i<str.length();  ==  i<=str.length()-1;  
		}
		
	}
	
	public void method11() {
		
		// 구구단 출력
		// 2단 출력하기
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 */
		
		for(int i=1; i<10; i++) {
			//System.out.println("2 x " + i + " = " + 2 * i); //가능
			System.out.printf("%d x %d = %d\n", 2, i, 2*i);
		}
		
	}
	
	public void method12() {
		
		// 사용자에게 단을 입력받아 구구단 출력
		// int dan;
		// 2~9 사이의 정수를 입력 => 가이드 문구
		// 다른 숫자를 입력했을 경우 : 2~9 사이의 숫자를 입력해주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2~9 사이의 정수를 입력 : ");
		int dan = sc.nextInt();
		
		if(dan >= 2 && dan <= 9) {
			for(int i=1; i<=9; i++) {
				//System.out.println(dan + " x " + i + " = " + dan*i);
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 2~9 사이의 숫자를 입력해주세요");
		}
	}
	
	public void method13() {
		
		// 2부터 9사이의 랜덤값 발생시켜서 랜덤단 출력		// 2~9 (랜덤값)
		int dan = (int)(Math.random() * 8 + 2);	// 2가 시작수, **시작수로부터 몇개의 랜덤값을 발생시킬지** 곱하면 된다.
		
		System.out.println("===" + dan + "단 ===");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", dan, i, dan*i);
		}
		
	}
	
	public void method14() {
		
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5	// for 중첩
		
		for(int j=1; j<=3; j++) {				// x 3
			
			for(int i=1; i<=5; i++) {			// 1 2 3 4 5
				System.out.print(i + " ");
			}
			
			System.out.println();			
		}
		
	}
	
	public void method15() {
		
		// ****
		// ****
		// ****
		// ****
		
		// 행은 1~4 까지 반복 => 바깥족 for문
		// (매 행 고정일 때) 열은 1~4 까지 반복 => 안쪽 for문
		
		for(int j=1; j<=4; j++) {
			
			for(int i=1; i<=4; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	public void method16() {
		
		// 1***	=> 1행 1열일때
		// *2** => 2행 2열일때
		// **3* => 3행 3열일때
		// ***4 => 4행 4열일때
		
		for(int j=1; j<=4; j++) {
			
			for(int i=1; i<=4; i++) {
				
				if(j == i) {
					System.out.print(i);		// System.out.print(j); 도 상관없음
				}else {
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
		
	}
	
	public void method17() {
		
		// 2단부터 9단까지 출력
		// 1. 한단을 나오게 해
		// 2. for문으로 돌려
		
		for(int d=2; d<=9; d++) {
			
			for(int i=2; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", d, i, d*i);
			}
			System.out.println();
			
		}
		
	}
	
	public void method18() {
		
		for(; ;) {	// 조건식 자리 생략시 기본적으로 true => 무한반복문
			System.out.println("안녕");
		}
		
	}

}
