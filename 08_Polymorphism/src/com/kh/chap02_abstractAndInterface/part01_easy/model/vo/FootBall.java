package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public class FootBall extends Sports {

	// 그럼 언제 완성하나요..? => 해당 추상클래스를 상속받는 자식에서!(밑)
	@Override
	public void rule() {
		System.out.println("공을 발로만 다뤄야 한다.");
	}

}
