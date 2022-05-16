package com.callor.app.exec;

import com.callor.app.model.BookVO;

public class Exec05 {
	public static void main(String[] args) {
		
		BookVO[] bookVO = new BookVO[10];
		int index = 2;
		// 배열의 갯수는 만들어 졌지만(뼈대) 그것을 사용할 준비(인테리어)가 되지 않았다.
		bookVO[index] = new BookVO(); 			// index번째의 값을 초기화 한 후에 넣어줘야 한다.
		bookVO[index].setTitle("java 의 정석");
		bookVO[index].setComp("햇살 출판사");
		System.out.println("도서 명 : " + bookVO[index].getTitle());
		System.out.println("출판사 : " + bookVO[index].getComp());
		
		
		
		
	}//end main
}//end class
