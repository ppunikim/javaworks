package com.callor.app.exec;

public class Exec7 {
	
	
	public static void main(String[] args) {
		
	int[] intApt = new int[100];
	int intCount = 1;
	
	for(int index = 0; index < intApt.length; index++ ) {
		intApt[index] = (int)(Math.random()*100) + 1;
		int num = intApt[index];
		
		for(int i = 2; i < num ; i++) {
			if(num % i != 0) {
				intCount++;
			}//end if
		}//end for

	}//end  first for
	System.out.println("전체 소수 갯수: " + intCount);
	
	}//end main
	
		
		
		
}//end class
