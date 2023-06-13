package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {

	public void method() {
		
		String str = "Java,Oracle,JDBC,HTML,CSS,Spring";
		
		// 구분자를 기준으로해서 문자열을 분리시키는 방법
		
		// 방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할 때
		// 		 String 클래스에서 제공하는 split 메소드 이용
		// 		 문자열.split(구분자) : String[]
		
		String[] arr = str.split(",");
		System.out.println("arr 배열의 길이 : " + arr.length); // java,oracle..(6개)
		
		
		// 단순 for문
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		
		/*
		// 향상된 for문
		int count = 0;
		for(String a : arr) {	// a = arr[0], a= arr[1]...
			System.out.println(count + "번째 인덱스 : " + a);
			count++;
		}
		*/
		
		System.out.println();
		// 방법2. 분리된 문자열들을 각각 토큰으로써 관리하고자 할 때 **중요**
		// 		 java.util.StringTokenizer 클래스를 이용하는 방법
		// 		 StringTokenizer stn = new StringTokenizer(분리시키고자 하는 문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		/*
		System.out.println("분리된 문자열의 개수 : " + stn.countTokens()); 	// 6
		System.out.println(stn.nextToken());	// Java부터 하나씩 나옴
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println(stn.countTokens()); 	// 다 뽑으면 끝남.. 일회성
		
		System.out.println(stn.nextToken());	// NoSuchElementException : 더 이상 뽑을 요소가 없다..
		*/
		
		
		/*
		// 방법0 : 불가능 => stn.countTokens()값이 계속 바뀌기 때문
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		// i=0; i<6; true 출력("JAVA") i++;
		// i=1; i<5; true 출력("Oracle") i++;
		// i=2; i<4; true 출력("JDBC") i++;
		// i=3; i<3; false (조건이 안맞으니까 더이상 실행x)
		*/
		
		
		/*
		// 해결방법1
		int count1 = stn.countTokens();		// 6
		for(int i=0; i<count1; i++) {		// 그럼 6으로 계속 고정
			System.out.println(stn.nextToken());
		}
		*/
		
		
		// 해결방법2
		while(stn.hasMoreTokens()) {		// 반복 수행될 조건 : 토큰이 남아있을때만 출력
			System.out.println(stn.nextToken());
		}
			
		
	}
	
}
