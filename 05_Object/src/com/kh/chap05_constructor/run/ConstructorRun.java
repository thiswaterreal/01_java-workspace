package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {

		// 1. 기본생성자로 객체 생성하는 법
		User u1 = new User();
		System.out.println(u1.information());
		// 각 필드에 JVM 초기값들 담겨 있음
		//userId : null, userPwd : null, userName : null, age : 0, gender : 
		
		// 회원가입시 필수 입력사항만 입력 받는다면?
		
		/*
		User u2 = new User();
		u2.setUserId("user02");
		u2.setUserPwd("pwd02");
		u2.setUserName("차은우");
		System.out.println(u2.information());
		// 셋팅한값은 셋팅한대로, 안한건 초기값으로 출력됨
		//userId : user02, userPwd : pwd02, userName : 차은우, age : 0, gender : 
		 */
		
		
		// 2. 매개변수 3개짜리 생성자로 객체 생성 후 정보 출력
		User u2 = new User("user02", "pwd02", "차은우");
		System.out.println(u2.information());
		//userId : user02, userPwd : pwd02, userName : 차은우, age : 0, gender : 
	
		// 그럼 setter 안만들어도 되지 않을까.. => 안됨(필요함)
		// 비번을 바꾸는 경우, 개명을 한 경우
		u2.setUserName("차누누");
		System.out.println(u2.information());
		//userId : user02, userPwd : pwd02, userName : 차누누, age : 0, gender : 
		
		// 그럼 getter 안만들어도 되지 않을까.. => 안됨(필요함)
		// 비번을 까먹은 경우에는 비번만 보여줘야함. 그떄 getter 필요함
		
		
		// (실습)
		// 3. 매개변수 5개짜리 생성자로 객체 생성
		// "user03" "pwd03" "장원영" 23 '여'
		// information() 출력
		User u3 = new User("user03", "pwd03", "장원영", 23, '여');
		System.out.println(u3.information());
		//userId : user03, userPwd : pwd03, userName : 장원영, age : 23, gender : 여
	}

}
