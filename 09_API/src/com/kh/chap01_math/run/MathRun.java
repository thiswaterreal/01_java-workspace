package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {

		// java.lang.Math (String, Object) => 굳이 import 안해도 사용할 수 있음!
		
		
		// 상수 필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값 : abs(앱솔루트)
		int num = -10;
		System.out.println("절대값 : " + Math.abs(num)); // 오버로딩		// 10
		
		// 올림 : ceil : 크거나 같은 정수값
		double num2 = 4.349;	// 얘보다 크거나 같은 정수값 => 5
		double num3 = -10.594;	// 얘보다 크거나 같은 정수값 => -10
		System.out.println("올림한 결과 : " + Math.ceil(num2));			// 5.0
		System.out.println("올림한 결과 : " + Math.ceil(num3));			// -10.0
		System.out.println("올림한 결과 : " + (int)Math.ceil(num3));	// -10
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num2)); 	// 4
		
		// 버림 : floor
		System.out.println("버림 : " + Math.floor(num2)); 	// 4.0 (4.349 얘보다 작거나 같은 정수값)
	
		// 가장 가까운 정수값을 알아낸 후 실수형으로 반환 : rint
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2)); 	// 4.0
		
		// 제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(num2));			// 2.0
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));	 	// 1024.0
		
		// Math m = new Math();
		
		/*
		 * * Math 특징
		 * - 모든 필드가 상수필드로 이루어짐, 모든 메소드도 static 메소드로 이루어짐 (싹 다 static임)
		 * - 생성자 아싸리 private 로 있음 => 생성 불가하도록!
		 * 
		 * ** 프로그램 실행시, 한번만 메모리 영역에 올려놓고 재사용 하는 개념 => 싱글톤 패턴
		 * ** 나중에 구글에 검색 => openjdk11 document (백과사전)
		 */
		
	}

}
