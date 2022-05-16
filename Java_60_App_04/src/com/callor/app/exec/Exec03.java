package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec03 {
	public static void main(String[] args) {
		
		List<BookVO> bookList = new ArrayList<>();	// bookVO가 여러 개 모인 bookList
		for(int i = 0; i < 10; i ++) {
			//이렇게 만들어 줘야 한다. 이유는 for문 밖에서 만들면 마지막에 생성된 값이 모두 bookVO에 저장되기 때문이다.
			BookVO bookVO = new BookVO();				// 한 가지 특징의 bookVO
							// 리스트가 시작되기 전에 초기화해줘야 한다.
			bookVO.setTitle("do it 자바");
			bookVO.setComp("이지즈퍼블리시");
			bookList.add(bookVO);
		}
		System.out.println(bookList);
		
	}//end main
}//end class
 