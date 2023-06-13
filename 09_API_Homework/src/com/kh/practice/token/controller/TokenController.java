package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	
	public String afterToken(String str) {
		
		/*
		// 방법1
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환
		StringTokenizer stn = new StringTokenizer(str, " ");	// 구분준비!
		
		String sum = "";
		while(stn.hasMoreTokens()) {		
			sum += stn.nextToken();		
		}
		return sum;
		*/
		
		// 방법2
		StringTokenizer stn = new StringTokenizer(str, " ");
		
		String sum = "";
		int count1 = stn.countTokens(); // count1 11개 고정!
		for(int i=0; i<count1; i++) {
			sum += stn.nextToken();
		}
		return sum;
		
	}
	// stn이라는 변수에 저장된 문자열의 시작에서 끝까지 진행되어야 함.
	// 그래서 while문을 사용하여 문자열의 끝까지 구분할 수 있도록 반복문을 뺑뺑~
	// .hasMoreTokens(); 메소드 : token이 있으면 true, 없으면 false를 return
	// .nextToken(); 메소드 	  : 조건을 만족할 때까지 계속 다음 토큰을 읽어 들이는 역할
		
		
	public String firstCap(String input) {
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾼 문자열 반환
		char[] arr = input.toCharArray();			// a p p l i c a t i o n
		char ch = input.toUpperCase().charAt(0);	// A
		arr[0] = ch;								// A p p l i c a t i o n
        return String.valueOf(arr);					// Appliction
	}
	// .toCharArray(); => 문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 집어넣어주는 메소드
	// .valueOf();	   => 쪼갰던거 합치기
	
	public int findChar(String input, char one){
		// 매개변수의 문자가 문자열 안에 몇 개가 들어가 있는지 반환
		int count = 0;
		char[] arr = input.toCharArray();			// a p p l i c a t i o n
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == one) {
				count++;
			}
		}
		return count;
	}
		
	
	
}
