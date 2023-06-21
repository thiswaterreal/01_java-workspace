package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {

		// 클라이언트용 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		Socket socket = null;
		
		// 요청하고자 하는 서버 IP : 192.168.20.47 (사실 나..ㅎ)
		// 포트번호 : 3000
		
		int port = 3000; //*****
		String serverIP; //*****
		
		serverIP = "192.168.20.22"; // (반드시 서버IP가 적혀있어야함!!!!!!!!! 내꺼 말고!!) 
		
		// 1) 서버에 연결 요청 보내는 구문 (요청하고자 하는 서버의 IP주소와 지정된 포트번호를 제시하면서 소켓 객체 생성)
		try {
			socket = new Socket(serverIP, port);
			
			// 서버 꺼져있거나 못찾으면 (통신 실패) null 이 담김

			if(socket != null) {	// 서버와 잘 연결됐을 경우
				System.out.println("서버와 연결 성공!");
				
				// 2) 서버와 입출력 기반스트림 생성
				// 3) 보조스트림 통해서 성능 개선
				// 입력용 스트림
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				// 출력용 스트림
				pw = new PrintWriter(socket.getOutputStream());
				
				// 4) 스트림을 통해 읽고 쓰기
				while(true) {
					System.out.print("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					
					pw.println(sendMessage);
					pw.flush();
					
					String message = br.readLine();
					System.out.println("서버에게 전달받은 메세지 : " + message);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 5) 통신 종료
			try {
				pw.close();
				br.close();
				
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
		/*
		 * 클라이언트(나)가
		 * int port = 3000;
		 * String serverIP;
		 * serverIP = "192.168.20.22"; // (반드시 서버IP) 
		 * 
		 * 서버의 ip주소를 입력 (포트번호, 서버IP주소 일치하는지 확인!)
		 * 서버가 콘솔돌려
		 * 클라이언트 콘솔돌려
		 * 서버먼저 입력 시작
		 */
}
