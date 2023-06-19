package com.kh.chap02_inherit.run;

import java.util.ArrayList;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class ArrayListRun {

	public static void main(String[] args) {

		System.out.println("================== 컬렉션 & 제네릭 =================");
		
		ArrayList<Vehicle> list = new ArrayList<>();
		
		list.add(new Car("벤틀리", 12.5, "세단", 4));
		list.add(new Ship("낚시배", 3, "어선", 1));
		list.add(new Airplane("종이비행기", 0.01, "제트기", 10, 4));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		System.out.println("================================================");
		
		
	}

}
