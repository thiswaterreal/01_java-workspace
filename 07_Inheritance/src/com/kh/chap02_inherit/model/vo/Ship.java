package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {	//상속받
	
	private int propeller;
	
	public Ship () {}
	public Ship(String name, double mileage, String kind, int propeller) { // 전부 (공통3개 + 나1)
		super(name, mileage, kind);
		this.propeller = propeller;
	}
	
	public int getPropeller() {
		return propeller;
	}
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	
	// **오버라이딩
	public String information() {
		return super.information() + ", propeller : " + propeller;
	}

	@Override
	public void howToMove() {
		System.out.println("프로펠러를 돌려서 움직인다.");
	}
}
