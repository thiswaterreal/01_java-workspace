package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : "양수가 아니다";
		System.out.println(result);
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		System.out.println(result);
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		
		int result1 = (num2 / num1);
		int result2 = (num2 % num1);
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남는 사탕 개수 : " + result2);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		String result = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double point = sc.nextDouble();
		
		//System.out.println("이름 : " + name);
		//System.out.println("학년(숫자만) : " + grade);
		//System.out.println("반(숫자만) : " + cla);
		//System.out.println("번호(숫자만) : " + num);
		//System.out.println("성별(M/F) : " + gender);
		//System.out.println("성적(소수점 아래 둘째자리까지) : " + point);
		
		System.out.println(grade + "학년 " + cla + "반 " + num + "번 " + name + " " + result + "의 성적은 " + point + "이다.");
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "어린이" : (age > 13 && age <= 19) ? "청소년" : "성인";
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int num1 = sc.nextInt();
		
		System.out.print("영어 : ");
		int num2 = sc.nextInt();
		
		System.out.print("수학 : ");
		int num3 = sc.nextInt();
		
		String result = ((num1 >= 40 && num2 >= 40 && num3 >= 40) && ((num1 + num2 + num3) / 3) >= 60) ? "합격" : "불합격";
		
		System.out.println("합계 : " + (num1 + num2 + num3));
		System.out.println("평균 : " + (num1 + num2 + num3) / 3);
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.nextLine().charAt(7);
		
		String result = (num == '1' || num == '3') ? "남자" : "여자";
		System.out.println(result);
	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = (num3 <= num1 || num3 > 2) ? "true" : "false"; 
		System.out.println(result);
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2 || num1 == num3 || num2 == num3) ? "ture" : "false";
		System.out.println(result);
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		String result1 = ((num1 + (num1 * 0.4)) >= 3000) ? "3000 이상" : "3000 미만";
		String result2 = ((num2) >= 3000) ? "3000 이상" : "3000 미만";
		String result3 = ((num3 + (num3 * 0.15)) >= 3000) ? "3000 이상" : "3000 미만";
		
		System.out.println("A사원의 연봉/연봉+a : " + num1 + "/" + (num1 + (num1 * 0.4)));
		System.out.println(result1);
		System.out.println("B사원의 연봉/연봉+a : " + num2 + "/" + (num2));
		System.out.println(result2);
		System.out.println("C사원의 연봉/연봉+a : " + num3 + "/" + (num3 + (num3 * 0.15)));
		System.out.println(result3);
		
	}

	
}
