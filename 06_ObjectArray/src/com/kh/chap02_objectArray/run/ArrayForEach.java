package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {

		int[] arr = {10, 20, 30};
		
		// * for each문 (향상된 for문 / 개선된 for문)
		// 배열 또는 컬렉션과 함께 사용
		// 배열 또는 컬렉션의 0번 인덱스부터 ~ 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때 사용
		
		/*
		 * [표현법]
		 * for(순차적으로 접근할 값을 담을 변수 선언 : 순차적으로 접근할 배열 또는 컬렉션) {	// 반복횟수 == 배열 또는 컬렉션의 크기
		 * 		반복적으로 실행할 내용
		 * }
		 */
		
		// int형인 value라는 변수에 arr의 크기만큼 돌면서 담아라!
		for(int value : arr) {	// value = arr[0], value = arr[1], value = arr[2]
			System.out.println(value); 		// 10, 20, 30
		}
		
		
		/*
		// 단순 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); 	// 10, 20, 30
		}
		*/
		
		
		// * 객체배열
		// 배열생성
		Phone[] phones = new Phone[3];
		
		// 객체생성 + (필드값)초기화
		phones[0] = new Phone("갤럭시", "삼성", 1500000, "s23");
		phones[1] = new Phone("아이폰", "애플", 1300000, "14pro");
		phones[2] = new Phone("롤리팝", "엘지", 900000, "없음");
		
		System.out.println(phones[0]); 					// 주소값 출력
		System.out.println(phones[0].information()); 	// 값 출력
		
		phones[2].setSeries("1");	// 값 수정도 가능

		int total = 0;
		for(Phone p : phones) {	// p = phones[0], p = phones[1], p = phones[2] 	// 자료형 자리에 Phone
			System.out.println(p.information());
			// 모든 인덱스의 금액 누적합 => total += i;
			total += p.getPrice();
		}
		System.out.println("총합계 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
		
		// 구매하고자 하는 핸드폰
		// 롤리팝
		// 가격 : xx원
		// => 향상된 for문으로!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();	// 롤리팝
		
		// 향상된 for문
		for(Phone p : phones) {	// p => phones[0], p => phones[1], p => phones[2]
			if(p.getName().equals(buy)) {	// 순차탐색
				System.out.println("가격 : " + p.getPrice() + "원");
			}
		}
		
		// 일반 for문 (반복횟수를 지정해줄 수 있음 i<1;)
		for(int i=0; i<phones.length; i++) {
			if(phones[i].equals(buy)) {
				System.out.println("가격 : " + phones[i].getPrice() + "원");
			}
		}
		
		
		
	}

}
