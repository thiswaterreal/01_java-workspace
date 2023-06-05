package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		
		// 1. 'product' 객체 생성
		Product dessert = new Product();
		
		// 2. setter 메소드 이용하여 값 대입
		dessert.setpName("완두앙금빵");
		dessert.setPrice(2800);
		dessert.setBrand("수쟌빵굼터");
		
		// 3. getter 메소드 이용하여 값 출력
		System.out.println();
		System.out.println("=== 상품1 ===");
		System.out.println("상품명 : " + dessert.getpName());
		System.out.println("가격 : " + dessert.getPrice());
		System.out.println("브랜드 : " + dessert.getBrand());
		
		// ===두번째===
		dessert.setpName("얼그레이케이크");
		dessert.setPrice(32000);
		dessert.setBrand("아티제");
		
		System.out.println();
		System.out.println("=== 상품2 ===");
		System.out.println("상품명 : " + dessert.getpName());
		System.out.println("가격 : " + dessert.getPrice());
		System.out.println("브랜드 : " + dessert.getBrand());
		
		// ===세번째===
		dessert.setpName("무화과깜빠뉴");
		dessert.setPrice(8000);
		dessert.setBrand("블랑슈");
		
		System.out.println();
		System.out.println("=== 상품3 ===");
		System.out.println("상품명 : " + dessert.getpName());
		System.out.println("가격 : " + dessert.getPrice());
		System.out.println("브랜드 : " + dessert.getBrand());
		
		
		
	}
	
	
	
	
	
}
