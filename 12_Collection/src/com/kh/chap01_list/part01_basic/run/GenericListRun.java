package com.kh.chap01_list.part01_basic.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_basic.model.vo.Music;

public class GenericListRun {

	public static void main(String[] args) {

		// <Music> 형으로 제네릭 설정함 (따라서 이제 'Music 객체'만 들어올 수 있음)
		ArrayList<Music> list = new ArrayList<Music>();
		
		list.add(new Music("Attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		// list.add("가보자고"); 		// 불가능. 다른 타입 담기 불가 (제네릭 설정했기 때문에 Music만 가능. String타입 불가)
		System.out.println(list);
		
		list.add(1, new Music("진심이 담긴 노래", "케이시"));
		System.out.println(list);
		
		List<Music> sub = list.subList(0, 2);
		// subList 쓸 때는 거의 항상 '제네릭'설정 함
		System.out.println(sub);
		
		list.addAll(sub);
		
		Music m = list.get(0); 
		// 제네릭했기 때문에 변수에 담을때 어차피 Music형이기 때문에 따로 형변환 할 필요가 없어짐!!
		System.out.println(m);
		System.out.println(list.get(0).getArtist());
		
		for(Music o : list) {	// o = list.get(0)  =>  o = list.get(1)
			System.out.println(o);
		}
		
		/*
		 * * 제네릭<>을 사용하는 이유?
		 * 1. 명시된 타입의 객체만 저장하도록 제한을 둘 수 있음
		 * 2. 컬렉션에 저장된 객체를 꺼내서 사용할 때, 매번 형변환 하는 절차를 없애기 위해
		 */
		
		
		
		
		
	}

}
