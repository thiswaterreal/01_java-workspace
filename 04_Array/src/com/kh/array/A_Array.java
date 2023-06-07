package com.kh.array;

import java.util.Scanner;

public class A_Array {

	// 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	// 배열 : 하나의 공간에 여러개의 값을 담을 수 있는 개념
	//		 '같은 자료형의 값' 으로만 담을 수 있음
	//		 정확히 얘기하자면, 배열의 각 인덱스 자리에 실제값이 담김 (인덱스는 0부터 시작!)
	
	public void method1() {
		
		// * 배열을 왜 쓰는지?
		
		// 변수라는 것만을 이용하게 되면 => 대량의 데이터들을 보관하고자 할 떄 각각의 변수를 만들어서 따로 관리(불편)
		// int num1 = 0, 1, 2, 3, 4;	// 불가능
		
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 출력하고자 할 때도 => 일일히 출력해야함(불편) (반복문 활용 불가능)
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	
		for(int i=1; i<=5; i++) {
			System.out.println(numi);	// 불가능
		}
		
		// 총합계를 구할 때도 => 일일히 더해줘야함(불편) (반복문 활용 불가능)
		int sum = num1 + num2 + num3 + num4 + num5;
		*/
		
		//======================================================
		
		/*
		 * 1. 배열 선언 (여러개의 값을 보관할 배열을 만들겠다)
		 * [표현법]
		 * 자료형 배열명[];
		 * 자료형[] 배열명;		<= 선호함
		 */
		
		int a; //변수 선언
		
		//int arr[]; // 배열 선언
		//int[] arr;   // 배열 선언		// 여기선 오로지 int 값만을 담을 수 있다! (문자x)
		
		
		/*
		 * 2. 배열 할당 (이 배열에 몇개의 값들을 보관할껀지 크기를 지정하는 과정, 그 개수만큼 방이 만들어진다) (변수:원룸(방 하나) / 배열:아파트(방 많음))
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 */
		
		//arr = new int[5];
		
		// *** 배열 선언과 동시에 할당 (배열 만듦과 동시에 크기 지정)
		//int[] arr;
		//arr = new int[5];
		int[] arr = new int[5]; 	// 위 두개를 한방에
		
		/*
		 * 3. 값 대입
		 * [표현법]
		 * 배열명[인덱스] = 값;
		 */
		
		/*
		// 이거를 반복문으로 표현 가능
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 배열의 장점 : 반복문 활용 가능
		// 위를 한번에
		for(int i=0; i<=4; i++) {		// for문 돌릴때는 어디가 깔짝깔짝 바뀌는지를 체크
			arr[i] = i;
		}
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		
		// 배열의 장점 : 출력시 반복문 활용 가능
		// 위 출력을 한번에
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]); // 0 1 2 3 4
		}
		
		System.out.println(arr); // 실제 arr 이라는 박스에는 '주소값' 이라는게 담겨 있음 (뭔소리지? => method2())
		
	}
	
	public void method2() {
		
		int i = 10;
		
		// 배열 선언과 동시에 할당
		int[] iArr = new int[5];
		System.out.println(iArr);	// [I@6f2b958e
		
		double[] dArr = new double[3];
		System.out.println(dArr);   // [D@5e91993f 걍 주소값 나옴
		
		/*
		 * 실제 리터럴(값)을 곧바로 담을 수 있는 변수를 '일반변수' 라고 얘기하고
		 * 주소값을 담고 있는 변수는 '참조변수(레퍼런스 변수)' 라고 얘기한다.
		 * 
		 * 기본자료형 : (boolean, char, byte, short, int, long, float, double) 으로 선언된 변수 : 소문자로 시작, 소문자로 끝남
		 * 			=> 실제 리터럴값을 바로 담는 변수 => 그냥 일반변수
		 * 
		 * 그 외 자료형(int[], double[], char[], short[], 요런 자료형, String, ...) 으로 선언된 변수
		 * 			=> 주소값을 담는 변수 => 참조변수(레퍼런스 변수)
		 * 
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; 		// 0~2번 인덱스
		double[] dArr = new double[4];  // 0~3번 인덱스
		
		// 배열 선언하고 크기지정(할당)까지만 한 상태
		// 그럼 각각의 인덱스에 초기화(값대입)가 되어 있을까?
		
		// 각각의 인덱스에 값 안담고 출력해보기
		// iArr
		for(int i=0; i<=2; i++) {
			System.out.println(iArr[i]);			// 0 0 0
		}
		
		System.out.println("===================");
		
		// dArr
		for(int i=0; i<=3; i++) {
			System.out.println(dArr[i]);			// 0.0 0.0 0.0 0.0
		}
		
		// 내가 각 인덱스에 초기화(값대입)를 하지 않아도 값들이 담겨있음! 왜일까?
		// heap이라는 공간에 절대 빈공간이 존재할 수 없음!
		// => 따라서 공간이 만들어질 떄 JVM(자바가상머신)이 기본적으로 초기화(값대입)를 진행해줌
	}
	
	public void method4() {
		
		int[] arr = new int[5];
		
		// 1. 값대입
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		*/
		
		// (한방에 값대입)
		for(int i=0; i<=4; i++) {
			arr[i] = i+1;	// ***
		}
		
		// 2. 값 출력
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 배열의 자료형 + @ + 주소값의 16진수 형태
		System.out.println(arr.hashCode()); // 주소값의 10진수 형태
		System.out.println("배열의 길이 : " + arr.length);
		
		for(int i=0; i<arr.length; i++) {	// 조심 '<'
			System.out.println(arr[i]);
		}
		
		// 배열 크기 변경 요청 => 10으로 	// 안됨. 다시 만들어야함
		
	}
	
