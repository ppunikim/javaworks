package com.callor.arrays.utils;

public class Line {
	
	/* 클래스 영역에 dLine, sLine문자열형 변수를 선언
	 * static : 프로젝트 코드가 실행되는 순간 항상 
	 * 			자동으로 사용할 준비가 되도록 선언하는 키워드
	 * final : 변수에 final 키워드가 부착되면, 한번 저장된 값을 
	 * 			절대 변경할 수 없다.(can not assign)
	 * 			이것은 javascript에서 const 와 같은 역할이다.
	 * 프로젝트에서 공통으로 공유하여 사용할 변수는 
	 * 				public static final 키워드를 함께 사용한다.
	 */
	public static final String dLine = "=".repeat(100); //dLine 은 변수
	public static final String sLine = "-".repeat(100); //sLine 은 변수
	//이것들이 출력될 때는 "System.out.println(Line.dLine)" 으로 하면 된다.
	
	public static String dLine(int count) { //dLine은 method
		String dLine = "=";
		return dLine.repeat(count);
	}// return type이 문자열형(String형, String type)인 
	//   		dLine method로 선언했다.
	// 이것들이 출력될 때는" System.out.println(Line.dLine(50));" 이렇게 된다.
	
	/*
	 * int type(정수 형) argument가 1개 있고
	 * return type이 String type(문자열 형)인 sLine method선언
	 */
	public static String sLine(int count) {
		String sLine = "-";
		return sLine.repeat(count);
	}
}
