package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Baby extends Person implements Basic {	// 상속 => 단일상속 | 다중상속 => 인터페이스 활용

	// 추가할 필드값 음슴~
	
	public Baby() {}
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
	// 추상메소드
	@Override
	public void eat() {
		// 밥먹으면 몸무게 3증가
		super.setWeight(super.getWeight() + 3);
		// 밥먹으면 건강도 1증가
		super.setHealth(super.getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3증가
		super.setHealth(super.getHealth() + 3);
	}

	
	
}
