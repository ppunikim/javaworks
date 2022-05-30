package com.callor.app;

public class E44 {
	public static void main(String[] args) {
		
		BookVO[] bookVO = new BookVO[10];
		int index = 0;
		bookVO[index] = new BookVO();
		bookVO[index].setTitle("java");
		bookVO[index].setComp("comp");
		System.out.println("도서명 : " + bookVO[index].getTitle());
		System.out.println("출판사 : " + bookVO[index].getComp());
		
	}//end main
}
