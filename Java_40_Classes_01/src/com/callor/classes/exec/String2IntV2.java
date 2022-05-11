package com.callor.classes.exec;

public class String2IntV2 {
	public static void main(String[] args) {
		//문자형으로 전달받은 숫자를 정수형으로 받기 위한 코드
		String strNum1 = "100";
		String strNum2 = "100";
		
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);
		
		int intNum1 = Integer.valueOf(strNum1); 
		int intNum2 = Integer.valueOf(strNum2);
		
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
		
		strNum1 = "30.2"; // 문자열형 실수
		strNum2 = "55.3";
		
		float fNum1 = Float.valueOf(strNum1); // 문자열형 숫자를 실수형 숫자로 바꿔주는 코드
		float fNum2 = Float.valueOf(strNum2);
		
		System.out.println(fNum1 + fNum2);
		
		strNum1 = "200";
		strNum2 = "200";
		intNum1 = Integer.parseInt(strNum1);// valueOf와 기능은 같지만 성능상 좋긴 하지만, 쓰지말기. 
											// 이유는 valueOf가 더 많은 기능을 가지고 있으므로 value 만 쓰기
											// 컴퓨터의 성능이 좋아져서 valueOf써도 된다.
		intNum1 = Integer.valueOf(strNum1); // parsInt를 쓰지 말고 valueOf를 쓰자!
		intNum2 = Integer.parseInt(strNum2);
		
		strNum1 = "40.3";
		strNum1 = "10.2";
		
		fNum1 = Float.parseFloat(strNum1);
		fNum2 = Float.parseFloat(strNum2);
		
		
		
		
	}//end main

}//end class
