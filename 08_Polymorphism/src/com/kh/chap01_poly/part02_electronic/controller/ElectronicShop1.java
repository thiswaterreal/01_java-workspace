package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을때 !!
public class ElectronicShop1 {

	// 용산 전자상가에 있는 가게
	// private int price; // 기본 자료형
	
	// 3개 제품을 마련할 자리부터 만들자
	private Desktop desk; 	// 내가 만든 자료형 (Desktop, NoteBook, Tablet)
	private NoteBook note;	// 객체 생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 추가 메소드 : insert~~~()
	// 이건 실제로 객체 생성된 것은 아님
	// 필드가 메모리상에 확보되는 순간 => 객체가 생성되는 순간!
	public void insert(Desktop d) {	// Desktop 'd' = new Desktop("samsung", "데땁", 1200000, "gtx1070");
		desk = d;
	}
	public void insert(NoteBook n) { // NoteBook 'n' = new NoteBook("LG", "그램", 2000000, 4);
		note = n;
	}
	public void insert(Tablet t) { 	// Tablet 't' = new Tablet("Apple", "아이패드", 800000, false);
		tab = t;
	}
	
	// (복습)
	// 동일한 클래스에 동일한 메소드 명으로 여러개 만들어져있는 것 => 오버로딩
	// 단, 매개변수 명은 달라야한다!
	// 따라사 위 내용은 오버로딩이 적용되어 있음 (insert 메소드)
	
	
	
	// 조회 메소드 : select~~~()
	// 모르겠으면 일단은 반환형을 void로 가자 => 나중에 수정 가능 (Desktop형, NoteBook형, Tablet형)
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	
	// (복습)
	// insert 처럼 select도 같은 이름으로 하면 안되는 이유는?
	// 매개변수가 없기 때문에 불가능함! => 오류남
	
	// 현재는 메소드가 총 6개 (insert 3개, select 3개)
	// 다형성 적용하면? 2~3개로 줄이기 가능!
	
}
