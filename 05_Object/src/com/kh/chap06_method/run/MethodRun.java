package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {

		/*
		// --------------NonStaticMethod-------------
		NonStaticMethod n = new NonStaticMethod();
		
		// 1. 매개변수도 없고, 반환값도 없는 메소드 호출
		n.method1();
		
		// 2. 매개변수도 없고, 반환값도 있는 메소드 호출
		n.method2();
		//String str = n.method2(); // 반환값이 있기 때문에 '아 집에가고싶다'를 변수에 저장 가능
		System.out.println(n.method2()); // str에 '아 집에가고싶다'가 담김
	
		// 3. 매개변수 있고, 반환값은 없는 메소드 호출
		// n.method3();				//불가능. 매개변수 없으면 오류남
		// n.method3(10); 			//불가능. 매개변수 개수 맞지 않으면 오류남
		// n.method3("ㅋㅋ","ㅎㅎ");	//불가능. 매개변수 타입 맞지 않으면 오류남
		// n.method3(10,20);		//불가능. 반환값 없어서 변수에 저장 불가
		n.method3(10, 5);
		n.method3(10, 0);
		
		// 4. 매개변수도 있고, 반환값도 있는 메소드 호출
		//char ch = n.method4("lemon", 1);	// ch에 'e'가 담김
		//System.out.println(ch);
		//System.out.println(n.method4("lemon", 1)); //위 두줄을 한방에 쓰기!
		
		// 사용자에게 매개변수(문자열, 정수값)를 입력 받아서 해당 메소드 호출
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("인덱스 입력 : ");
		int index = sc.nextInt();
		
		// 여기서 유효성 검사 해보기
		// index 0 이상이고 문자열의 길이보다 작을때만 method4 실행되도록
		if(index >= 0 && index < str.length()) {
			System.out.println("결과 : " + n.method4(str, index));			
		}else {
			System.out.println("인덱스 값이 부적절합니다.");
		}
		*/
		
		
		
		// --------------StaticMethod-------------
		// 생성없이 바로 호출 가능
		//Math.random();
		StaticMethod.method1();
		
		StaticMethod.method2();
		System.out.println(StaticMethod.method2()); // return 값출력! return값은 출력하지 않으면 볼 수 x (일단 반환만 하기 때문)
		
		StaticMethod.method3("이수진");
		
		StaticMethod.method4("apple", "kiwi");
		System.out.println(StaticMethod.method4("apple", "kiwi")); // return 출력해야만 확인 가능 (sysout으로 찍기)
		
		
		
		// --------------OverloadingTest-------------
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(10,"ㅋㅋ");
		ot.test("ㅋㅋ", 20);
		ot.test(10, 10);
		ot.test("이수진");
		
		// 오버로딩의 대표적인 예 => print() 
		System.out.print(10);
		System.out.print("ㅋㅋ");
		System.out.print(0.5);
		
	}

}
