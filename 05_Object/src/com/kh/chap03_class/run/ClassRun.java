package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;
import com.kh.chap03_class.model.vo.person;

public class ClassRun {

	public static void main(String[] args) {
		
		// 1. 'product' 객체 생성
		Product dessert1 = new Product();
		
		// 2. setter 메소드 이용하여 값 대입
		dessert1.setpName("완두앙금빵");
		dessert1.setPrice(2800);
		dessert1.setBrand("수쟌빵굼터");
		
		// 3. getter 메소드 이용하여 값 출력
		System.out.println();
		System.out.println("=== 상품1 ===");
		System.out.println("상품명 : " + dessert1.getpName());
		System.out.println("가격 : " + dessert1.getPrice());
		System.out.println("브랜드 : " + dessert1.getBrand());
		
		// ===두번째===
		Product dessert2 = new Product();
		
		dessert2.setpName("얼그레이케이크");
		dessert2.setPrice(32000);
		dessert2.setBrand("아티제");
		
		System.out.println();
		System.out.println("=== 상품2 ===");
		System.out.println("상품명 : " + dessert2.getpName());
		System.out.println("가격 : " + dessert2.getPrice());
		System.out.println("브랜드 : " + dessert2.getBrand());
		
		// ===세번째===
		Product dessert3 = new Product();
		
		dessert3.setpName("무화과깜빠뉴");
		dessert3.setPrice(8000);
		dessert3.setBrand("블랑슈");
		
		System.out.println();
		System.out.println("=== 상품3 ===");
		System.out.println("상품명 : " + dessert3.getpName());
		System.out.println("가격 : " + dessert3.getPrice());
		System.out.println("브랜드 : " + dessert3.getBrand());
		
		// all (모든 필드값들 다 합친 하나의 문자열을 반환해주는 메소드)
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(dessert1.information());
		System.out.println(dessert2.information());
		System.out.println(dessert3.information());
		
		///////////////////////////////////////////////
		
		
		// 1. 'person' 객체 생성
		person p = new person();
		
		System.out.println(p.getId());		// null
		System.out.println(p.getAge());		// 0
		System.out.println(p.getGender());	// ' '
		// 생성 후에 필드에 담긴값을 곧바로 알아보면
		// JVM이 초기화(값 셋팅)까지 진행해줬음!
		
		// 2. setter 값대입
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("이수진");
		p.setAge(99);
		p.setGender('F');
		p.setPhone("010-1234-5678");
		p.setEmail("googleemail@gmail.com");
		
		// 3. getter 값출력
		System.out.println("===값 대입 후===");
		System.out.println(p.getId());
		System.out.println(p.getPwd());
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		System.out.println(p.getPhone());
		System.out.println(p.getEmail());
		
		// all (모든 필드값들 다 합친 하나의 문자열을 반환해주는 메소드)
		System.out.println();
		System.out.println("=== 메소드 만들고 난 후 ===");
		System.out.println(p.information());
		//id : user01, pwd : pwd01, name : , age : 99, gender : F, phone : 010-1234-5678, email : googleemail@gmail.com

		
		
	}
	
	
	
	
	
}
