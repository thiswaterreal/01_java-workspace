package com.kh.chap01;

import java.util.Scanner;

public class ControlPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		}else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요");
		}
		
	}
	
	public void practice3() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int num3 = sc.nextInt();
		
		System.out.println("합계 : " + (num1 + num2 + num3));
		System.out.println("평균 : " + ((num1 + num2 + num3)/3));
		
		if(((num1 + num2 + num3)/3) >= 60) {
			if(num1 > 40 && num2 > 40 && num3 > 40) {		// 1 < num <10 이런게 불가능, 쪼개라!
				System.out.println("축하합니다, 합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 3 :
		case 4 :
		case 5 : System.out.println(num + "월은 봄입니다."); break;
		case 6 :
		case 7 :
		case 8 : System.out.println(num + "월은 여름입니다."); break;
		case 9 :
		case 10 :
		case 11 : System.out.println(num + "월은 가을입니다."); break;
		case 12 :
		case 1 :
		case 2 : System.out.println(num + "월은 겨울입니다."); break;
		default : System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	public void practice5() {							
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		
		String id1 = "myId";
		String pw1 = "myPassword12";
		
		if(id.equals(id1)) {							// 		  문자열 vs 문자열 비교
			if(pw.equals(pw1)) {						// [표현법] 문자열.equals(문자열);
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다");
			}
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}

		}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자" :
			System.out.println("회원관리, 게시글관리, 게시글작성, 댓글작성, 게시글조회");
			break;
		case "회원" :
			System.out.println("게시글작성, 댓글작성, 게시글조회");
			break;
		case "비회원" :
			System.out.println("게시글조회");
			break;
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if(bmi < 23) {
			System.out.println("정상체중");
		}else if(bmi < 25) {
			System.out.println("과체중");
		}else if(bmi < 30) {
			System.out.println("비만");
		}else if(bmi >= 30) {
			System.out.println("고도비만");
		}
		
	}
	
	
	public void practice8() {							
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		double num1 = sc.nextDouble();
	
		System.out.print("피연산자2 입력 : ");
		double num2 = sc.nextDouble();
		
		sc.nextLine(); //**중요** 안띄면 오류남
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		
		
		if(num1 > 0 && num2 > 0) {
			
			switch(op) {
			case '+' :
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));
				break;
			case '-' :
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));
				break;
			case '*' :
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 * num2));
				break;
			case '/' :
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 / num2));
				break;
			case '%' :
				System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 % num2));
				break;
			default :
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			
		}
			
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수(20) : ");
		double mid = sc.nextDouble();
		
		System.out.print("기말 고사 점수(30) : ");
		double fin = sc.nextDouble();
		
		System.out.print("과제 점수(30) : ");
		double pra = sc.nextDouble();
		
		System.out.print("출석 점수(20) : ");
		int att = sc.nextInt();
		
		System.out.println("=============== 결과 ===============");
		
		double all = (mid * 0.2)+(fin * 0.3)+(pra * 0.3)+(att);
		
		
		if(att >= 14) {
			
			System.out.println("중간 고사 점수(20) : " + mid * 0.2);
			System.out.println("기말 고사 점수(30) : " + fin * 0.3);
			System.out.println("과제 점수(30) : " + pra * 0.3);
			System.out.println("출석 점수(20) : " + att);
			System.out.println("총점 : " + all);
			
			if(all >= 70) {
				System.out.println("PASS");
			}else if(all < 70) {
				System.out.println("Fail [점수미달]");
			}
				
		}else {
			System.out.println("Fail [출석 회수 부족 (" + att + "/20)]");
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
	}
	
	}
	
