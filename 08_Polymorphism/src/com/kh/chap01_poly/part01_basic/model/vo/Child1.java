package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent {

	private int z;
	
	public Child1() {
		// super(); // 생략되어 있음. 부모 기본생성자가 없어지면 오류남. 따라서 기본생성자를 무조건 만들자!
	}
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	// printChild1() 메소드 생성
	public void printChild1() {
		System.out.println("나 첫번째 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫번째 자식이야");
	}
	
}
