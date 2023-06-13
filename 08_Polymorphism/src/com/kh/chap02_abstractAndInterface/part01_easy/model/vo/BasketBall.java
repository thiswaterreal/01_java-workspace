package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class BasketBall extends Sports {

	// 그럼 언제 완성하나요..? => 해당 추상클래스를 상속받는 자식에서!(밑)
	
	// 자식클래스에 강제성을 부여하기 위함 (rule없는 sports는 없기 때문)
	// basketball, football 이든 무조건 rule이 있으니 rule을 구현했으면 해서..
	
	// 추상메소드가 존재하는 추상클래스를 상속받는 순간
	// 부모클래스에 있던 추상메소드를 강제로 오버라이딩 해야됨
	
	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 다뤄야 한다.");
	}
	


	
	
}
