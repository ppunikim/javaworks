package com.callor.app.exec;

public class Exec2 {
	
	
	public static void main(String[] args) {
		
	int[] intNum = new int[10];
	
	int intSum = 0;
	for(int i=0; i<intNum.length; i++) {
		intNum[i] = (int)(Math.random()*100)+1;
		intSum += intNum[i];
	}
	System.out.println("총 합계" + intSum);
	System.out.println();
	
	for(int i=0; i<intNum.length; i++) {
		System.out.println(intNum[i]);
	}
	
	
	
	
	

	}//end main
}
