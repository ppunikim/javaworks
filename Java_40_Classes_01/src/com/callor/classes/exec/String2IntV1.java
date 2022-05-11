package com.callor.classes.exec;

import com.callor.classes.utils.Line;

public class String2IntV1 {
	public static void main(String[] args) {
		
		// 숫자를 문자열로 형변환
		String strAge = "";
		int intAge = 33; // 정수형 숫자
		
		strAge = intAge + ""; //숫자형 변수 + "문자열"
		
		// Integer 클래스에 선언된 toString static에게 정수값 argument 로 전달하여 
		// 문자열로 return받는다. 그 값을 strAge에 담았다.
		strAge = Integer.toString(intAge); // 정수형숫자를 문자열형 숫자로 바꾼다.
		
		System.out.println(strAge);
		
		//문자열로 담긴 숫자를 숫자로 형변환
		strAge = "55"; // 문자열 형 숫자
		intAge = Integer.valueOf(intAge); //문자열형 숫자를 정수형숫자로 바꾼다.
		
		System.out.println(Integer.toBinaryString(33));
		
		
		int num1 = 33;
		int num2 = 55;
		String strBinNum1 = Integer.toBinaryString(num1);
		String strBinNum2 = Integer.toBinaryString(num2);
		
//		int intBinNum1 = Integer.valueOf(strBinNum1);
//		int intBinNum2 = Integer.valueOf(strBinNum2);

		int intSum = num1 + num2;
		
		String strSum = Integer.toBinaryString(intSum);
		System.out.println(Line.dLine(20));
		System.out.printf("   %s\n",strBinNum1);
		System.out.printf(" + %s\n", strBinNum2);
		System.out.println("-".repeat(20));
		System.out.printf("  %s\n",strSum);
		System.out.println(Line.dLine(20));
	}

}
