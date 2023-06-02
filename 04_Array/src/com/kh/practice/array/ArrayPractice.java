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
		
		int count = 0;
		
		char[] arr = new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i=0; i<str.length(); i++) {
			if(ch == arr[i]) {
				count++;
				System.out.println(i + " ");
			}
		}
		System.out.println(); //개행
		System.out.println(ch + "의 개수 : " + count);
		
		
		/*
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
		*/
		
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
	
	public void practice7() {			// 다시생각!!!!!!!!
		
		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수 배열을 선언 및 할당
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		
		// 배열 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		// 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(); //개행
		System.out.println("총 합 : " + sum);
		
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if(num>=3 && num%2==1) {
				int[] arr = new int[num]; //입력정수만한 방 생성
				
				//오름
				for(int i=0; i<(arr.length/2)+1; i++) {			//다시!!생각!!!
					arr[i] = i;
				}
				
				for(int i=0; i<(arr.length/2)+1; i++) {
					System.out.print(arr[i]+1 + " ");
				}
				
				//내림
				for(int i=(arr.length/2); i>0; i--) {			//다시!!
					arr[i] = i;
				}
				
				for(int i=(arr.length/2); i>0; i--) {
					System.out.print(arr[i] + " ");
				}
				
			break;	
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}	
	
	}
	
	public void practice9() {				// 다시 생각!!
	      
		Scanner sc = new Scanner(System.in);
	      System.out.print("치킨 이름을 입력하세요 : ");
	      String str = sc.nextLine();

	      String[] arr = new String[6];

	      arr[0] = "굽네";
	      arr[1] = "교촌";
	      arr[2] = "노랑통닭";
	      arr[3] = "자담";
	      arr[4] = "푸라닭";
	      arr[5] = "인생닭강정";

	      for (int i = 0; i < arr.length; i++) {
	    	  
	         if (str.equals(str) == str.equals(arr[i])) {
	            System.out.println(arr[i] + "배달가능");
	         return;
	         }else if (str.equals(str) != str.equals(arr[i])) {
	         }
	      }
	      System.out.println(str + "치킨은 없는 메뉴입니다");
	}
	

	
	public void practice10() {		//다시생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		// 반복문 이용하여 char[]에 옮겨담기
		char[] origin = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// 복사본 char[]에 성별자리 이후부터 *로 값이 들어가게끔 깊은복사 후 바로 출력
		char[] copy = new char[origin.length];
		
		for(int i=0; i<copy.length; i++) {
			
			if(i <= 7) {
				copy[i] = origin[i];
			}else {	// 8번 인덱스부터 *값 들어가도록
				copy[i] = '*';
			}
			// 바로 출력
			System.out.print(copy[i]);
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
