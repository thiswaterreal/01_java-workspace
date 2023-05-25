package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	
	public void inputTest1() {
		
		/*
		 * 키보드로 값을 입력받는 방법
		 * Scanner를 사용한다
		 * 즉 java.util.Scanner 클래스를 이용하는 것
		 * Scanner 클래스 내부의 메소드를 호출해서 입력받는 것
		 */
		
		// 스캐너 생성(new) 문법
		Scanner sc = new Scanner(System.in); 
		// 빨간줄 뜬 Scanner에 커서 대면 import 생성 가능
		// System.in 은 입력받은 값을 바이트 단위로 받아들이겠다는 의미 (한줄 한줄 스캔해서)
		
		System.out.print("아무거나 입력해보세요 : ");
		String message = sc.nextLine(); // (입력을 받을 거에요, message에) 이제 콘솔안에 작성 가능
		
		System.out.println("입력받은 내용 : " + message);
		
		sc.close(); // 스캐너 사용시 항상 반납할 것
	}
	
	// 개인테스트 :
	// 1. inputTest2() 메소드 생성
	// 2. 스캐너 생성
	// 3. 가이드 문구 (당신의 이름은 무엇입니까?)
	// 4. 이름을 변수에 저장
	// 5. 콘솔에 출력
	// 6. 스캐너 반납
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.nextLine();
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (nextLine(), next())
		// String name = sc.next();   
		// next() : 사용자가 입력한 값 중 공백이 있을 경우 공백 이전까지의 값만 읽어옴
		//			따라서 주소지처럼 공백이 있는 데이터는 제대로 된 값을 못가져 올 수도 있음
		// String name = sc.nextLine();
		// nextLine() : 사용자가 입력한 값 모두 읽어옴 (엔터 전 까지의 모든 값)
		
		System.out.print("당신의 나이는 몇 살입니까? ");
		int age = sc.nextInt(); // 사용자가 입력한 값을 정수로 읽어들이는 메소드
		
		System.out.print("당신의 키는 몇 입니까? (소수점 첫째 자리까지)");
		double height = sc.nextDouble(); // 사용자가 입력한 값을 실수로 읽어들이는 메소드
		
		// xxx님은 xx살이며, 키는 xxx.x cm 입니다.
		System.out.println(name + "님은 " + age + "살이며, 키는 " + height + "cm 입니다");
		
		sc.close();
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void inputTest3() {
		
		// 스캐너 생성
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 버퍼에 남아있는 엔터를 제거해주는 코드를 추가
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		
		// xxx님은 xx살이며, 사는 곳은 xxx이고, 키는 xxx.x cm 입니다.
		System.out.println(name + "님은 " + age + "살이며, 사는 곳은 " + address + "이고, 키는 " + height + "cm 입니다");		
		
		sc.close();
	}
	
	public void inputTest4() {
		
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 입력 받을 때 => sc.nextLine() sc.next() => 문자만 공백까지만
		// 정수값을 입력 받을 때 => sc.nextInt()
		// 실수값을 입력 받을 때 => sc.nextDouble()
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		// char gender = sc.nextChar(); // nextChar() 와 같은 메소드는 존재하지 않음
		char gender =  sc.nextLine().charAt(0);
		// 문자열.charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// * 인덱스 : 순번 같은 존재 (단, 0부터 시작)
				
		System.out.print("나이 : ");
		int age =  sc.nextInt();
		
		System.out.print("키 : ");
		double height =  sc.nextDouble();
		
		/*
		 * xxx 님의 개인정보
		 * 성별 : x
		 * 나이 : xx
		 * 키 : xxx.x
		 */
		
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public void charAtTest() {
		
		String str = "Hello";
		
		// 변수에 기록하여 출력하는 방식
		char ch = str.charAt(0); 
		System.out.println(ch); // H
		
		// 바로 출력하는 방식
		System.out.println(str.charAt(1)); // e
		
		// 존재하지 않는 인덱스(string 길이를 넘어 섬) : 오류발생!
		// System.out.println(str.charAt(12)); // java.lang.StringIndexOutOfBoundsException
		
	}

	/*
	 * ** 정리 **
	 * 1. 콘솔 창에 (모니터) 출력하기 위해 : System.out.println() 메소드 이용
	 * 2. 콘솔 창에 (키보드) 입력받기 위해 : Scanner 이용해서 (nextLine(), next(),
	 * 												nextIn(), nextDouble()...)
	 * 
	 * 		> 주의사항
	 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소다가 와야될 경우
	 * 		   sc.nextLine() 메소드를 한번 더 써줘서 버퍼에 남아있는 '엔터'를 뺴주는 과정 필수!
	 * 		2) '문자' 값을 입력받아야 될 경우
	 * 		   sc.nextLine() 메소드를 통해 우선 문자열로 받고 그 뒤에 .charAt(인덱스값) 메소드를 통해서 문자 하나를 추출 
	 * 
	 */
}
