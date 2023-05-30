package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	/*
	 *  * switch문도 if문과 동일하게 조건문임
	 *  
	 *    다만, if문과 차이점 이라면?
	 *    > if문은 조건식을 자유롭게 기술 가능
	 *    > switch문은 동등비교로만 수행 가능!
	 *    
	 *    > 실행할 구문만 실행하고 자동으로 빠져나오지 못함 (** 직접 break; 문 작성해야함)
	 *    > break; 를 만날 때까지 계속 실행
	 *    
	 *    [표현법]
	 *    switch(동등비교할 대상) {
	 *    case 값1 : 실행코드1; break;
	 *    case 값2 : 실행코드2; break;
	 *    case 값3 : 실행코드3; break;
	 *    ...
	 *    default : 위의 값들과 모두 일치하지 않을 경우 실행할 코드; => if문에서 else와 같은 존재  //[생략가능]
	 *    }
	 *    
	 *  * switch문
	 *    조건식 하나로 많은 경우의 수를 처리할 때 사용하며 이때 조건식의결과는 정수 또는 문자, 문자열
	 */
	
	public void method1() {
		
		/*
		 * 정소를 입력받아 => "정수 입력(1~3) : "
		 * 1일 경우 '빨간색 입니다' => case 1 : 빨간색입니다; break;
		 * 2일 경우 '파란색 입니다' => case 2 : 파란색입니다; break;
		 * 3일 경우 '초록색 입니다' => case 3 : 초록색입니다; break;
		 * 
		 * 잘못 입력했을 경우 '잘못 입력하셨습니다' => default
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력(1~3) : ");
		int num = sc.nextInt();
		
		/* 방법1 [if문]
		if(num == 1) {
			System.out.println("빨간색 입니다");
		}else if(num == 2) {
			System.out.println("파란색 입니다");
		}else if(num == 3) {
			System.out.println("초록색 입니다");
		}else {
			System.out.println("잘못 입력하셨습니다");
		}
		*/
		
		// 방법2 [switch문]
		switch(num) {
		case 1 : 
			System.out.println("빨간색 입니다"); 		// num이 1일때 '빨간색 입니다'
			break;
		case 2 : 
			System.out.println("파란색 입니다"); 
			break;
		case 3 : 
			System.out.println("초록색 입니다"); 
			break;
		default : 
			System.out.println("잘못 입력하셨습니다");	// [구문생략가능] [break;생략가능]
		}	
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) 입력 : ");
		String fruit = sc.nextLine();
		int price = 0; 		// String str = ""; <= 자료형초기화
		
		switch(fruit) {
		case "사과" :
			price = 1000;
			break;
		case "바나나" :
			price = 2000;
			break;
		case "복숭아" :
			price = 3000;
			break;
		default :
			System.out.println("해당 과일은 품절입니다");
			return;	//return 해줘야 품절에서 끝남
		}
		
		// 'xx의 가격은 xxxx원 입니다' 출력
		System.out.println(fruit + "의 가격은 " + price + "원 입니다");
		
	}
	
	public void method3() {
		
		/*
		 * 등급별 권한
		 * 1. 읽기권한, 글쓰기권한, 관리권환 
		 * 2. 읽기권한, 글쓰기권한
		 * 3. 읽기권한
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(정수) : ");
		int level = sc.nextInt();
		
		/* 방법1
		switch(level) {
		case 1 :
			System.out.println("읽기권한");
			System.out.println("글쓰기권한");
			System.out.println("관리권한");
			break;
		case 2 : 
			System.out.println("읽기권한");
			System.out.println("글쓰기권한");
			break;
		case 3 : 
			System.out.println("읽기권한");
			break;
		}
		*/
		
		// 방법2 (간단하게!)
		switch(level) {
		case 1 :
			System.out.println("관리권한");
		case 2 : 
			System.out.println("글쓰기권한");
		case 3 : 
			System.out.println("읽기권한");
		}
	}
	
	public void method4() {
		
		// 월을 입력받아 해당 월의 마지막 날짜 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력(정수로) : ");
		int month = sc.nextInt();
		
		// 1, 3, 5, 7, 8, 10, 12	=> 31일
		// 4, 6, 9, 10				=> 30일
		// 2						=> 28일 또는 29일

		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("입력하신 월은 31일 까지입니다"); break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("입력하신 월은 30일 까지입니다"); break;
		case 2 : System.out.println("입력하신 월은 28일 또는 29일 까지입니다"); break;
		default : System.out.println("반드시 1월 ~ 12월까지 입력해야 합니다"); break;
		}
	}
	
}
