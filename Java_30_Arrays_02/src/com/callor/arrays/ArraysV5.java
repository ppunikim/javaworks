package com.callor.arrays;

public class ArraysV5 {
	
	public static void main(String[] args) {
		
		int[] intScore = new int[100];
		int index = 0;
		
		for(int i=0; i<intScore.length ; i++) {
			
			for(index=0; index<5; index++) {
				int intNum = (int)(Math.random()*100)+1;
				System.out.print(intNum + "," + "\t");
			}
			
			System.out.println("\t");
		}

	}//end main
}
