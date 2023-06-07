package com.kh.chap03_class.model.vo;

public class person {

	// 필드 선언 (private <= 캡슐화)
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// setter 메소드 (7개) - 값대입
	public void setId(String id) {	//(자료형 변수명) == (매개변수)
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// getter 메소드 (7개) - 값반환
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	
	// all (모든 필드값들 다 합친 하나의 문자열을 반환해주는 메소드)
	public String information() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + ", age : " + age + ", gender : " + gender + ", phone : " + phone + ", email : " + email;
	}
	
}
