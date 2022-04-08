package com.callor.controller;

public class Method_02 {
	
	static int intNum1 = (int)(Math.random()* 100) + 1;
	static int intNum2 = (int)(Math.random()* 100) + 1;
	
	public static void main(String[] args) {
		
		
		System.out.println(add());	
		System.out.println(multi());
		
		
	}//end main
	
	public static int add() {
		
		return intNum1 + intNum2;
	}//end add
	
	public static int multi() {
		
		return intNum1 * intNum2;
	}//end multi

}
