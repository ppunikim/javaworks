package com.callor.controller.op;

public class Operator_03 {
	
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 100) + 1;
		
		System.out.println(intNum1);
		
		/*
		 * SCE코드
		 * 만약 random으로 생성된 값이 60이상이면 "합격"을 출력하고
		 * 						  60이상이 아니면 intNum1에 60을 setting한 다음 "합격"을 출력한 후 다음 진행
		 */
		if (intNum1 > 60 || (intNum1 = 60) >= 60) {
			System.out.println("합격~~");
			
			
			
			
			
		}
		
		
		
	}

}
