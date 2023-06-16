package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// 메모리는 휘발성임
		// 가나다라 라고 쓰고 컴퓨터를 끄면 지워짐! => 
		// 기록하기 위해 파일이 필요함
		
		// 간단하게 파일(File) 만들어지는 과정
		// java.io.file 클래스 가지고
		// 여기서는 예외처리가 필수
		
		// File f1 =  new File();	=> 불가능. 기본생성자 없음
		
		try {
			// 1. 경로 지정을 딱히 하지 않은 상태로 파일 생성 => 현재 Project 폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile();	// createNewFile() 메소드까지 실행해야만 실제 파일이 만들어짐!!
			
			// 2. 존재하는 폴더에 파일 생성 => 해당 경로까지 지정
			File f2 = new File("D:\\test.txt");	// D:\\ (== D드라이브에 저장하겠다) // 혹여 존재하지 않는 경로 제시시 IOException!! 에러 뜸
			f2.createNewFile();
			
			// 3. 파일을 만들 때 폴더도 함께 만들기
			// File f3 = new File("D:\\temp\\text.txt"); // 불가능. temp를 못찾았기 때문(사실 없음)
			// f3.createNewFile();
			
			// 3. 폴더 먼저 만들고 => 파일까지 만들기 *********************************************
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();	// 폴더 만들어주는 메소드
			
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();	// 파일 만들어주는 메소드
			
			// 실행할때마다 파일이 계속 만들어지나요?
			// 해당 파일 존재하면 그냥 덮어쓰기 된다. 수정사항 없으면 그대로 감
			
			System.out.println(f1.exists()); 	// 파일 존재 확인
			System.out.println(new File("ttt.text").exists());
			
			System.out.println(f1.isFile());	// 이거 파일이냐?
			System.out.println(tempFolder.isFile());
			
			// ----------------------------------------------------------------------------
			
			File folder = new File("parent");	// 앞에 이미 D드라이브 있기 때문에 D:\\생략가능
			folder.mkdir();
			
			File file = new File("parent\\person.txt");	
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("파일용량 : " + file.length()); // 아무것도 안써있으면 0
			System.out.println("상위폴더 : " + file.getParent());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		/*
		 * 프로그램 상에 데이터를 외부매체로 출력을 한다거나, 외부매체로부터 입력을 받아올것임
		 * 반드시 그 외부매체와 통하는 통로를 만들어야됨! 그게 바로 스트림!
		 * 
		 * * 스트림(통로)의 특징
		 * - 스트림 : 개울 == 한방향으로만 흐름
		 * - 단방향 : 입력이면 입력 / 출력이면 출력만 가능
		 * 			=> 입력과 출력을 동시 다발적으로 하고자 한다면? 입력용스트림 / 출력용스트림 따로 열어야됨
		 * - 선입선출(FIFO) : 먼저 들어간 데이터가 먼저 나온다.	// 통로가 파이프 같은 개념
		 * - 시간지연(delay)이라는 문제가 생길 수 있음
		 * 
		 * * 스트림(통로)의 구분
		 * > 통로의 사이즈(1byte 짜리 / 2byte 짜리)
		 * - *바이트 스트림	: 1byte 짜리만 왔다 갔다 할 수 있을 정도의 사이즈 (좁은 통로) 
		 * 				  => 입력용(~InputStream) / 출력용(~OutputStream)
		 * - *문자 스트림	: 2byte 짜리도 왔다 갔다 할 수 있을 정도의 사이즈 (넓은 통로) 
		 * 				  => 입력용(~Reader) 	  / 출력용(~Writer)
		 * 
		 * > 외부매체에 직접 연결하는 유무
		 * - *기반 스트림 : 외부매체와 직접적으로 연결되는 통로 (필수)
		 * - *보조 스트림 : 말 그대로 보조 역할을 하는 통로 (속도를 빠르게 한다거나, 그 외의 유용한 기능 제공)
		 * 				보조스트림 단독으로는 사용 불가! 기반스트림이 반드시 기본적으로 있어야 함!
		 * 
		 * 우리는 외부매체를 파일로 해보자!
		 * => 첨부파일 기능을 구현할 때 필요한 개념 (중요)
		 * 
		 */	
		
	
		
		
	}

}
