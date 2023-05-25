package com.kh.variable;

public class A_Variable {
	
	// 시급, 근무시간, 근무일수를 곱해서 월급을 계산해서 출력하는 '메소드' = printVariable()
	public void printVariable() {
		// 변수 사용 전
		System.out.println("=== 변수 사용 전 ===");
		
		System.out.println("시급 : 9620원");
		System.out.println("근무일수 : 6일");
		System.out.println("근무시간 : 8시간");
		
		// 월급 = 시급 x 근무시간 x 근무일수
		// 이수진 : 0000원 형식으로 출력하고 싶다!
		
		System.out.println("이수진 : " + (9620 * 6 * 8) + "원 벌었어요!");
		System.out.println("차수진 : " + (9620 * 6 * 8) + "원 벌었어요!");
		System.out.println("박수진 : " + (9620 * 6 * 8) + "원 벌었어요!");
		System.out.println("김수진 : " + (9620 * 6 * 8) + "원 벌었어요!");
		System.out.println("마수진 : " + (9620 * 6 * 8) + "원 벌었어요!");
		
		
		
		// 변수 사용 후 
		System.out.println("=== 변수 사용 후 ===");
		
		// = : 대입
		// [표현법] : 자료형(숫자박스:int, 문자박스:String str) 변수명(내가지정) = 값;
		int pay = 10000;
		int day = 6;
		int time = 8;
		
		System.out.println("이수진 : " + (pay * day * time) + "원 벌었어요!");
		System.out.println("차수진 : " + (pay * day * time) + "원 벌었어요!");
		System.out.println("박수진 : " + (pay * day * time) + "원 벌었어요!");
		System.out.println("김수진 : " + (pay * day * time) + "원 벌었어요!");
		System.out.println("마수진 : " + (pay * day * time) + "원 벌었어요!");
		
		/*
		 * 변수를 사용하는 이유
		 * 1. 변수는 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다. /모두가 알기 쉽도록 부여)
		 * 2. 단 한번 값을 기록하고 필요할 때마다 가져다 쓰는 목적으로 쓴다. (재사용성이 높아진다.)
		 * 3. 유지보수를 보다 쉽게 할 수 있다.
		 */
		
		System.out.println("시급 : " + pay);
		
		System.out.print("aaa");   // 출력만 (개행x) 
		System.out.println("bbb"); // 개행 + 출력
	}
	
	
	// 변수의 선언을 공부하기 위한 '메소드' = decleareVariable()
	public void decleareVariable() {
		
		/*
		 * 변수의 선언
		 * 1. 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. (즉, 값을 보관하기 위한 상자를 만들겠다.)
		 * 
		 * [표현법] : 자료형(박스종류) 변수명(박스이름);
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 붙여주는 부분 (의미 부여)
		 * 
		 * 변수 선언시 주의 할 점
		 * 1. 변수 이름은 소문자로 시작 / 단, 합성어는 낙타봉 표기법을 지킬 것! 예약어는 불가!
		 * 2. 같은 영역 안 ({}) 에서는 동일한 변수명으로 선언 불가 / 즉, 중복이 불가능!
		 * 3. 해당 영역 안 ({}) 에서 선언한 변수는 그 영역 안에서만 사용 가능 / 즉, 다른 메소드 에서는 사용이 불가능!
		 */
		// 낙타봉 표기법 => user + name => userName
		// 예약어 => int, class 와 같은 자바가 지정해 놓은 언어
		// 중복 불가능 => 'int pay = 얼마;' 또 'int pay = 얼마;' 불가능
		
		
		
	
		// ----- 자료형에 대한 개념 -----
		// 1. 논리형 (논리값 = true / false)
		boolean isTrue;          // 변수 선언만
		boolean isFalse = false; //1byte, 변수 선언과 동시에 값을 대입
		
		System.out.println("isFalse 의 값 : " + isFalse); //sysout + c + spacebar
		
		isTrue = 1 + 3 > 1; // 1+3 이 1보다 큽니까? 참입니다! (true)
		isFalse = 4 + 2 < 1; // 4+2 가 1보다 작습니까? 거짓입니다! (false)
	
		System.out.println(isTrue);
		System.out.println(isFalse);
		
		// 2. 숫자형
		// 2-1. 정수형 (소숫점x)
		byte bNum = 100;    // 1byte (-128 ~ 127)
		short sNum = 1000;  // 2byte
		int iNum = 10000;   // 4byte (정수형의 기본 자료형)
		long lNum = 100000; // 8byte
		// 2-2. 실수형 (소숫점o)
		float fNum = 0.0f;     // 4byte (소숫점 7자리까지 표현 가능)
							   //       float의 경우 double과 값을 구분하기 위해 값 뒤에 'f'를 붙임
		double dNum = 0.12345; // 8byte (소숫점 15자리까지 표현 가능)
							   //       (실수형의 기본 자료형)
		
		// 3. 문자형
		// 3-1. 문자
		char ch = 'a';  // 2byte (홑따옴표로 담음)
		char kim;
		kim = '김';
		// 3-2. 문자열
		String str;     // 참조자료형 색깔 안바뀜 (종특ㅋㅋ)
		str = "abcde";
		
		// 값이 잘 담겨있는지 확인해보자!
		// 변수명 : 변수값

		System.out.println("bNum : " + bNum);
		System.out.println("sNum : " + sNum);
		System.out.println("iNum : " + iNum);
		System.out.println("lNum : " + lNum);
		System.out.println("fNum : " + fNum);
		System.out.println("dNum : " + dNum);
		System.out.println("ch : " + ch);
		System.out.println("kim : " + kim);
		System.out.println("str : " + str);
		
		
		// 상수의 선언
		// [표현법] final 자료형 상수이름(대문자);
		final int AGE;
		AGE = 10; // 초기화
		
		// AGE = 11; 상수의 값은 변경이 불가능
		System.out.println("AGE : " + AGE);
		
		// 대표적인 상수의 예 : 3.14 (파이, 원주율)
		System.out.println("파이 : " + Math.PI);
		
		
		
		// * 번외 : 가독성을 위해 언더바_를 사용할 수 있음 (실제로는 숫자만 표현)
		int etc = 999_999_999;
		System.out.println("etc : " + etc);
		
		
		
		// * 변수 명명규칙
		int number;
		
		// 1. 같은 영역 내에 중복된 이름 안됨 (그러나, 대소문자 구분)
		// int number; // 이건 불가능
		int numBer;    // 이건 가능
		
		// 2. 예약어(자바에서 사용되고 있는 키워드) 안됨
		// int true;   
		// int abstract;  // 전부 불가능
		// int class;
		// int static;
		// int public;
		
		// 3. 숫자 사용가능 (단, 숫자로 시작하는건 안됨)
		int number1;
		int num1ber;
		// int 1number;
		
		// 4. 특수문자 사용가능 (단, 오로지 _ 와 $ 만 가능)
		int number_1;
		int number$1;
		// int number!1;
		// int number#1;
		
		
		
		// * 권장사항 (오류는 나지 않지만 지켜줬으면 하는 것) 개발자간의 규칙(매너)
		// 1. 낙타표기법 (합성어 사용시 두번째 단어부터 첫글자를 대문자로 작성)
		String username; // 관례상 틀림
		String userName; // 관례상 옳은 표현
		String userNameTest;
		
		// 2. 한글 사용가능 하지만 무조건 영문자로 작성하자
		String 이름;
		int 나이; // 한글을 사용하지 않는 환경에서는 오류발생 가능성이 있음
		
	}
	
}
