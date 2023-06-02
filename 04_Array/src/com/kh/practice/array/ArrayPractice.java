package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] arr = new int[10]; // 길이 10인 배열 선언(10칸 방 생성)
		
		for(int i=0; i<arr.length; i++) { 	// 값대입
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {	// 값출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i=arr.length-1; i>=0; i--) { 	// 거꾸로 ** i=arr.length-1;
			arr[i] = i+1;
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {		
		
		String[] arr = new String[5]; // 배열 선언
		
		
		arr[0] = "사과";				  // 값대입(초기화)
        arr[1] = "귤";
        arr[2] = "포도";
        arr[3] = "복숭아";
        arr[4] = "참외";
		
		// 배열 선언과 동시에 할당
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
        System.out.println(arr[1]);
        
        /* (모두출력)
        for(int i=0; i<arr.length; i++) {	// 사과 귤 포도 복숭아 참외
        	System.out.println(arr[i]);
        }
        */
        
	}
	
	public void practice5() {					//다시 생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		// 존재하는 위치(인덱스)
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		char[] arr = new char[str.length()]; // 문자 배열 생성
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i); // ** ex) 5 = c (application 중)
			if(ch == arr[i]) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println(); // 개행
		
		// 개수
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				count++;
			}
			
		}
		System.out.println(ch + "의 개수 : " + count);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이의 숫자 입력 : ");
		int num = sc.nextInt();
		
		// arr[0] = "월요일"
		// ...
		String[] arr = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		
		System.out.println(arr[num]);
		
	}
	
	public void practice7() {			// 다시
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			//arr[i] = num;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : " + num);
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if(num>=3 && num%2==1) {
				int[] arr = new int[num]; //입력정수만한 방 생성
				
				//오름,내림
				for(int i=0; i<arr.length; i++) {			//다시!!
					arr[i] = i;
				}
				
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i]+1 + " ");
				}
				
			break;	
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}	
	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		
	}	
	
	
	
	
	
	
	
	
	
	
}
