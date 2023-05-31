package com.kh.chap03.branch;

public class B_Continue {

	/*
	 * continue;	: 반복문 안에 기술되는 구문
	 * 				  continue; 구문 실행시 그 뒤의 구문을 실행하지 않고 곧바로 현재 속해있는 반복문 위로 올라간다
	 */
	
	public void method1() {
		
		// for문으로 1부터 10까지 홀수 출력
		// 1 3 5 7 9
		
		/* 방법1
		for(int i=1; i<=9; i+=2) {
			System.out.print(i + " ");
		}
		*/
		
		/* 방법2
		for(int i=1; i<=10; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		// 방법3
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { // i값이 짝수일 경우
				continue;	 // 건너뛰기라고 생각
							 // 반복문 실행 안하고 반복문 위(증감식)로 올라감
			}
			System.out.print(i + " ");
		}
		
	}
	
	public void method2() {
		
		// 1부터 100까지의 총 합계
		// 단, 6의 배수값은 제외하고 덧셈연산을 하겠다
		
		// 1. 1부터 100까지의 총 합계를 먼저 for문으로 작성
		int sum = 0;
		for(int i=1; i<=100; i++) { // 6 12 18 24... 제외
			
			// 2. 6의 배수값 제외
			if(i % 6 == 0) { // 6의 배수
				continue; 	 // 건너뛰고 다시 위(증감식)으로 올라감
			}
			sum += i; //누적합 공식
		}
		
		System.out.println("1부터 100까지의 합계(6의 배수 제외) : " + sum);
		
	}
	
	public void method3() {
		
		// 2~9단까지 출력
		// 단, 3의 배수단은 빼고 출력
		
		// 1. 2~9단 전체 출력
		
		for(int d=2; d<=9; d++) {
			
			// 2. 3의 배수단 제외
			if(d % 3 == 0) {
				continue;
			}
			
			System.out.println("===== " + d + " =====");
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d\n", d, i, d*i);
			}
			
		}

	}
	
	
	
	
	
	
	
}
