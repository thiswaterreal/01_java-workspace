package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>0) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}	
		
	}
	
	public void practice2() {						
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { //다시 입력받
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num>0) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
			break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}	
			
		}
		
	}
	
	public void practice3() {						
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
			for(int i=num; i>=1; i--) {				// 거꾸로 출력
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
			
	}
	
	public void practice4() {						
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {	

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num>=1) {
				for(int i=num; i>=1; i--) {				// 거꾸로 출력
					System.out.print(i + " ");
				}
			break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		/* while 사용한 방법
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0; 		// 변수 sum
		
		int i = 1;
		while(i<=num) {
			sum += i;		// 누적합
			i++;
		}
		
		System.out.println(sum);
		*/
		
	}
	
	public void practice6() {						
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1>0 && num2>0) {
			if(num1 > num2) {
				for(int i=num2; i<=num1; i++) { 	// 순서 : num2(작)부터 ~ num1(큰)까지 
					System.out.print(i + " ");
				}
			}else if(num1 < num2) {
				for(int i=num1; i<=num2; i++) {
					System.out.print(i + " ");
				}
			}	
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
	}
	
	public void practice7() {							
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1>0 && num2>0) {
				if(num1 > num2) {
					for(int i=num2; i<=num1; i++) { 	// 순서 : num2(작)부터 ~ num1(큰)까지 
						System.out.print(i + " ");
					}
				}else if(num1 < num2) {
					for(int i=num1; i<=num2; i++) {
						System.out.print(i + " ");
					}
				}
			break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
			
		}
		
	}
	
	public void practice8() {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("===== " + dan + "단 =====");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
	
		/* 위 방법이 더 편해요
		for(int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}
		 */
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		for(int d=dan; d<=9; d++) {
			System.out.println("===== " + d + "단 =====");	// for문 밖에!!
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", d, i, d * i);
			}
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("숫자 : ");
			int dan = sc.nextInt();
			
			if(dan<=9) {
				
				for(int d=dan; d<=9; d++) {
					
					System.out.println("===== " + d + "단 =====");
					
					for(int i=1; i<=9; i++) {
						System.out.printf("%d * %d = %d\n", d, i, d*i);
					}
					
				}
				//break;
				
			}else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}

		}
		
	}
	
	public void practice11() {									
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i=1; i<=10; i++) {				// 다시생각.. 와우..(공차 누적합)
			System.out.print(num1 + " ");
			num1 += num2;
		}
		
	}
	
	
	public void practice12() {									// 다시생각
		
		// (차근차근)
		// 입력값 받고, 계산까지 완!
		// 연산자 : exit 값 들어오면 "프로그램을 종료합니다" 출력 => 종료 (exit값 들어올 때까지 무한반복)
		// 연산자 : / 이면서 두번째정수 : 0 들어오면 "0으로 나눌 수 없습니다. 다시 입력해주세요." 출력 => 다시 입력받
		// 연산자 : (이상한값) 들어오면 "없는 연산자입니다. 다시 입력해주세요." 출력 => 다시 입력받
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			// ** 종료문이 여기에!! ** (exit 받으면 다음 문항들 입력받을 필요도 없기 때문)
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // 엔터제거
			
			if(op.equals("/") && num2 == 0) {							
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue; // ** 아래 내용 수행 안하고 반복문 처음으로 돌아감 **
			}else {
				switch(op) {
				case "+" :
					System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
					break;
				case "-" :
					System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
					break;
				case "*" :
					System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
					break;
				case "/" :
					System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
					break;
				case "%" :
					System.out.printf("%d % %d = %d\n", num1, num2, (num1 % num2));
					break;
				default :
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				}
			}
			
		} // while(true) 끝

	}
	
	public void practice13() {				// (13~14 별*찍기) : 이중 for문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// j = 줄 갯수
        for (int j=1; j<=num; j++) {	
            // i = 별 갯수
            for (int i=1; i<=j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

        // j = 줄 갯수
        for(int j=1; j<=num; j++) {
        	// i = 별 갯수
            for(int i=num; i>=j; i--) {
            System.out.print("*");
            }
            System.out.println("");
        }
		
	}
	
	
	
	
	
	
	
}
