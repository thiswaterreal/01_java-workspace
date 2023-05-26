package com.kh.operator;

public class C_Arithmetic {

	/*
	 * 산술연산자 (이항연산자 == 두개의 값을 가지고 연산)
	 * + - * / %
	 * 
	 * (* / %) > (+ -)
	 */
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		//System.out.println("num1 + num2 = " + num1 + num2); // "num1 + num2 = " 이것이 문자열이기 때문에 전부 문자열로 인식하여 출력 //103출력
		System.out.println("num1 + num2 = " + (num1 + num2)); // ()로 묶어주어 먼저 계산되도록 //13출력
		//System.out.println("num1 - num2 = " + num1 - num2); // 에러 발생 : 문자-숫자 불가
		System.out.println("num1 - num2 = " + (num1 - num2)); // 7출력
		System.out.println("num1 * num2 = " + (num1 * num2)); // 곱셈연산은 우선순위 먼저! 가독성 위해 () 묶어줌
		System.out.println("num1 / num2 = " + (num1 / num2)); // 나누기 연산시 몫 출력
		System.out.println("num1 % num2 = " + (num1 % num2)); // 나누기 연산시 나머지 출력 (짝홀 : 가장 많이 사용)
		
		// 값 % 2 == 0 라는 건 '짝수'
		// 값 % 2 == 1 라는 건 '홀수'
		
		// 값 % 5 == 0 라는 건 '5의 배수'
		// 값 % 3 == 0 라는 건 '3의 배수'
		
	}
	
	public void quiz1() {
	      int a = 5;
	      int b = 10;
	      
	      int c = (++a) + b; // a=6, b=10, c=16
	      int d = c / a; // a=6, b=10, c=16, d=2
	      int e = c % a; // a=6, b=10, c=16, d=2, e=4  
	      int f = e++;   // a=6, b=10, c=16, d=2, e=4(5), f=4
	      int g = (--b) + (d--); // a=6, b=9, c=16, d=2(1), e=5, f=4, g=11
	      int h = 2; // a=6, b=9, c=16, d=1, e=5, f=4, g=11, h=2
	      int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h);
	      // a=6, b=9, c=15, d=1, e=6, f=4, g=11(10), h=2, i=?
	      // 6 + 9 / (15 / 4) * (11 - 1) % (6 + 2)
	      // 6 + 9 / 3 * 10 % 8
	      // 6 + 3 * 10 % 8
	      // 6 + 30 % 8
	      // 6 + 6
	      // 12 = i
	      
	      // a=6, b=9, c=15, d=1, e=6, f=4, g=10, h=2, i=12
	   
	      System.out.println("a : " + a); 
	      System.out.println("b : " + b); 
	      System.out.println("c : " + c);   
	      System.out.println("d : " + d);   
	      System.out.println("e : " + e);   
	      System.out.println("f : " + f);   
	      System.out.println("g : " + g);   
	      System.out.println("h : " + h);   
	      System.out.println("i : " + i);   
	   }
	
}
