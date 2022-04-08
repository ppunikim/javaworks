package com.callor.service;

public class ServiceV1 {
	
	public static int add() {
		
		int intNum1 = (int)(Math.random() *100 ) + 1;
		int intNum2 = (int)(Math.random() *100 ) + 1;
		
		return intNum1 + intNum2;
		
	}//end add
	
	public static int multi() {
		int intNum1 = (int)(Math.random()* 100)+1;
		int intNum2 = (int)(Math.random()* 100)+1;
		
		return intNum1 * intNum2;
	
	}

}
