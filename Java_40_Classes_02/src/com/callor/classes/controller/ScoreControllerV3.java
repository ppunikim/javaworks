package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV3;

public class ScoreControllerV3 {
	public static void main(String[] args) {
		
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3(); //기본생성자를 만든 것
		scServiceV3 = new ScoreServiceV3(20); // arg 가 int 임의생성자를 사용하는 것
		
		//String[] strNames = new String[5];
		//String[0] = "길동";
		//String[1] = "둘리";
		//String[2] = "또치";
		//String[3] = "도우너";
		//String[4] = "마이클";
		String[] strNames = {"길동", "둘리","또치","도우너", "마이클"}; 
		// 위 내용을 한줄짜리 코드로 만드는 방법이다.
		
		scServiceV3 = new ScoreServiceV3(strNames); // arg 가 String형 기본생성자를 쓰는 방법
		
		
	}//end main

}//end class
