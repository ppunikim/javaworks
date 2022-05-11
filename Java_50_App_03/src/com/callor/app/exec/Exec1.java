package com.callor.app.exec;

public class Exec1 {
	
	public static void main(String[] args) {
		
		int[] intGet = new int[10];
		
		for(int i = 0; i < intGet.length; i++) {
			int intRan = (int)(Math.random()*100)+1; ;
			intGet[i] = intRan;
		}//end for
		
		for(int i = 0; i < intGet.length; i++) {
			System.out.println(intGet[i]);
		}
		
		
	}//end main

}
