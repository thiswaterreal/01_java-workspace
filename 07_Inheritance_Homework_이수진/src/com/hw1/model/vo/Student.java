package com.hw1.model.vo;

public class Student extends Person {	// 상속받~

	private int grade;
	private String major;
	
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		// name 값은 '부모 필드값'에 직접 접근해서 초기화
		// age, height,weight는 '부모 생성자'를 통해 초기화
		super(age, height, weight);			// 부모클래스의 private	
		super.name = name; // ***중요***		// 부모클래스의 protected	
		this.grade = grade;
		this.major = major;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", grade : " + grade + ", major : " + major;
	}
	
}
