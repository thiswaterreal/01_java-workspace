package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	private int x;
	private int y;
	
	public Parent() {}
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	// printParent() 메소드 생성
	public void printParent() {
		System.out.println("나 부모야");
	}
	
	// 오버라이딩
	public void print() {
		System.out.println("나 부모야");
	}
	
}
