package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		// Product p1 = new Product(); <= 이런 형식이 '기본생성자를 이용한 객체생성'
		
		// '매개변수 생성자를 이용하여 3개의 객체 생성' (위의 사용 데이터 참고)
		// 객체가 가진 필드 값 출력 확인
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		
		// 각 객체의 가격을 모두 120만원으로 변경 / 부가세율도 모두 0.05로 변경
		// 객체가 가진 필드 값 출력 확인
		p1.setPrice(1200000);
		p2.setPrice(1200000);
		p3.setPrice(1200000);
		p1.setTax(0.05);
		p2.setTax(0.05);
		p3.setTax(0.05);
		System.out.println("========== 가격, 부가세율 변경 후 ==========");
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		
		// 각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력함
		// ** 실제가격 = 가격 + (가격 * 부가세율)
		System.out.println("========== 부가세율 적용한 실제 가격 ==========");
		System.out.println("상풍명 : " + p1.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p1.getPrice() + (p1.getPrice() * p1.getTax())) + "원");
		System.out.println("상풍명 : " + p2.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p2.getPrice() + (p2.getPrice() * p2.getTax())) + "원");
		System.out.println("상풍명 : " + p3.getProductName());
		System.out.println("부가세 포함 가격 : " + (int)(p3.getPrice() + (p3.getPrice() * p3.getTax())) + "원");
		// double형이 있다보니까 큰거 따라감. 따라서 형변환! (int)로 묶어주기!
		
		
	}

}
