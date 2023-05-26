package com.kh.operator;

public class A_LogicalNegation {

	/*
	 * 논리 부정 연산자 (단항 연산자 == 하나의 값을 가지고 연산)
	 * !
	 * 논리값(true, false)을 반대로 바꾸는 연산자
	 */
	
	public void method1() {
		
		System.out.println("true의 부정 : " + !true);
		System.out.println("false의 부정 : " + !false);
		
		boolean b1 = true;
		System.out.println("b1의 부정 : " + !b1);
		
		boolean b2 = !b1;
		System.out.println("b2 : " + b2);  // false
		
		boolean b3 = !(5>3);
		System.out.println(b3);  // false
		
	}
	
}
