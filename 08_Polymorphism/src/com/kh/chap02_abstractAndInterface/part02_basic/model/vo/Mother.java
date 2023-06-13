package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mother extends Person implements Basic {	// 상속 => 단일상속 | 다중상속 => 인터페이스 활용

	private String babyBirth;	// 아이의 탄생 : 출산 or 입양 or 없음
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + babyBirth;
	}
	
	
	// 추상메소드
	@Override
	public void eat() {
		// 밥먹으면 몸무게 10증가
		//super.setWeight(내 본래 몸무게 + 10);
		super.setWeight(super.getWeight() + 10);
		// 밥먹으면 건강도 10감소
		super.setHealth(super.getHealth() - 10);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 20증가
		super.setHealth(super.getHealth() + 20);
	}

	
	
}
