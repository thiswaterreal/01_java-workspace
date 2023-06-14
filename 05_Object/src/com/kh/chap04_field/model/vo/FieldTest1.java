package com.kh.chap04_field.model.vo;

/*
 * >> 변수 구분
 * 
 * - 전역 변수 : 클래스 영역에 바로 선언한 변수 --> 클래스 내에서면 어디서든 전역으로 다 사용 가능하다.
 * - 지역 변수 : 클래스 영역내에 어떤 특정한 구역 ({}) 에 선언한 변수 --> 선언된 해당 지역에서만 사용 가능하다.
 * 				* 특정한 구역 : 메소드{}, 제어문(if,for){} 등..
 * 
 * 1. 전역변수
 * - 필드 == 멤버변수 == 인스턴스 변수
 * 생성시점 : new 연산자를 통해서 객체 생성시
 * 소멸시점 : 객체 소멸시 같이 소멸
 * 
 * - 클래스 변수 == static 변수 => 예약어 쓸 수 있는데 static이라는걸 쓰면 클래스 변수가 된다.
 * 생성시점 : 프로그램 실행(해당 객체 생성 안돼도)과 동시에 무조건 메모리 영역(static) 영역
 * 소멸시점 : 프로그램 종료될때 소멸
 * 
 * 
 * 2. 지역변수
 * 생성시점 : 지역변수가 속해있는 특정한 구역({}) 실행(=호출)시 메모리 영역에 할당
 * 소멸시점 : 특정한 구역({}) 종료시 소멸
 * 
 */



public class FieldTest1 { // 클래스 영역 시작
	
	/*
	// 전역변수
	private int a;
	
	public void method1() {
		// 지역변수
		int b = 10;
		System.out.println(b);
		
		if(true) {
			// 지역변수
			int c = 20;
			System.out.println(b);	// 가능
		}
		//System.out.println(c);	// 불가능
	}
	
	public void method2() {
		System.out.println(a);		// 가능 	(전역변수)
		//System.out.println(b);	// 불가능 (지역변수 : 영역이 다르기 때문)
	}
	*/
	
	
	
	// 멤버변수 (인스턴스변수) => 전역변수
	private int global;
	
	public void test(int num) {
					// 매개변수(일종의 지역변수. 즉, 메소드 영역 내에서만 쓸 수 있음)
		
		// 지역변수(메소드 영역내에 선언) => 지역변수에는 접근제한자 같은거 붙이는거 아님
		int local = 10;
		
		// 멤버변수 출력 => 멤버변수는 해당 이 객체 생성시 JVM이 기본값으로라도 초기화
		System.out.println(global); // 초기화 안돼있음. 근데 오류 안남. (heap영역에 생성될 떄 초기화가 자동으로 되기 때문)
		
		// 매개변수 출력 => 매개변수는 해당 이 메소드 호출시 반드시 값이 전달될것이기 때문에 초기화 안돼있어도 됨.
		System.out.println(num);	// 초기화 안돼있음. 근데 오류 안남. (매개변수로 무조건 하나는 넘어올거니까)
		
		// 지역변수 출력
		System.out.println(local);	// 초기화 안돼있음. int local; 이건 오류남 (따라서 int local = 10; 이렇게 초기화(값지정)해줘야함)
		
		
	}


} // 클래스 영역 끝
