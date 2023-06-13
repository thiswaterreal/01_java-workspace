package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성 적용 안했을때 !!
public class ElectronicShop1 {
	// 용산 전자상가에 있는 가게
	// Run에서 만든 제품을 여기서 전시한다!!
	// private int price; // 기본 자료형
	
	// 3개 제품을 마련할 자리부터 만들자
	private Desktop desk; 	// 내가 만든 자료형 (Desktop, NoteBook, Tablet)
	private NoteBook note;	// 객체 생성은 안되고 텅 비어있음
	private Tablet tab;
	
	// 이건 실제로 객체 생성된 것은 아님
	// 필드가 메모리상에 확보되는 순간 => (new를 만나는 순간이)객체가 생성되는 순간! 
	// 						  => ElectronicShop1 es = new ElectronicShop1();
	
	// 추가 메소드 : insert~~~()
	// Run파일에서 만든 제품을 내가 마련해놓은 필드자리에 넣어보자
	
	// '데스크탑' 이라는 객체를 생성해서 넘기는 메소드 => es.insert(new Desktop("samsung", "데땁", 1200000, "gtx1070"));
	// new Desktop 어쩌구 객체가 생성되어 넘어오면 (Desktop d) 에 d라는 이름으로 담김
	// 내가 만든 d를 desk에 넣어줌
	// 따라서 insert메소드를 호출할때 비로소 Desktop 객체가 생성됨
	public void insert(Desktop d) {	// Desktop 'd' = new Desktop("samsung", "데땁", 1200000, "gtx1070");
		desk = d;
		// Desktop d = new Desktop(~~~); 와 같다고 생각하셈
	}
	public void insert(NoteBook n) { // NoteBook 'n' = new NoteBook("LG", "그램", 2000000, 4);
		note = n;
	}
	public void insert(Tablet t) { 	// Tablet 't' = new Tablet("Apple", "아이패드", 800000, false);
		tab = t;
	}
	
	// (복습)
	// 동일한 클래스에 동일한 메소드 명으로 여러개 만들어져있는 것 => 오버로딩
	// 단, 매개변수 명은 달라야한다! (다 같아도됨. 다만, 매개변수명만 다르면됨!!)
	// 따라서 위 내용은 오버로딩이 적용되어 있음 (insert 메소드)
	
	// 조회 메소드 : select~~~()
	// Run파일에서 가게에 객체들이 잘 생성되었는지 확인을 해볼건데, 그러기위해 select 메소드를 만들자
	// 모르겠으면 일단은 반환형을 void로 가자 => 나중에 수정 가능 (Desktop형, NoteBook형, Tablet형)
	public Desktop selectDesktop() {
		return desk;
		// 잘 담아둔 desk를 던져준다(띄운다)
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	// ()안을 비워둬야하니까 select으로 동일시켜버리기까지하면 오류남 따라서 매개변수가 없으니 이름이라도 다르게!
	
	// (복습)
	// insert 처럼 select도 같은 이름으로 하면 안되는 이유는?
	// 매개변수가 없기 때문에 불가능함! => 오류남
	
	// 현재는 메소드가 총 6개 (insert 3개, select 3개)
	// 다형성 적용하면? 2~3개로 줄이기 가능!
	
}
