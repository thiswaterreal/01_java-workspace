package com.kh.chap01_abstration.model.vo;

/*
 * * 클래스의 구조
 * public class 클래스명{
 * 
 *  // 필드부
 *  
 *  // 생성자부
 *  
 *  // 메소드부
 * public void method1() {
 * 
 * }
 * 
 * 
 * }
 * 
 */


public class Student { // 학생을 추상화해서 만든 클래스(완벽한 상태는 아님 - 캡슐화 아직 안함)

	// 필드부
	// [표현법]
	// 접근제한자 [예약어] 자료형 변수명
	
	// * 접근제한자 : 여기에 접근할 수 있는 범위를 제한하는 것 (왼쪽으로 갈수록 개방)
	//				public > protected > default > private
	
	public String name; // 이름
	public int age; // 나이
	public double height; // 키
	
	
}
