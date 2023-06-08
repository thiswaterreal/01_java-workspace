package com.kh.chap01_oneVSmany.model.vo;

public class Book {

	// 필드부
	// 도서명, 저자, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	// 생성자부
	// 기본생성자
	public Book() {}
	
	// 전체 매개변수 생성자
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	// 메소드부 (get - set 메소드)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// information 메소드
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}
	
	
	
}
