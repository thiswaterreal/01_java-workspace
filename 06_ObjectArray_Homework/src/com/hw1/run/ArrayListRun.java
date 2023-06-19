package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.vo.Employee;

public class ArrayListRun {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		
		// Employee 객체 만들기
		list.add(new Employee());
		list.add(new Employee(1, "홍길동", 19, 'M', "01022223333", "서울잠실"));
		list.add(new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡"));
		
		for(Employee e : list) {
			System.out.println(e.information());
		}
		
		System.out.println("===============================================");
		
		list.get(0).setEmpNo(0);
		list.get(0).setEmpName("김말똥");
		list.get(0).setDept("영업부");
		list.get(0).setJob("팀장");
		list.get(0).setAge(30);
		list.get(0).setGender('M');
		list.get(0).setSalary(30000);
		list.get(0).setBonusPoint(0.2);
		list.get(0).setPhone("01055559999");
		list.get(0).setAddress("전라도광주");
		//list.add(new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 300000, 0.2, "01055559999", "전라도광주"));
		list.get(1).setDept("기획부");
		list.get(1).setJob("부장");
		list.get(1).setSalary(4000000);
		list.get(1).setBonusPoint(0.3);
		
		for(Employee e : list) {
			System.out.println(e.information());
		}
		
		System.out.println("===============================================");
		for(Employee e : list) {
			System.out.println(e.getEmpName() + "의 연봉 : " + (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint()) * 12));
		}
		
		System.out.println("===============================================");
		int total = 0;
		for(Employee e : list) {
			total += (int)(e.getSalary() + (e.getSalary() * e.getBonusPoint()) * 12);
		}
		System.out.println("평균 연봉 : " + total / list.size());
	
	
	
	
	}

}
