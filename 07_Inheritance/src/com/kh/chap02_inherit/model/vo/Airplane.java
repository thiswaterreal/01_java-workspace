package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle { //상속받

	private int tire;
	private int wing;
	
	public Airplane () {}
	public Airplane (String name, double mileage, String kind, int tire, int wing) { // 전부 (공통3개 + 나2)
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getWing() {
		return wing;
	}
	public void setWing(int wing) {
		this.wing = wing;
	}
	
	// **오버라이딩
	public String information() {
		return super.information() + ", tire : " + tire + ", wing : " + wing;
	}
	
	@Override
	public void howToMove() {
		System.out.println("바퀴를 굴리다가 날개를 휘저으며 움직인다.");
	}
	
}