	public void method5() {
		
		int result = 0; // 선언과 동시에 초기화(값대입)

		// **배열 쓰면서 볼 수 있는 오류들 모음집
		// int[] arr; // (선언만) 크기 지정 누락한 경우
		
		int[] arr = null; // 아무것도 참조하고 있지 않음
		
		System.out.println(arr); // 선언만 한 경우 => 초기화 안돼있어서 오류남
		
		// null 가지고 메소드를 호출한다거나 특정 어딘가에 접근하고자 한다면
		// 항상 오류 발생! => 'java.lang.NullPointerException'
		//System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		System.out.println(arr[0]);
		
	}
	
	public void method6() {
		
		int[] arr = new int[5];		// *방 5개 선언!!
		
		// 값대입
		/*
		arr[0] = 2;		2 * 1
		arr[1] = 4;		2 * 2
		arr[2] = 6;		2 * 3
		arr[3] = 8;		2 * 4
		arr[4] = 10;	2 * 5
		*/
		
		// 방법1
		for(int i=0; i<arr.length; i++) { // for(int i=0; i<=4; i++) 가능
			arr[i] = 2*(i+1);
		}
		
		/*
		// 방법2
		int value = 2;
		for(int i=0; i<arr.length; i++) {
			arr[i] = value;
			value += 2;
		}
		*/
		
		// 값출력
		for(int i=0; i<arr.length; i++) {	// (0~4번 인덱스)
			System.out.println(arr[i]);		// 2 4 6 8 10
		}
		
		System.out.println("arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("arr의 길이 : " + arr.length);
		
		// java.lang.ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시 시 발생 (범위에서 벗어난 인덱스 제시)
		// arr[5] = 12; 	// 이미 방5개(0~4) 만들어놓고 또 하나 지정하니까 오류발생
	
		// ** 배열의 가장 큰 단점
		// - 한번 지정된 배열의 크기는 변경이 불가
		// 	 => 배열의 크기를 변경하고자 한다면 다시 만들어야함
		arr = new int[7];
		System.out.println("변경 후, arr의 해쉬코드값 : " + arr.hashCode());
		System.out.println("변경 후, arr의길이 : " + arr.length);
		// 주소값이 변경 됨! => 이제 새로운 곳 참조하게 됨!
		
		/*
		 * 연결이 끊어진 기존 배열은 heap영역에 둥둥 떠다님 (어디에도 참조되어 있지 않으므로 필요없는 존재임 == 지워주는게 좋음)
		 * => 일정시간이 지나면 '가비지컬렉터(GC)'가 알아서 지워줌
		 * => 자바에서의 '자동메모리 관리' 특징 == 개발자가 코드작성에만 신경쓸 수 있도록 해줌
		 */
		
		// 배열을 강제로 삭제시키고자 한다면 ? => 연결고리를 끊으면 됨!
		arr = null; // 아무것도 참조하지 않겠다 (참조화살표 삭제됨)
		
		System.out.println("삭제 후, arr : " + arr);
		
		// null.xxx() => 'NullPointerException' 발생
		
	}
	
	public void method7() {
		
		// 배열 선언, 할당, 초기화(값대입) 모두 동시에 하기
		
		// [표현법1]
		int[] arr1 = new int[] {1, 2, 3, 4};
		
		// [표현법2] ***선호
		int[] arr2 = {1, 2, 3, 4};
		
		System.out.println("arr1이랑 arr2가 같나요? : " + (arr1 == arr2)); // false
		// 각각의 변수에 담겨있는 주소값을 비교하기 때문
		
		System.out.println("arr1이랑 arr2가 같나요? : " + (arr1[0] == arr2[0])); // true
		// 대입한 값 비교하기 때문
	}
	
	public void method8() {
		
		// 1. 크기 10짜리 정수 배열 생성 후
		int[] arr = new int[10];	// 0~9번방 인덱스
		
		// 2. 반복문 활용해서 '0번 인덱스 ~ 마지막 인덱스까지' 순차적으로 접근하면서 값 대입
		//	  매번 1~100 사이에 생성되는 랜덤값
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문을 활용해서 해당 배열의 '0번 인덱스 ~ 마지막 인덱스까지' 담겨있는 값 출력
		//	  'arr[x] : xx' 형식으로 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
	}
	
	public void method9() {
		
		// 1. 사용자에게 배열의 길이를 입력을 받은 후
		// 	  해당 그 크기만큼의 '문자열 배열' 생성
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		int size = sc.nextInt();
		sc.nextLine(); // **버퍼에 남아있는 엔터를 제거해줄 수 있는 코드 추가
		
		String[] arr = new String[size];	//'문자열 배열' 생성
		
		// 2. 반복문을 활용해서 매번 사용자에게 과일명 입력 받아
		// 	  그 값을 매 인덱스 자리에 대입(0번 ~ 마지막 인덱스)
		for(int i=0; i<arr.length; i++) {	//문자열 길이만큼 인덱스방 생성
			System.out.print("좋아하는 과일명 입력 : ");
			arr[i] = sc.nextLine();
		}
		
		// 3. 반복문 활용해서 0 ~ 마지막 인덱스까지 담긴 값을 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
	}
	
	public void method10() {
		
		// 사용자에게 문자열 하나 입력받은 후
		// 각각의 인덱스에 있는 문자들은 char 배열에 옮겨담기
		
		// 1. 사용자에게 문자열 입력 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();		// kiwi
		
		System.out.print("찾고자 하는 문자 : ");
		char ch = sc.nextLine().charAt(0); // k
			
		// 2. char 배열 생성 (크기지정! => 이때 배열의 크기? => 문자열의 길이만큼 (str.length만큼))
		char[] arr = new char[str.length()];
			
		// 3. 반복문 활용해서 해당 문자열에서 각 인덱스별 문자를 char배열의 각 인덱스 대입
		/*
		arr[0] = str.charAt(0); // k
		arr[1] = str.charAt(1); // i
		arr[2] = str.charAt(2); // w
		arr[3] = str.charAt(3); // i
		.....
		arr[마지막] = str.charAt(마지막);
		*/
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. char 배열 출력
		int count = 0; // 일치하는 문자가 존재할 경우 매번 1씩 증가
		
		for(int i=0; i<arr.length; i++) {	// 0번 방부터 ~ 입력받은길이 방까지
			System.out.println("arr[" + i + "] : " + arr[i]); // 그 방들 i로 돌면서 찍어
		
			if(ch == arr[i]) { // 찾으려고 하는 문자와 배열의 값이 같은 경우
				count++;
			}
			
		}
		System.out.println("찾아진 문자 개수 : " + count);
			
	}
	
	public void method11() {
		
		// 1. 사용자에게 배열의 길이 입력받은 후 해당 크기만큼의 정수 배열 생성 //입력5면 5개방
		Scanner sc = new Scanner(System.in);
		
		System.out.print("(배열의 길이)정수 입력 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];	//'정수 배열' 생성
		
		// 2. 반복문 활용해서 0~마지막 인덱스까지 매번 1~100 사이의 랜덤값 발생시켜 대입
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문 활용해서 0~마지막 인덱스까지 담긴 값을 출력과
		//	  동시에 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합(누적합)을 구하자
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]); //arr의 i번째
			//arr[i];
			
			// 짝수인지 판별 => 누적합
			if(arr[i] % 2 == 0) {
				sum += arr[i]; // i가 더해지는게 아니라 **arr[i]값** 이 더해져야 하니까
			}
						
		}
		
		System.out.println("인덱스에 담긴 값이 짝수인 값들의 총합 : " + sum);
		
	}
	
	
	
	
	
	
}
