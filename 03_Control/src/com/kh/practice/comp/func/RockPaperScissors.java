package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		
		// 0. 이름이 뭐냐
		// 1.(나) 가위바위보
		// 2.(컴퓨터) 가위바위보
		// 3. 둘이 비교
		// 4. 승 패 가린다
		// 5. 종료된다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요 : ");
		String name = sc.nextLine();
		
		System.out.print("가위바위보 : ");
		String user = sc.nextLine();			// 내가 낸 가바보를 user에 저장
		
		int com = (int)(Math.random()* 3 + 1);  // 컴퓨터가 낸 랜덤 가바보를 com에 저장
		
		
		if(user.equals("exit")) {
			System.out.println("종료하것슈!");
			// 전 승 무 패
			return;
		}else {
			
			switch(com) {
			case 1 :
				System.out.println("컴퓨터 : 가위");
				break;
			case 2 :
				System.out.println("컴퓨터 : 바위");
				break;
			case 3 :
				System.out.println("컴퓨터 : 보");
				break;
			}
			
			System.out.println(name + " : " + user);
			
			
			// 비교하자
			if(user.equals("가위") && com==1 || user.equals("바위") && com==2 || user.equals("보") && com==3) {
				System.out.println("비겼습니다");
			}else if(user.equals("가위") && com==2 || user.equals("바위") && com==3 || user.equals("보") && com==1) {
				System.out.println("졌습니다ㅜㅜ");
			}else if(user.equals("가위") && com==3 || user.equals("바위") && com==1 || user.equals("보") && com==2) {
				System.out.println("이겼습니다ㅋㅋ");
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
}
