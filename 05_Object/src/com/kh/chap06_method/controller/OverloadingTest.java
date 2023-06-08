package com.kh.chap06_method.controller;

public class OverloadingTest {

	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test() {
		
	}
	
	/* 메소드명 중복 불가
	public void test() {
	
	}
	*/
	
	// 메소드명 중복인데 왜 가능? 매개변수가 있기 때문
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/* 중복임!(불가능) 변수명이 다를뿐이지 그래봤자 int, int 이기 때문에
	 * 오버로딩이 가능하려면 매개변수명이 아니라, 매개변수의 개수와 순서가 다르게 작성돼야 함
	public void test(int c, int d) {
		
	}
	*/
	
	public void test(String str) {
		
	}
	
	/* 중복임!(불가능)
	 * 반환형이 다르더라도 상관없고, 무조건!!!!!!! 매개변수가 달라야 함
	public int test(String str) {
		
	}
	*/
	
	/* 중복임!(불가능)
	 * 반환형이 다르더라도 상관없고, 무조건!!!!!!! 매개변수가 달라야 함
	private void test(String str) {
		
	}
	*/
	
	
	///////////////////// 결론 /////////////////////
	/*
	 * 오버로딩 : 한 클래스 내에 동일한 이름의 메소드들
	 * 			단, 매개변수명, 접근제한자, 반환형을 다 떠나서
	 * 			*** 매개변수의 자료형과 개수, 순서가 다르게 작성되어 있어야 함! ***
	 */
}
