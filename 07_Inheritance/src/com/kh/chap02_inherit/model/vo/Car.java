package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle { //상속받

	private int tire;
	
	public Car() {}
	public Car(String name, double mileage, String kind, int tire) { // 전부 (공통3개 + 나1)
		super(name, mileage, kind);
		this.tire = tire;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	
	// **오버라이딩
	public String information() {	// (부모꺼에서)공통3개 + 나1
		return super.information() + ", tire : " + tire;
	}
	
	@Override //어노테이션(뱃지)(생략가능)
	public void howToMove() {	// 어노테이션 붙인 경우에는 메소드 이름 이상하게 쓰면 부모와 달라서 오류남
		System.out.println("바퀴를 굴려 움직인다.");
	}
	
	@Override //toString(늘 자동 호출 됨)은 Object에 있음
	public String toString() {
		return "아무말";
	}
	
}
