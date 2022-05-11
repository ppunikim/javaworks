package com.callor.classes.exec;

public class String2IntV1 {
	public static void main(String[] args) {
		
		String strNum = "33";  // 문자열형 숫자
		int intNum = Integer.valueOf(strNum); // 정수형 숫자로 형변환
		
		strNum = "33.2";
		float fNum = Float.valueOf(strNum); // 실수형 숫자로 형변환
		
		float fSum = intNum + fNum;
		System.out.println(fSum);
		
		
	}
	
}
