package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public abstract class Person {		//=====추상클래스=====

	private String name;
	private double weight;
	private int health;
	
	public Person() {}
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		return name + ", " + weight + ", " + health;
	}
	
	
	// 추상메소드 생성해보자
	//public abstract void eat();		// interface 실습을 위해 잠시 잠궈~
	//public abstract void sleep();		// interface 실습을 위해 잠시 잠궈~
	
	// (class 가서도 abstract 추가)
	
	
}
