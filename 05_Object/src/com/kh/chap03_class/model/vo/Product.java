package com.kh.chap03_class.model.vo;

public class Product {
	
	// 필드부
	private String pName;
	private int price;
	private String brand;
	
	// setter : [public void setXxxxx(자료형 xxxxx)]
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// getter : [public 자료형 getXxxxx]
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}


}
