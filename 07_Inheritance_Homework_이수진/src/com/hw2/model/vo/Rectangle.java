package com.hw2.model.vo;

public class Rectangle extends Point { // 상속받~

	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// draw 메소드
	@Override
	public void draw() {
		// 부모 클래스의 draw() 메소드 호출을 통해 x,y 좌표값을 출력 후
		super.draw();
		// 면적 : 너비 * 높이
		// 둘레 : 2 * (너비 + 높이)
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (2 * (width + height)));
	}
	
}
