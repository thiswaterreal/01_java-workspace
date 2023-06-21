package com.kh.library.controller;

import java.util.ArrayList;


import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현 (메소드 모음집)
public class BookController implements BookManager {

	ArrayList<Book> bList = new ArrayList<>();	//**
	
	@Override
	public void addBook(Book nBook) { // 추가하기
		bList.add(nBook);
	}

	@Override
	public ArrayList<Book> getAllBook() { // 1-1. 도서관 전체 소장책 조회하기
		return bList;
	}

	@Override
	public Book searchBookBybNo(String bNo) {// 3-1. bNo으로 책 찾기
		
		Book b = null;
	
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i).getbNo().equals(bNo)) {
				b= bList.get(i);		
			}
		}
		return b;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) { // 3-2. 책 제목으로 책 찾기
		
		ArrayList<Book> searchTitle = new ArrayList<>();
		
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i).getTitle().contains(title)) {
				searchTitle.add(bList.get(i));
			}
		}
		return searchTitle;
	}

	@Override
	   public ArrayList<Book> onlySearchBook() { // 1-2. 일반도서만 조회하기(잡지 제외)

	      ArrayList<Book> tempB = new ArrayList<>();
	      
	      for (Book b : bList) {
	         if (b instanceof Magazine)
	            continue;
	         else
	            tempB.add(b);
	      }
	      return tempB;
	   }

	   @Override
	   public ArrayList<Book> onlySearchMagazine() { // 1-3. 잡지만 조회하기(일반도서 제외)
	      
		  ArrayList<Book> tempM = new ArrayList<>();
	      
		  for (Book b : bList) {
	         if (b instanceof Magazine) {
	        	 tempM.add(b);	        	 
	         }
	      }
	      return tempM;
	   }

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		
		ArrayList<Book> searchYear = new ArrayList<>();
		
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i) instanceof Magazine) {
				if(((Magazine)bList.get(i)).getYear() == year) {
					searchYear.add(bList.get(i));
				}
			}
		}
		/* 향상for문
		for(Book b : bList) {
			if(b instanceof Magazine) {
				if(((Magazine)b).getYear() == year){
					searchYear.add(b);
				}
			}
		}
		*/
		return searchYear;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		
		ArrayList<Book> searchPublisher = new ArrayList<>();
		
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i).getPublisher().contains(publisher)) {
				searchPublisher.add(bList.get(i));
			}
		}
		return searchPublisher;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		
		ArrayList<Book> searchPrice = new ArrayList<>();
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i).getPrice() < price) {
				searchPrice.add(bList.get(i));
			}
		}
		return searchPrice;
	}

	@Override
	public int getTotalPrice() {
		int total = 0;
		for(int i=0; i<bList.size(); i++) {
			total += bList.get(i).getPrice();
		}
		return total;
	}

	@Override
	public int getAvgPrice() {
		return getTotalPrice() / bList.size();
	}
	

}
