package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice2() {						
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
				
			}else {
				System.out.println("1 이상의 숫자를 입력하세요");
			}
			
		}
		
	}
	
	public void practice3() {						// (다쉬생각)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			
			for(int i=num; i>=1; i--) {				// 거꾸로 출력 i--
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
			
	}
	
	
	public void practice4() {						// (다쉬생각)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {								// 다시 입력받도록
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				
				for(int i=num; i>=1; i--) {			// 거꾸로 출력
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
		
		int sum = 0; 		// 변수 상자 만들고~
		
		int i = 1;
		while(i<=num) {
			sum += i;		// 누적합
			i++;
		}
		
		System.out.println(sum);
		
	}
	
	public void practice6() {						// (다쉬생각)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			
			if(num1<num2) {
				for(int i=num1; i<=num2; i++) {		// 입력받은 두값의 사이값 출력
					System.out.print(i + " ");
				}	
			}else { //(num1>num2)
				for(int i=num2; i<=num1; i++) {		// (반대로 입력해도 되도록) 
					System.out.print(i + " ");
				}	
			}
			
		}else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
		
	}
	
	public void practice7() {							//다쉬생각!!
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");		//다시 돌아와서 입력받도록 while 안에 '입력받는코드' 넣어야함
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			
			if(num1 > 0 && num2 > 0) {
				
				if(num1 < num2) {
					for(int i=num1; i<=num2; i++) {
						System.out.print(i + " ");
					}
					//break;						//break를 안써도 잘 돌아가네..? 왜??
					
				}else {
					for(int i=num2; i<=num1; i++) {
						System.out.print(i + " ");
					}
					//break;
				}
				
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요");
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
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		for(int d=dan; d<=9; d++) {
			
			System.out.println("===== " + d + "단 =====");
			
			for(int i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d\n", d, i, d*i);
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
	
	public void practice11() {									//다시생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.print(num1 + " ");
			num1 += num2;
		}
	}
	
	
	public void practice12() {									//다ㅜ시
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			// 종료
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 정수 입력 받
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine(); // 엔터제거 (조건 불충족으로 반복문 다시 돌때 정수2 다음 연산자 출력할 때 문제 발생하기 때문)
			
			// 나눗셈 이면서 정수2가 0이면 다시 입력 받
			if(op.equals("/") && num2 == 0) {								//문자열 비교이기때문에 .equals 로 비교
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				continue; // **아래 내용 수행 안하고 반복문 처음으로 돌아감
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
			
		}

	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// i = 줄 갯수
        for (int i=1; i<=num; i++) {
            // j = 별 갯수
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
		
	}
	
	public void practice14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

        // i = 줄 갯수
        for(int i=1; i<=num; i++) {
        	// j = 별 갯수
            for(int j=num; j>=i; j--) {
            System.out.print("*");
            }
            System.out.println("");
            
        }
		
	}
	
	
	
	
	
	
	
}
