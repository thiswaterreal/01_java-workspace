package com.kh.chap02_string.controller;

public class A_StringPoolTest {	//**중요**

	public void method1() {
		
		/*
		String s = "안뇽";	// 참조자료형
		int a = 10;			// 기본자료형
		 */
		
		// 1. 생성자를 통한 문자열 생성
		String str1 = new String("hello");	// 매개변수 생성자
		String str2 = new String("hello");	// 매개변수 생성자
		
		// 주소값이 출력되지 않을까?
		System.out.println(str1.toString());	// hello
		System.out.println(str2);				// hello
		// String 클래스에 toString() 메소드가 이미 오버라이딩 되어있음 (실제 담긴 문자열 반환하도록)
		
		// 동등비교
		System.out.println(str1 == str2); 		// 주소값을 비교하니까 당연히 false
		System.out.println(str1.equals(str2));	// 이제서야 문자열 비교하니까 true (무조건 equals로 비교해야함!)
		// String 클래스에 equals 메소드 이미 오버라이딩 되어있음
		// => Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드임
		// => 그러나 String에 오버라이딩 되어있기때문에 이것을 따름
		
		System.out.println(str1.hashCode());	// 99162322
		System.out.println(str2.hashCode());	// 99162322
		// String 클래스에 hashCode 메소드 이미 오버라이딩 되어있음 (주소값이 아닌 실제 담겨있는 문자열(hello)을 가지고 해쉬코드를 만듦)
		// 따라서 실제 주소값은 다르지만 문자열(hello)을 해쉬코드(십진수)로 바꾼건 같기 때문에 결과가 같음
		
		// 근데 나는 주소값을 꼭 알고싶다
		// System.identitiyHashCode(레퍼런스);
		System.out.println(System.identityHashCode(str1));	// 1651191114
		System.out.println(System.identityHashCode(str2));	// 1586600255
		
	}
	
	public void method2() {
		// 1. 생성자를 통한 문자열 생성
		String str = new String("hello");
		
		// 2. 문자열을 리터럴값으로 생성
		String str1 = "hello";
		String str2 = "hello";
		// String Pool 특징 : 동일한 문자열을 가질 수 없음
		
		System.out.println(str1/*.toString()*/);	// hello
		System.out.println(str2);					// hello
		
		System.out.println(str1.hashCode());		// 99162322
		System.out.println(str2.hashCode());		// 99162322
		
		System.out.println(str1 == str2); 	// 엥? true!! (리터럴값으로 만들었기 때문)
		
		System.out.println(System.identityHashCode(str1));	// 1651191114
		System.out.println(System.identityHashCode(str2));	// 1651191114
		System.out.println(System.identityHashCode(str));	// 1586600255
		
		String str3 = "hi";
		System.out.println(str1 == str3);	// false
		System.out.println(System.identityHashCode(str3));	// 474675244
		
		// String 클래스 == 불변 클래스 (변하지 않는 클래스)
		// 그럼 값을 못바꾸는건가요? 그건 아님..
		// 변경이 가능하긴 하나, 그 자리에서 수정되는 개념은 아님
		str3 = "bye";
		System.out.println(System.identityHashCode(str3)); 	// 932583850
		// 변경하는 순간 기존의 문자열 자리에서 변경되는것이 아닌
		// 새로운 곳을 참조하도록 함 (새로운 주소값 부여받음 == 주소값 변)
		
		str3 = "hello";
		System.out.println(System.identityHashCode(str3)); 	// 1651191114
		
		
	}
	

	
}
