package com.kh.chap02_tcp.run;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {

	public static void main(String[] args) {

		/*
		 * TCP(Transmission Control Protocol)
		 * - 서버, 클라이언트 간의 1:1 소켓 통신
		 * - 데이터를 교환하기에 앞서서 서버, 클라이언트가 연결되어있어야함 (서버가 먼저 실행되어 클라이언트의 요청을 기다릴것임)
		 * - 신뢰성있는 데이터 전달 가능
		 * 
		 * * 소켓(Socket)
		 * - 프로세스간의 통신을 담당
		 * - Input / OutputStream 을 가지고 있음 (이 스트림을 통해 입출력이 이루어짐)
		 * 
		 * * Server Socket
		 * - 포트와 연결되어(Bind) 외부의 연결 요청을 기다리다가 연결요청이 들어오면 수락해줄 용도
		 * 	 수락 => 통신 할 수 있는 Client Socket 생성됨
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = null;	// 입력 보조스트림
		PrintWriter pw = null; 		// (한줄씩 읽어오는) 출력 보조스트림
		
		// 1) 포트 번호 지정 (서버측에서 몇 번 포트로 통로를 열꺼냐)
		int port = 3000; //*****
		
		ServerSocket server = null;
		
		try {
			// 2) Server Socket 객체 생성시 포트 결합(bind) => (ServerSocket은 클라이언트의 연결 요청을 받아줄 용도의 소캣)
			server = new ServerSocket(port);
			
			// 3) 클라이언트로부터 접속 요청이 올 때까지 대기상태..
			System.out.println("클라이언트의 요청을 기다리고 있어요..");
			
			// 4) 연결 요청이 오면 요청 수락 후 => 해당 클라이언트와 통신 할 수 있는 서버측 소켓 객체 생성
			Socket socket = server.accept();	// socket == 클라이언트와 통신할 수 있는 소켓 객체가 담겨있음
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함");
			
			// 5) 클라이언트와 입출력 스트림 생성 ('바이트스트림'으로밖에 안됨.. 1byte 짜리) => 성능이 별로 안좋음
			
			// 6) 보조스트림을 통해서 성능 개선
			// 	  입력용 스트림 => 1바이트짜리 '바이트스트림'을 '문자스트림'으로 변경해줌 => 성능 더 좋은 보조스트림을 껴서!
			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
			//	  출력용 스트림 (클라이언트에게 값을 한 줄 단위로 출력할 수 있는 출력용 스트림)
			pw = new PrintWriter(socket.getOutputStream());
			// 	  (PrintWriter : 데이터 출력 print(), println() 메소드를 가지고 있는 보조스트림)
			
			// 7) 스트림을 통해 읽고 쓰기
			// 클라이언트로부터 전달된 메세지가 있을 경우 서버측은 읽어들일것임 (입력)
			while(true) {
				String message = br.readLine(); // 한줄씩 읽어들일것임 그걸 message에 담아
				System.out.println("클라이언트로부터 전달받은 메세지 : " + message);
				
				// 반대로 클라이언트에게 데이터 전달 (출력)
				System.out.print(socket.getInetAddress().getHostName() + "클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				
				pw.println(sendMessage); // 클라이언트에게 출력
				pw.flush(); // 현재 스트림에 있는 데이터를 클라이언트에게 강제로 내보내는 메소드 => close() 될때 자동 호출 /그러나 지금은 while반복문으로 돌기 때문에 작성
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 8) 통신 종료
			try {
				pw.close();
				br.close();
				
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
