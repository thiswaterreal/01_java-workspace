package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("양수가 아닙니다");
		}else {
			
			for(int i=1; i<=num; i++) {
				
				if(i % 2 == 1) {				// 조심 'i'
					System.out.print("박");
				}else if (i % 2 == 0) {
					System.out.print("수");
				}
				
			}	
				
		}
		
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num <= 0) {
				System.out.println("양수가 아닙니다");
				//break; (x)
			}else {
				
				for(int i=1; i<=num; i++) {
					
					if(i % 2 == 1) {				// 조심 'i'
						System.out.print("박");
					}else if (i % 2 == 0) {
						System.out.print("수");
					}
					
				}
				break;
					
			}
			
		}
		
	}
	
	public void practice3() {					//다시 생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		
		int count = 0; 							// count 변수 만들기
		 
		for (int i=0; i<str.length(); i++) {
		    if (str.charAt(i) == ch) {
		        count++;						// count++;
		    }
		}
		
		System.out.println(str + " 안에 포함된 " + ch + " 개수 : " + count);
		
	}
	
	public void practice4() {						//다쉬생각
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("문자열 : ");
			String str = sc.nextLine();
		
			System.out.print("문자 : ");
			char ch = sc.nextLine().charAt(0);
		
			int count = 0;
		 
			for (int i=0; i<str.length(); i++) {
				if (str.charAt(i) == ch) {
		        count++;
				}
			}
		
			System.out.println(ch + "가 포함된 개수 : " + count);
		
	
			System.out.print("더 하시겠습니까? (y/n) : ");
			char an = sc.nextLine().charAt(0);
			
			if(an == 'N' || an == 'n') {
				return;	//프로그램 종료
			}else if(an == 'Y' || an == 'y') {
				
				for (int i=0; i<str.length(); i++) {
					if (str.charAt(i) == ch) {
						count++;
					}
				}		
			}else {
				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
			}
			
		}
		
	}
	
	
	
	
	
}
