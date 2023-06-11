package com.hw2.model.vo;

public class Point {	// 부모에요~

	private int x;
	private int y;
	
	public Point() {}
	public Point(int x, int y) {
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
	
	// draw 메소드
	public void draw() {
		System.out.println("x값 : " + x);
		System.out.println("y값 : " + y);
	}
	
	
}
