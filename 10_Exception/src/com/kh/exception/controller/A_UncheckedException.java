package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {

	/*
	 * * RuntimeException
	 * - 프로그램 실행시 발생되는 예외들
	 * 
	 * * RuntimeException의 후손들
	 * - IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
	 * - NullPointerException : 참조변수가 null로 초기화된 상황에서 null에 접근했을때 발생되는 예외
	 * - ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
	 * - ClassCastException : 허용할 수 없는 형변환이 진행될 떄 발생되는 예외
	 * - NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있음
	 * 	  아싸리 애초에 예외 발생이 안되게끔 if문으로 조건처리 가능
	 */
	
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2;	//에러 발생 ArithmeticException 0으로 나누려했기때문
		
		// 애초에 예외 자체가 발생이 안되게끔 if문으로 조건 검사 <= 예외처리는 아님. 에러나기 전 처리!
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("안녕하세요. 반갑습니다. 계산결과를 알려드리겠습니다.");
		System.out.println("result : " + result);
		*/
		
		// 예외처리 : 예외가 '발생'했을 떄 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * * try catch 방법
		 * 
		 * [표현법]
		 * try {
		 * 		예외가 발생될 수 있는 구분;
		 * }catch(발생될예외클래스 매개변수) {
		 * 		해당 예외가 발생됐을 경우 실행할 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;	// 4, 0
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {	// 예외를 낚아챔
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력을 보고자할 때 실생하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		
		// NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수(-)로 지정하는 경우 발생되는 예외
		// ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스를 가지고 접근시 발생되는 예외
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		//int[] arr = new int[size];
		
		/* if문으로 아싸리 예외자체가 발생이 안되도록 먼저 막는 방법
		if(size >= 101) {
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}
		*/
		
		//System.out.println("100번 인덱스 값 : " + arr[100]);
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수(-)를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}
		
		// 다중 catch 블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method3() {
		
		System.out.print("배열의 크기 : ");
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수(-)를 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다.");
		}catch(InputMismatchException e) {	// import => java.util
			System.out.println("정수로만 입력해야 됩니다.");
		}
		*/
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(InputMismatchException e) {	// 부모에 의해서 얘는 실행이 안됨. 순서가 중요!!
											
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
		}catch(RuntimeException e) {	// 다형성 적용해서 부모타입 예외클래서 작성 가능
										// 모든 자식 예외 발생시 다 받아서 처리할 수 있음
			System.out.println("예외가 발생되긴 했음.. 배열의 크기가 잘못됐던가, 부적잘한 인덱스가 제시됐던가.. 정수로 입력을 안했던가");
		}
		
		// 부모예외클래스와 자식예외클래스를 가지고 catch 블럭을 기술하고자 할 때는
		// 자식예외클래스 catch 블럭이 (부모예외클래스보다)위에 있어야함!! (아니면 unreachable catch block 오류 뜸)
		
		/*
		 * RuntimeException 관련애들은 UnCheckedException (예외처리구문이 필수는 아님)
		 * if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 하는 것임 (예외처리구문이 아님)
		 * try-catch문 : 예외가 '발생'했을경우, 처리해주는 구문을 작성해두는 것
		 * 
		 * 예측가능한 상황은 if문으로 조건검사로 해결하는게 권장사항임!
		 * 부득이하게 조건문으로 핸들링이 안되는 구문은 예외처리 구문으로 작성해둘 것!
		 */
		
	}
	
	
	
	
	
	
}
