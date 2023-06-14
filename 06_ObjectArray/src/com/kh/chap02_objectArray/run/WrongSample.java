package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		
		// 배열만 생성 (아직 객체생성x null 찍힘)
		Phone[] arr = new Phone[3];
		
		// 객체만 생성 (주소값 찍힘)
		// -------------- 1번째 조치 내용 --------------
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		
		// 출력
		for(int i=0; i<arr.length; i++) {	
			System.out.println(arr[i].getName()); //null null null
		}
		
		// 잘못된 부분
		// 1. NullPointerException : 객체배열의 각 인덱스에 담긴 값이 null인 상태에서 메소드를 호출하려고 했기 때문에
		//							=> 조치 내용 : 객체배열을 만든 후 각 인덱스별로 객체생성을 진행해야 함
		// 2. ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어난 경우
		// 	  조건식으로 (i<=배열의 길이) 라고 제시되어 있음. 배열의 마지막 인덱스보다 큰 값이 제시
		//							=> 조치 내용 : 조건식 수정 (i<배열의 길이) '='삭제
		
		
	}

}
