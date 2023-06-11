package com.hw1.model.vo;

public class Student extends Person {	// 상속받~

	private int grade;
	private String major;
	
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);		// 부모클래스의 private		//(문제)age, height, weight 값은 부모 생성자를 통해 초기화
		super.name = name; // **중요**	// 부모클래스의 protected	//(문제)name값은 부모 필드값에 직접 접근해서 초기화
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
