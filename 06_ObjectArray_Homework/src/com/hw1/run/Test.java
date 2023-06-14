package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Test {

	public static void main(String[] args) {

		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] emp = new Employee[3];
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		emp[0] = new Employee();
		
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울잠실");
		
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡");
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].information());
		}
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 300000, 0.2, "01055559999", "전라도광주");
		emp[1].setDept("기획부");
		emp[1].setJob("부장");
		emp[1].setSalary(4000000);
		emp[1].setBonusPoint(0.3);
		
		for(int i=0; i<emp.length; i++) {
			System.out.println(emp[i].information());
		}
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 +(급여 *보너스 포인트)) * 12
		
		for(int i=0; i<emp.length; i++) {
			int year = (int)(emp[i].getSalary() + (emp[i].getSalary() * emp[i].getBonusPoint())) * 12;
			System.out.println(year);
		}
		
		// 3명 직원의 연봉 평균을 구하여 출력????????????????
		
		
	}

}
