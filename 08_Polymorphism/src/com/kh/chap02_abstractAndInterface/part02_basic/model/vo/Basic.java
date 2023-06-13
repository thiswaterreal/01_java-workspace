package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {	//=====인터페이스=====

	// 추상클래스(abstract class)	: 일반필드 + 일반메소드 [+ 추상메소드]
	// 인터페이스(interface)		: only 상수필드 + 추상메소드
	
	// private int a; 		// 불가능. interface이기 때문에 안됨 (class에서 가능)
	
	/*
	 * public void test() {	// 불가능. interface이기 때문에 안됨 (class에서 가능)
	 * }
	 */
	
	// 인터페이스에서의 필드는 무조건 상수필드임!!
	/*public static final*/ int NUM = 10;
	
	// 인터페이스에서의 메소드는 무조건 추상메소드임!!
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
