package com.callor.app;

public class E27 {
	public static void main(String[] args) {
		
		int[] intNums = new int[100];
		for(int i = 0; i < intNums.length; i ++) {
			intNums[i] = (int)(Math.random() * 100) + 1;
		}
		for(int index = 0; index < intNums.length; index++) {
			if(intNums[index] >= 54) {
				System.out.print(intNums[index] + "\t");
			}
		}
		
		
	}//end main
}
