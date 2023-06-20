package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		// 계층 구조를 보면..
		
		// List 계열, Set 계열의 클래스들을 Collection 구현한 클래스다.
		// => 객체를 추가하고자 할 때 공통적으로 'add' 메소드 이용!
		
		// Map 계열은 Collection을 구현한 클래스가 아님
		// => 객체를 추가하고자 할 때 'put' 메소드 이용! (이때 '키 + 벨류' 세트로 담아야함)
		
		// 1. put(K key, V value) : 컬렉션에 키 벨류 세트로 '추가'시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 결과값 : {키=벨류, 키=벨류, ..}
		// 저장되는 순서 유지 안됨! value 값이 중복되어도 키 값이 중복안되면 잘 저장됨!
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하는 경우 value 값이 덮어 씌워짐!! (중복된 키값이 공존할 수 없음. 키 값이 식별자 같은 개념)
		System.out.println(hm);
		
		
		// 2. get(Object key) : V 	<= 컬렉션에서 해당 키값을 가지는 value 값을 '반환'시켜주는 메소드
		Snack s = (Snack)hm.get("다이제");	//형 동일하도록 강제형변환
		System.out.println(s);
		
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 '개수' 반환
		System.out.println("몇 개 있을까 ? : " + hm.size() + "개 있음");
		
		
		// 4. replace(K key, V value)	<= 컬렉션에서 해당 키값을 찾아서 다시 전달한 value 값으로 '수정'시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000));	// 없는 키값 제시시 무시함 "포테이토칩123" 무시
		System.out.println(hm);
		
		
		// 5. remove(Object key)	<= 컬렉션에서 해당 키 값 찾아서 그 키-벨류 세트로 '삭제'시켜주는 메소드
		hm.remove("포테이토칩");
		System.out.println(hm);
		
		
		System.out.println("==================================");
		
		
		// map 공간에 모든 키값과 벨류값 다 출력하고자 할 때..
		// for each문 안됨
		// for(Object o : hm) {
		// }
		
		// ArrayList도 안됨 (키값 포함되어있지 않기 때문에)
		// ArrayList list = new ArrayList(hm);
		
		// Iterator 반복자 도 안됨
		// Iterator it = hm.iterator();	// 곧바로 iterator() 호출 못함. 왜? iterator()는 List계열 또는 Set계열에서만 쓸 수 있는 메소드
		
		
		////////////////// Map => Set => 'Iterator' 호출 해보자! //////////////
		// Map을 Set으로 바꿔주는 메소드 제공함! (게다가 2개나..)
		// Map 계열 => Set 계열
		
		// 1. ketSet() 메소드 이용하는 방법
		// 	1) hm에 있는 '키'들만 Set에 담기 (키들의 집합 형태)
		Set keySet = hm.keySet();
		//	2) 1번 과정에서 작업된 keySet을 Iterator에 담기
		//	keySet.iterator() : Iterator 반환함
		Iterator itKey = keySet.iterator();
		//	3) 반복문 통해 뽑기
		while(itKey.hasNext()) {
			
			String key = (String)itKey.next();		// 형변환
			Snack value = (Snack)hm.get(key);		// 형변환
			
			System.out.println(key + "=" + value);
		}
		
		// 2. entrySet() 메소드 이용하는 방법
		//	1) hm.entrySet() : Set 반환함
		Set entrySet = hm.entrySet();
		//	2) entrySet.iterator() : Iterator 반환함
		Iterator itEntry = entrySet.iterator();
		//	3) 반복문 통해 가져오기
		while(itEntry.hasNext()) {
			
			Entry entry = (Entry)itEntry.next();	// 형변환, import
			
			String key = (String)entry.getKey();	// 형변환  // Entry 에는 키, 벨류 다 갖고있기 때문에 하나씩!
			Snack value = (Snack)entry.getValue();	// 형변환
			
			System.out.println(key + "=" + value);
		}
		
		
	}

}
