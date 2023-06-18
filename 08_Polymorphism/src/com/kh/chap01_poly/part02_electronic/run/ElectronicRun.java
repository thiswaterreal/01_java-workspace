package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {

		// 실행용 클래스는 납품업체라고 생각!
		// Run에서 제품을 만든다!!

		/*
		 * (1) // 1. 다형성 적용 안했을 경우(ElectronicShop1)===================
		 * 
		 * ElectronicShop1 es = new ElectronicShop1(); // es에서 마련해 놓은 desk, note, tab
		 * 이라는 필드에 // 객체를 생성해서 넣어주기 위해서 우선 es 생성! => 몇개?? 필드값만큼 (3개)
		 * 
		 * // 메소드를 써서 생성하겠음 // 먼저 필요한 메소드를 생각해보자
		 * 
		 * 
		 * // 아직은 없는 메소드 // 추가용 메소드 => insert // es의 insert를 호출하면 '내가 원하는 객체' 를 만들어줘! //
		 * '데스크탑' 이라는 객체를 생성해서 넘기는 메소드 // (호출할때 new Desktop 어쩌구를 같이 들고감)
		 * 
		 * // es.insert(데스크탑 객체를 생성하는 구문); es.insert(new Desktop("samsung", "데땁",
		 * 1200000, "gtx1070"));
		 * 
		 * // 노트북 이라는 객체를 생성해서 넘기는 메소드 es.insert(new NoteBook("LG", "그램", 2000000, 4));
		 * 
		 * // 태블릿 이라는 객체를 생성해서 넘기는 메소드 es.insert(new Tablet("Apple", "아이패드", 800000,
		 * false));
		 * 
		 * 
		 * // 가게에 해당 객체들이 잘 생성되어있는지를 확인해보자 // 조회용 메소드 => select();
		 * 
		 * // shop1에서 던져준 desk를 자료형 맞게 조회 // 날아온 Desktop 객체를 (자료형 Desktop인) d 에 저장
		 * //String desk = es.selectDesktop(); // 불가능.
		 * 
		 * Desktop d = es.selectDesktop(); NoteBook n = es.selectNoteBook(); Tablet t =
		 * es.selectTablet();
		 * 
		 * // 출력 System.out.println(d); System.out.println(n); System.out.println(t);
		 * 
		 * (1)
		 */

		// 2. 다형성 적용했을 경우 (ElectronicShop2)====================
		ElectronicShop2 es = new ElectronicShop2();

		// 추가용 메소드 => insert
		es.insert(new Desktop("samsung", "데땁", 1200000, "gtx1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("Apple", "아이패드", 800000, false));

		// 조회용 메소드 => select
		// 이번에는 이름을 하나로!

		// es.select(인덱스값);
		// Desktop d = es.select(0); // 불가능.
		// es.select(0); 하면 Electronic형이 날아옴.
		// 실제로 들어있는 값은 Desktop 객체가 맞으나 반환형(날아오는것)이 Electronic 이라서 맞춰줘야함! => 강제형변환

		/*
		 * 방법1 Desktop d = (Desktop)es.select(0); // es.select(0); 만 하면 electronic형을
		 * 뱉으니까 (자식형)으로 강제형변환 시켜준다 NoteBook n = (NoteBook)es.select(1); Tablet t =
		 * (Tablet)es.select(2); // 이런걸 강제형변환, 다운캐스팅 이라고 한다!
		 */

		// 방법2 // es.select(0); 만 하면 electronic형을 뱉음 => 걍 electronic으로 받아줘버려도 됨
		Electronic d = es.select(0);
		Electronic n = es.select(1);
		Electronic t = es.select(2);

		// 위, 아래 방법 둘다 가능

		// 그럼 toString() 할 때 부모에 있는 toString(3개)을 불러오지 않고, 자식에 있는 toString(3+1)을 불러올까?
		// => 왜?? 동적바인딩! (자식에도 오버라이딩 한 toString이 있기 때문에 그것을 불러옴)

		System.out.println(d);
		System.out.println(n);
		System.out.println(t);

		/*
		 * 다형성을 사용하는 이유 1. 부모타입 배열로 다양한 자식객체들을 받을 수 있음 2. 메소드 정의시 매개변수로 다형성을 적용하게되면 메소드
		 * 개소가 확 줄어든다! (any 로 받아) 3. 필수로 써야하는 곳이 있음 => 추상클래스(인터페이스)
		 */

	}

}
