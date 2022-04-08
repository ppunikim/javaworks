package com.callor.controller;

public class Method_01 {
	public static void main(String[] args) {
		
		int intSum = 0;
		intSum = intNum();
		
		System.out.println(intSum);
		
	}//end main
	
	
	public static int intNum() {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = (int)(Math.random()* 100)+ 1;
		intNum2 = 20;
		
		int intSumAll = intNum1 + intNum2;
		
		return intSumAll;
		
	}// end intNum
	
}
