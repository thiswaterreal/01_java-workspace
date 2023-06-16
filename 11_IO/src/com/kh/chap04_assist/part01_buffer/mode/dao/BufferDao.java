package com.kh.chap04_assist.part01_buffer.mode.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDao {

	/*
	 * 보조스트림 : 기반스트림만으로 부족했던 성능을 보다 향상시켜주는 스트림
	 * 			 기반스트림에서 제공하지 않는 추가적인 메소드 제공 / 데이터 전송 속도 향상 시킴 + a
	 * 			>> 외부매체와 직접적으로 연결되는 스트림 아님
	 * 			   단독 사용 불가!! (반드시 기반스트림과 함께 사용)
	 */
	
	// 프로그램 ---------> 파일 : '출력'
	public void fileSave() {
		// FileWriter 기반스트림 가지고 해보자 (기반스트림 필수)
		// 파일과 직접적으로 연결해서 2바이트 단위로 출력할 수 있는 스트림
		
		// BufferdWriter : 버퍼라는 공간을 제공해주는 보조스트림 (속도향상) : 기반스트림이랑 이름 맞춰야함
		
		// BufferedWriter bw = new BufferedWriter("c_buffer.txt"); // 불가능. 단독사용불가
		
		/*
		// 1. 기반스트림 먼저 생성
		FileWriter fw = new FileWriter("c_buffer.txt");
		// 2. 기반스트림 객체를 전달하면서 => 보조스트림 생성
		BufferedWriter bw = new BufferedWriter(fw);
		*/
		
		/*
		// 위 두줄을 한줄로!
		BufferedWriter bw = null; 
		//bw = new BufferedWriter(new FileWriter("c_buffer.txt")); <= 이렇게 적고 예외처리하면 아래처럼 나옴
		try {
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine(); // (개행) 보조스트림에만 있는 메소드 활용
			bw.write("저리가세요");
			
			// 버퍼라는 공간에 계속 쌓아놨다가 한번에 출력해줌 => 속도 향상에 좋다
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// try~with~resource 구문으로 자원반납까지 더 간단하게 작업할 수 있음
		// jdk7 버전 이상부터
		
		/*
		 * [표현법]
		 * try(try 블럭 내에서 사용할 스트림 객체 생성 구문) {	// 알아서 try 다 끝나면 해당 스트림 반납까지 다 해줌
		 * 
		 * } catch(예외클래스 e) {
		 * 
		 * }
		 */
		
		//BufferdWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt")); <= 이거 쓰고, 예외처리
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))) {
			// write 메소드 이용해서 데이터 출력
			bw.write("안녕하세요\n");
			bw.write("반갑습니다");
			bw.newLine();
			bw.write("저리가세요");
		} catch (IOException e) {
			e.printStackTrace();
		}	// 자원반납 구문 안써도 됨. 자동으로 반납까지 해줄것임
		
	
	}
	
	// 프로그램 <--------- 파일 : '입력'
	public void fileRead() {
		// FileReader : 파일과 연결해서 2바이트 단위로 입력 받을 수 있는 기반스트림
		// BufferedReader : 속도 향상에 도움이 되는 보조스트림
		
		//BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt")); <= 이거 쓰고, 예외처리
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))){
			//br.read();  	  <= 반환형이 int형임
			//br.readLine();	//<= 반환형 String!! 게다가 한문장씩 가져오게 되어있음 
			
			/*
			System.out.println(br.readLine());	// 안녕하세요
			System.out.println(br.readLine());	// 반갑습니다
			System.out.println(br.readLine());	// 저리가세요
			
			System.out.println(br.readLine());	// null // 파일의 끝을 만나면 null이 나옴
			*/
			
			String value = null;
			while((value = br.readLine()) != null) {	// null과 비교할때는 equals(x)
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {	// 자식 <= 따라서 위에 있어야함. 사실 다형성에 의해서 없어도 됨 (부모가 에러 다 잡아주기 때문)
			e.printStackTrace();
		} catch (IOException e1) {	// 부모
			e1.printStackTrace();
		}
	}
	
	
	
	
	
}
