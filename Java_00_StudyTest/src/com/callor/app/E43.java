package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E43 {
	public static void main(String[] args) {
		
		List<BookVO> bookList = new ArrayList<>();
		
		for(int i = 0; i < 10; i ++) {
			BookVO bookVO = new BookVO();
			bookVO.setTitle("Do it java");
			bookVO.setComp("easy");
			bookList.add(bookVO);
		}
		
		
	}//end main
}
