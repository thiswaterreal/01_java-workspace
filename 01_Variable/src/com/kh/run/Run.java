package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;

public class Run {
	public static void main(String[] args) {
		A_Variable a = new A_Variable();
		// 클래스명 별칭 = new 클래스명();  //다른 클래스를 연결
		
		// a.printVariable();
		// a.decleareVariable();
		// 별칭a라는 클래스 안에 있는 printVariable 메소드를 가져와서 돌림
		
		B_KeyboardInput b = new B_KeyboardInput();
		// 클래스명 별칭 = new 클래스명();
		// b.inputTest1();
		// b.inputTest2();
		// b.inputTest3();
		// b.inputTest4();
		b.charAtTest();
	}
}
