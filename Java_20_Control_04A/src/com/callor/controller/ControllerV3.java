package com.callor.controller;

public class ControllerV3 {

	
	public static void main(String[] args) {
		
		int intNum = 1;
		
		for(;;intNum++) {
			
			System.out.printf("\n %d X %d = %d \n", 3, intNum, 3*intNum);
			
			if (intNum > 8){
				System.out.println("\n 10 넘어간 수이다.");
			break;
			}//end if
			
		}// end for
		
		
		
	}
}
