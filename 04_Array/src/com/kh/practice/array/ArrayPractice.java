package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public void practice1() {
		
		int[] arr = new int[10]; // 길이 10인 배열 선언(10칸 방 생성)
		
		for(int i=0; i<arr.length; i++) { 	// 값대입
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {	// 값출력
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i=arr.length-1; i>=0; i--) { 	// 거꾸로 ** i=arr.length-1; 그래야 i=9
			arr[i] = i+1;
		}
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {		
		
		//선언과 동시에 할당
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
		
        /* (모두출력)
        for(int i=0; i<arr.length; i++) {	// 사과 귤 포도 복숭아 참외
        	System.out.println(arr[i]);
        }
        */
        
	}
	
	public void practice5() {					//다시 생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.print("문자 : ");
		char ch =  sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()]; // 방만들고
		
		for(int i=0; i<arr.length; i++) {	 // 방길이만큼 i돌리고
			arr[i] = str.charAt(i);			 // 값대입
		}
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(ch == arr[i]) {				// arr[i] 돌아가는방
				System.out.print(i + " ");  // i
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 다시 입력받도록 해보기
			
			System.out.print("0~6 사이 숫자 입력 : ");
			int num = sc.nextInt();
			
			if(num>=0 && num<=6) {
				
				String[] arr = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
				
				System.out.println(arr[num]); 	// arr[num];
			
			break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}
	
	public void practice7() {			// 다시생각!!!!!!!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열 " + i + "번쨰 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();		// **각 인덱스마다 입력받은 값대입
			sum += arr[i];				// 모든 인덱스 더해버려~
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " "); // (값 할당된) 모든 인덱스 출력
		}
		System.out.println();
		System.out.print("총 합 : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		// 조건 맞을때까지 반복
		while(true) {
			// 정수 입력
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			// 정수 조건 : 3이상이면서 홀수(num%2==1)
			if(num>=3 && num%2==1) {
				
				int[] arr = new int[num];
				
				/*
				 * 5입력시 => {1,2,3,2,1}				=> 2번 인덱스까지 증가. 그 이후로 감소
				 * 7입력시 => {1,2,3,4,3,2,1}			=> 3번 인덱스까지 증가. 그 이후로 감소
				 * 9입력시 => {1,2,3,4,5,4,3,2,1}		=> 4번 인덱스까지 증가. 그 이후로 감소
				 * 									=> (배열의 길이 / 2) 인덱스까지 증가. 그 이후로 감소
				 */
				int value = 1;
				
				for(int i=0; i<arr.length; i++) {	// 값대입
					arr[i] = value;
					if(i<arr.length/2) {
						value++;
					}else {
						value--;
					}
				}
				
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				
			break;	
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
			if(num>=3 && num%2==1) {
				int[] arr = new int[num]; //입력정수만한 방 생성
				
				//오름
				for(int i=0; i<(arr.length/2)+1; i++) {			//다시!!생각!!
					arr[i] = i;
				}
				
				for(int i=0; i<(arr.length/2)+1; i++) {
					System.out.print(arr[i]+1 + " ");
				}
				
				//내림
				for(int i=(arr.length/2); i>0; i--) {			//다시!!생각!!
					arr[i] = i;
				}
				
				for(int i=(arr.length/2); i>0; i--) {
					System.out.print(arr[i] + " ");
				}
				
			break;	
			}else {
				System.out.println("다시 입력하세요.");
			}
			
		}
		*/
	
	}
	
	public void practice9() {				// 다시 생각!!
	      
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		String[] arr = {"굽네", "교촌", "노랑통닭", "푸라닭", "비비큐"};
		
	     for (int i=0; i<arr.length; i++) {
	    	  
		      if (str.equals(arr[i])) {
		         System.out.println(arr[i] + "치킨 배달 가능");
		         return; // 뒷 내용이 나오지 않도록 탈출
		      }else {
		      }
		 }
		 System.out.println(str + "치킨은 없는 메뉴입니다"); // for문 안에 있으면 남은 인덱스만큼 출력됨;;
	      
	}
	
	public void practice10() {		//다시생각
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		// 입력받은 주민번호 길이만큼 배열(방) 생성
		char[] origin = new char[str.length()];
		
		// (배열(방)길이만큼 i 돌려서) 각 인덱스마다 주민번호 한자리씩 차례로 값대입
		for(int i=0; i<origin.length; i++) {
			origin[i] = str.charAt(i);
		}
		
		// char[] copy (복사본)을 만들고, 7번 인덱스부터 * 값대입시킴     //**ArrayCopy(배열복사)
		char[] copy = new char[str.length()];
		
		for(int i=0; i<origin.length; i++) {

			if(i<=7) {
				copy[i] = origin[i];
			}else {
				copy[i] = '*';
			}
			System.out.print(copy[i]); // copy[i] 모든 값출력
			
		}
		
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1); // 각 인덱스마다 난수(랜덤수) 대입
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1); // 값대입
			System.out.print(arr[i] + " ");			// 값출력
		}
		
		System.out.println(); // 개행
		
		// 값대입 된 난수들 중 최대값과 최소값 출력
		int max = 1;
		int min = 10;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > max) {  // 배열안의 값이 max보다 큰 경우
				max = arr[i];	// 해당 값을 max에 담담
			}
			
			if(arr[i] < min) {  // 배열안의 값이 min보다 작은 경우
				min = arr[i];	// 해당 값을 min에 담담
			}
			
		}
		System.out.println("최대값 : " + max);	// for문 안에 있으면 i도는 수만큼 출력해버리니까 밖에서 출력!
		System.out.println("최소값 : " + min);
		
		// 띠용?? : 만약 최대값을 구할때, 1보다 큰 수들은 많을텐데.. 어떻게 그 중 가장 큰 수 하나를 출력한거지??
	}
	
	public void practice13() {
		
		int[] arr = new int[10];
		// 값대입(난수)
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j=0; j<i; j++) {	// *** j<i(?) // 2 2			// 어려우니까 차분히 생각!
				if(arr[i] == arr[j]) {
					// 중복값 제거?? => i와 j가 같으면 랜덤한수를 다시 만드는 코드
					i--; // *** 값이 중복되면 i를 1빼주어 다시 랜덤이 돌도록 해줌
				}
			}
		}
		
		// 값출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		/*
		int[] arr = new int[10];
		
		// 2. 값대입
		for(int i=0; i<arr.length; i++) {
			// 난수 값대입
			arr[i] = (int)(Math.random() * 10 + 1); 
			
			// 중복값 제거
			for(int j=0; j<i; j++) {	// 다시 생각 : j<i (?)
				if(arr[i] == arr[j]) {
					i--; // 값이 중복되면 i를 1빼주어 다시 랜덤이 돌도록 해줌
				}
			}
			
		}
		
		// 3. 값출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 45 + 1);
			
			// 로또번호 **중복값 제거 (for문 안에서!)
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		// 로또번호 **오름차순 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {  // 다시 생각 : j=i+1 (?)
				
				if(arr[i] > arr[j]) {			 // i가 j보다 큰 경우 값을 바꿔줘야함
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		// 값출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice15() {		// 모올러,, //**버블정렬을 사용해보자!(자주 사용)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();					//apple
		
		char[] arr = new char[str.length()];		//a p p l e (5개) 입력값대입하기 위한 방 생성
		
		int count = 0; // 문자 개수 출력
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length; i++) { // char 배열에 값대입
			arr[i] =  str.charAt(i);
			
			// 중복제거?? 출력.. apple => a p l e
			boolean flag = true;	// ** flag 어렵지만 엄청 자주 사용!! 스위치처럼 껐다 켤 수 있음!
			
			for(int j=0; j<i; j++) {
				if(arr[j] == arr[i]) {	//apple a(true) p(true) p(false!)
					flag = false;
				}
			}
			
			if(flag /*flag==true*/) {
				count++; //카운트
				if(i == 0) {
					System.out.print(arr[i]);
				}else {
					System.out.print(", " + arr[i]);
				}
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
		
	}
	
	public void practice16() {		// 모르것슈..
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine(); // 엔터제거 조심!
		
		String[] origin = new String[num]; 	// 원본
		String[] copy = null; 	// 복사본
		
		for(int i=0; i<origin.length; i++) {
			System.out.printf("%d번째 문자열 : ", i+1);
			origin[i] = sc.nextLine();
		}
		
		while(true) {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0); // Y y N n
			
			System.out.println("ch의 값 : " + ch);
			if(ch == 'Y' || ch == 'y') { // 더 입력하겠다는 경우
				System.out.print("더 입력하고 싶은 개수 : ");
				num = sc.nextInt();	// 변수 한번 더 사용 가능(입력 한번 더 받아라)
				sc.nextLine(); // 엔터제거
				
				//** Arrays.copyOf(원본배열명, 길이);
				copy = Arrays.copyOf(origin, origin.length + num);
				
				for(int i=origin.length; i<copy.length; i++) {	//** i=origin.length;
					System.out.printf("%d번째 문자열 : ", i+1);
					copy[i] = sc.nextLine();
				}
				
				origin = copy; // 주소값 변경 대입
				
			}else { // 그만하는 경우
				System.out.print("[");
				for(int i=0; i<origin.length; i++) {
					if(i == origin.length - 1) {	// 마지막 인덱스인 경우
						System.out.printf("%s", origin[i]);
					}else {
						System.out.printf("%s, ", origin[i]);
					}
				}
				System.out.println("]");
				break;
			}
			
		}		
	}
		
		
		
		
} // 메소드꺼
