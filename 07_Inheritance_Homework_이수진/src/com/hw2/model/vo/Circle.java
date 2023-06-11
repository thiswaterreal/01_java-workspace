package com.hw2.model.vo;

public class Circle extends Point { // 상속받~
	
	private int radius;
	
	public Circle() {}
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	// draw 메소드
	@Override
	public void draw() {
		// 부모 클래스의 draw() 메소드 호출을 통해 x,y 좌표값을 출력 후
		super.draw();
		// 면적 : PI * 반지름 * 반지름
		// 둘레 : PI * 반지름 * 2
		System.out.println("면적 : " + String.format("%.1f", (Math.PI * radius * radius)));
		System.out.println("둘레 : " + String.format("%.1f", (Math.PI * radius * 2)));
	}
	
	
}
