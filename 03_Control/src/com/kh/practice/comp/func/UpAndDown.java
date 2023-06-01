package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {

	public void upDown() {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100 + 1);
		
		int count = 0;
		
		while(true) {
			
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			int input = sc.nextInt();
			
			if(input > random) {
				System.out.println("DOWN !");
				count++;
			}else if(input < random) {
				System.out.println("UP !");
				count++;
			}else if(input == random) {
				System.out.println("정답입니다 !");
				count++;
				break;
			}
			
		}
		System.out.println(count + "회만에 맞추셨습니다.");
		
		
		
	}
	
	
	
	
}
