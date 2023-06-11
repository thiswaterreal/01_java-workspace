package com.hw1.model.vo;

public class Employee extends Person { // 상속받~

	private int salary;
	private String dept;
	
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);		// 부모클래스의 private		//(문제)age, height, weight 값은 부모 생성자를 통해 초기화
		super.name = name; 	// **중요**	// 부모클래스의 protected	//(문제)name값은 부모 필드값에 직접 접근해서 초기화
		this.salary = salary;
		this.dept = dept;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", salary : " + salary + ", dept : " + dept;
	}
	
}
