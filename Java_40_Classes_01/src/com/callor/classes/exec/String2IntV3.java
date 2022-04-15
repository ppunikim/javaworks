package com.callor.classes.exec;

public class String2IntV3 {
	public static void main(String[] args) {
		
		// 1. 숫자와 함께 숫자가 아닌 문자열(스페이스바)이 포함된 경우
		String strNum = "33 "; 
		int intNum = Integer.valueOf(strNum);

		// 2. (내용이)없는 문자열
		strNum = ""; 
		intNum = Integer.valueOf(strNum);

		// 3. 숫자 앞 뒤에 문자열이 포함된 경우
		strNum = "A3A"; 
		intNum = Integer.valueOf(strNum);
		
		// 4. 숫자 중간에 문자열이 포함된 경우
		strNum = "3 3";
		
		// 5. 숫자 중간에 연산기호가 포함된 경우
		strNum = "3+3";
	}

}
