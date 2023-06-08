package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {

		// 객체 배열을 크기 3으로 할당 한 뒤
		Employee[] emps = new Employee[3];
		
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		emps[0] =  new Employee();
		
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용해서 객체 생성
		emps[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울잠실");
		
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		emps[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울마곡");
			//출력
		for(int i=0; i<emps.length; i++) {
			System.out.println("emp[" + i + "] : " + emps[i].information());
		}
		
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력(임의로)
		System.out.println("==============================================");
		emps[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 300000, 0.2, "01055559999", "전라도광주");
		emps[1].setDept("기획부");
		emps[1].setJob("부장");
		emps[1].setSalary(4000000);
		emps[1].setBonusPoint(0.3);
			//출력
		for(int i=0; i<emps.length-1; i++) {
			System.out.println("emp[" + i + "] : " + emps[i].information());
		}
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력		
		// 보너스가 적용된 연봉 = (급여 +(급여 * 보너스 포인트)) * 12
		System.out.println("==============================================");
		int total1 = (int)((3000000 + (3000000 * 0.2)) * 12);
		int total2 = (int)((4000000 + (4000000 * 0.3)) * 12);
		int total3 = (int)((1000000 + (1000000 * 0.01)) * 12);
		System.out.println("김말똥의 연봉 : " + total1 + "원");
		System.out.println("홍길동의 연봉 : " + total2 + "원");
		System.out.println("강말순의 연봉 : " + total3 + "원");
		
		// 3명 직원의 연봉 평균을 구하여 출력
		System.out.println("==============================================");
		//int all = ((total1 + total2 + total3)/3);
		int all = ((total1 + total2 + total3)/emps.length);
		System.out.println("직원들의 연봉의 평균 : " + all + "원");
		
		
	}

}
