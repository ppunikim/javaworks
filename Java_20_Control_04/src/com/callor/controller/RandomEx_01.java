package com.callor.controller;

import java.util.Random;

public class RandomEx_01 {
	public static void main(String[] args) {
		int intRen1 = (int)(Math.random()* 100) +1 ;
		
		Random rnd = new Random(); // 두 번째 랜덤변수 만드는 방법
		
		int intRnd2 = rnd.nextInt(100);
		System.out.println(intRnd2);
		
		
		
		long longRnd = rnd.nextLong();
		double douRnd = rnd.nextDouble();
		System.out.println(douRnd);
		
		boolean byes = rnd.nextBoolean();
		if(byes) {
			System.out.println("true값 만듦");
		}  else {
			System.out.println("false값 만듦");
		}
 		
		
		
		
		
		
	}

}
