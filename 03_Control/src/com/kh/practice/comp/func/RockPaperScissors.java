package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {

	public void rps() {
		
		Scanner sc = new Scanner(System.in);
		
		// 필요한 변수 선언
		int total = 0;	// 전
		int win = 0;	// 승
		int tie = 0;	// 무
		int lose = 0;	// 패
		
		System.out.print("당신의 이름을 입력해주세요 : ");	// while(true) 전에
		String name = sc.nextLine();
		
		while(true) {
			
			System.out.print("가위바위보 : ");
			String rps = sc.nextLine(); // exit
			
			int random = (int)(Math.random()*3+1); // 경우의수 1~3 (주먹,가위,보 3개니까)
			String com = "";
			
			switch(random) { // 1 2 3
			case 1 :
				com = "가위";
				break;
			case 2 :
				com = "바위";
				break;
			case 3 :
				com = "보";
				break;
			}
			
			
			if(rps.equals("exit")) {	// exit 입력한 경우 종료!
				// 전승무패 출력 => 이따가
				System.out.println(total + "전 " + win + "승 " + tie + "무 " + lose + "패");
				// 종료
				return; // 메소드 밖으로 탈출!
				
			}else if(rps.equals("가위") || rps.equals("바위") || rps.equals("보")) { // 잘 입력한 경우 (게임시작!)
				
						total++; //**
						
						System.out.println("컴퓨터 : " + com);	// 컴퓨터 : 가위(랜덤값)
						System.out.println(name + " : " + rps);	// 이수진 : 바위(내가 입력한 값)
						
						if(com.equals("가위")) { // 컴퓨터가 '가위'를 낸 경우
							switch(rps) {
							case "가위" : 
								System.out.println("비겼습니다.");
								tie++;
								break;
							case "바위" : 
								System.out.println("이겼습니다.");
								win++;
								break;
							case "보" : 
								System.out.println("졌습니다ㅜㅜ");
								lose++;
								break;
							}
						}
						
						if(com.equals("바위")) { // 컴퓨터가 '바위'를 낸 경우
							switch(rps) {
							case "바위" : 
								System.out.println("비겼습니다.");
								tie++;
								break;
							case "보" : 
								System.out.println("이겼습니다.");
								win++;
								break;
							case "가위" : 
								System.out.println("졌습니다ㅜㅜ");
								lose++;
								break;
							}
						}
						
						if(com.equals("보")) { // 컴퓨터가 '보'를 낸 경우
							switch(rps) {
							case "보" : 
								System.out.println("비겼습니다.");
								tie++;
								break;
							case "가위" : 
								System.out.println("이겼습니다.");
								win++;
								break;
							case "바위" : 
								System.out.println("졌습니다ㅜㅜ");
								lose++;
								break;
							}
						}
				
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
	
	}
	
	
	
	
	
	
}
