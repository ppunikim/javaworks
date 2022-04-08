package com.callor.service;

public class ServiceV1 {
	
	public void guguDan() {
		
		int intNum = 1;
		
		System.out.print("구구단 3단을 출력해보자\n");
		System.out.print("===============================");
		for( ; intNum < 10 ; intNum++) {
			
			System.out.printf(" \n \t %d X %d = %d ", 3, intNum, 3*intNum );
		}//end guguDan()
	}

}
