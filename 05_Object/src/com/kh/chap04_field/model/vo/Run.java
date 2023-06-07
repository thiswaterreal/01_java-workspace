package com.kh.chap04_field.model.vo;

public class Run {

	public static void main(String[] args) {
		// === FieldTest2 ===
		FieldTest2 f2 = new FieldTest2();	// 이때 heap 영역에 필드수(4)만큼 생성
		
		//public
		System.out.println(f2.pub);		// 가능
		
		//protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
		System.out.println(f2.pro);	// 가능
		
		// default : 오로지 같은 패키지 내에서만 접근 가능
		System.out.println(f2.def);	// 가능
		
		// private : only 해당 클래스에서만 접근 가능
		//System.out.println(f2.pri);	// 불가능. 무조건 이 화면안에서만 가능하다고 생각
	}

}
