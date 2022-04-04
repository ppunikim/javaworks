package com.callor.controller;

public class Method_01 {
	
	public static void main(String[] args) {
		
		int intSum = 0;
		intSum = intNum();
		//intNum()를 호출하여 return된 값을 intSum에 저장하기.
		
		System.out.println(intSum);
		
		
	} 
	
	// int intNum() {} : 어떤 정수값을 return 하겠다.
	public static int intNum() {
			
		int intNum1= 0;
		int intNum2= 0;
		
		intNum1 = (int)(Math.random() * 100) + 1 ;
		intNum2 = 20;
		
		int intNum = intNum1 + intNum2;
		
		return intNum;
	}

}
