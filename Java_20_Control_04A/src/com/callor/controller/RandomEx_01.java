package com.callor.controller;

import java.util.Random;

public class RandomEx_01 {
	
	static Random random = new Random();
	static int intRan = random.nextInt(100);
	
	public static void main(String[] args) {
		
		System.out.println(intRan);
		
		System.out.print("\n=====================\n");
		
		long longRnd = random.nextLong();
		System.out.println(longRnd);
		double douRnd = random.nextDouble();
		System.out.println(douRnd);
		boolean byes = random.nextBoolean();
		if(byes) {
			System.out.println("true값이다.");
		}  else {
			System.out.println("true값이다.");		
		}
	}//end main
}
