package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념을 적용했을 때!!
public class ElectronicShop2 {

	// 자리를 마련하자
	// 다형성 : 부모타입 레퍼런스 하나로 다양한 자식객체를 담을 수 있음!!
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	// (아까)
	// Parent[] arr = new parent[4];
	// Parent 타입
	// arr[0] = new Child1(1,2,4);
	// arr[1] = new Child2(1,2,4);
	
	// 부모타입 배열로 모든 자식 객체 다루기 Start!! ============
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	// insert 함수 구현
	// 매개변수 => Desktop, NoteBook, Tablet 전부 다 받을 수 있는 부모 Electronic 으로 생성
	
	public void insert(Electronic any) {
		elec[count++] = any;
		
		// 맨처음 => count : 0 이었을 경우
		// any = new Desktop(~~~);
		// elec[0] = new Desktop(~~~); 이거 실행하고 count 1 이 됨
		
		// 그다음 => count : 1 이었을 경우
		// any = new NoteBook(~~~);
		// elec[1] = new NoteBook(~~~); 이거 실행하고 count 2 이 됨
		 
		// 그다음 => count : 2 이었을 경우
		// any = new Tablet(~~~);
		// elec[2] = new Tablet(~~~); 이거 실행하고 count 3 이 됨
		
	}
	
	// select 함수 구현
	public Electronic select(int index) {
		// Desktop => elec[0]
		// NoteBook => elec[1]
		// Tablet => elec[2]
		return elec[index];
	}
	
	
}
