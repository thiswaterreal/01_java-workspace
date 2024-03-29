package com.hw1.model.vo;

public class Product {

	// 필드부
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	// 생성자 (기본 + 전체)
	// 1. 기본생성자
	public Product() {}
	
	// 2. 매개변수 생성자 (파랑:필드 / 갈색:매개변수)
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	// 메소드부 (get-set 메소드)
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// information()
	public String information() {
		return productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}
	
	/*//뭘 쓸지 모를 땐 일단 이렇게 작성해둬도 됨
	public String information() {
		return "";
	}
	public int information() {
		return ;
	}
	*/
	
	
}
