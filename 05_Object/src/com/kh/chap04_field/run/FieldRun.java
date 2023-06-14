package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {

		// === FieldTest1 ===
		/*
		FieldTest1 f1 = new FieldTest1();
		f1.test(10);
		*/
		
		// === FieldTest2 ===
		/*
		FieldTest2 f2 = new FieldTest2();	// 이때 heap 영역에 필드수(4)만큼 생성
		
		//public
		System.out.println(f2.pub);		// 가능
		
		//protected : 같은 패키지내에서는 접근 가능, 다른 패키지라면 상속구조에서만 접근 가능
		//System.out.println(f2.pro);	// 불가능. 다른 패키지라서
		
		// default : 오로지 같은 패키지 내에서만 접근 가능
		//System.out.println(f2.def);	// 불가능
		
		// private : only 해당 클래스에서만 접근 가능
		//System.out.println(f2.pri);	// 불가능. 무조건 이 화면안에서만 가능하다고 생각
		 */
		
		// === FieldTest3 ===
		System.out.println(FieldTest3.sta);
		
		// 수정하고 싶다면?
		FieldTest3.sta = "ㅋㅋㅋ";
		System.out.println(FieldTest3.sta);
		
		// 근데 절대 변경 안되도록 하고 싶다면? => 상수필드(기울임체)로 선언해야함
		System.out.println(FieldTest3.STA_FIN);
		//FieldTest3.STA_FIN = "ㅎㅎㅎ"; //따라서 이렇게 수정 불가
		
		System.out.println(Math.PI);
		//Math.PI = 2.31; //불가능
		
		System.out.println(Math.random()); // static : 기울임
		
	}

}
