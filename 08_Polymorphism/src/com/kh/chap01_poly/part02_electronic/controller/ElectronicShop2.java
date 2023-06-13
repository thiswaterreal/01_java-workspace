package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념을 적용했을 때!!
public class ElectronicShop2 {
	
	// 자리를 마련하자
	// 다형성 : 부모타입 레퍼런스(Parent[]) 하나로 다양한 자식객체를 담을 수 있음!!
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	// (기본 부모-자식)
	// Parent[] arr = new parent[4];
	// 타입 : Parent
	// arr[0] = new Child1(1,2,4);
	// arr[1] = new Child2(1,2,4);
	// 	=> 부모로 배열을 만들어놓고 자식 객체를 생성하는 것
	
	// 부모타입 배열로 모든 자식 객체 다루기 Start!! ============
	// 부모타입의 elec 은 new 자식객체 3칸;
	// 부모타입 : Electronic[]
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	// insert 함수 구현
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있는 => 부모 Electronic 으로 생성
	
	public void insert(Electronic any) {
		elec[count++] = any;
		
		// elec[] = any;
		// 여기에 elec[0], elec[1], elec[..] 가 들어갈 수 있도록 count 변수를 만들어줘서 사용
		// elec[count++] = any;
		// []자리에 처음은 0, 후위연산 처리니까 처리 후 count++ 되어 []자리에 1 ..쭉쭉
		
		// (any에 new Desktop(어쩌구)를 담아. 어떻게 알고 any에? Run파일의 같은 insert 메소드로)
		// 맨처음 => count : 0 이었을 경우
		// any = new Desktop(~~~);     
		// elec[0] = new Desktop(~~~); 이거 실행하고 count 1 이 됨
		// (0번 인덱스에 Desktop어쩌구를 넣음) 
		
		// 그다음 => count : 1 이었을 경우
		// any = new NoteBook(~~~);
		// elec[1] = new NoteBook(~~~); 이거 실행하고 count 2 이 됨
		 
		// 그다음 => count : 2 이었을 경우
		// any = new Tablet(~~~);
		// elec[2] = new Tablet(~~~); 이거 실행하고 count 3 이 됨	
	}
	
	// select 함수 구현
	public Electronic select(int index) { // 자료형은 모든것을 받아줄 수 있는 Electronic 으로 작성
		return elec[index];
		// elec 배열의 사용자가 원하는 index 번째 값을 던져줌
		
		// Desktop이 궁금하다? elec[0] 출력
		// Desktop => elec[0]
		// NoteBook => elec[1]
		// Tablet => elec[2]
	}
	
	
}
