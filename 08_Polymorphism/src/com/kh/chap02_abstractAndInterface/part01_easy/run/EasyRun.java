package com.kh.chap02_abstractAndInterface.part01_easy.run;

import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.BasketBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.FootBall;
import com.kh.chap02_abstractAndInterface.part01_easy.model.vo.Sports;

public class EasyRun {

	public static void main(String[] args) {

		// 추상클래스 객체 생성 불가 (왜? 미완성 클래스이기 때문에!)
		// Sports s = new Sports();		// 객체생성 불가
		// Sports s; // 객체 생성이 안될뿐이지 래퍼런스로는 사용 가능
		Sports s = new BasketBall();	// 다형성 적용시켜서 부모타입으로 자식객체를 받아주는 형태는 가능
		
		Sports[] arr = new Sports[2]; // 이건 객체생성이 아님. 배열만 만든거
		
		//부모타입으로	   자식객체 생성
		arr[0] =  new BasketBall();
		arr[1] =  new FootBall();
		
		// 단순 for문
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
		
		// 향상된 for문
		for(Sports a : arr) {	// a=arr[0], a=arr[1] // 자료형이 Sports형		//arr의 처음부터 끝까지 다 돌려서 a에 담아라
			a.rule();
		}
		// 여기서도 동적바인딩!
		
		/*
		 * 동적바인딩 : 컴파일시점에서는 정적바인딩으로 현재 레퍼런스의 자료형의 클래스에 있는 메소드를 가리키긴함
		 * 			하지만, 런타임시점(실행시점)에서는 동적바인딩으로 각각의 자식클래스에 오버라이딩 된 메소드가 있을 경우 그것을 실행함
		 */
		
		/*
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부({})가 구현되어 있지 않은 메소드
		 * 
		 * * 추상클래스
		 * - 미완성된 클래스
		 * - 일반필드 + 일반메소드 [+ 추상메소드]
		 * => 추상메소드를 가진 클래스는 반드시 추상클래스로 명시 해야함
		 * 
		 * * 추상메소드가 없어도 굳이 추상클래스로 만들 수 있음
		 * 	 	언제 사용되나요?
		 *
		 * 		> 개념적 : 단지 '이 클래스가 미완성된 클래스다' 라는걸 부여할 목적 => 아직 덜 만들었을 때
		 * 				(아직 미완성이라 객체생성 못하도록 막으려고)
		 * 		> 프로그래밍적 : 객체 생성이 불가하게끔 하고자 할 때
		 * 
		 * * 추상메소드가 존재하는 추상클래스를 쓰는 이유
		 * - 부모클래스에 추상메소드가 존재할 경우
		 * 	 자식클래스에서는 강제로 오버라이딩해서 동일한 패턴의 메소드를 가지게 됨
		 * 
		 * 	 => 각 자식클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때
		 * 	 	=> 메소드 통일성 확보 목적 (ex:rule)
		 * 		=> 표준화된 틀을 제공할 목적
		 */
		
	}

}
