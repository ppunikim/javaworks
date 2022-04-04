package com.callor.controller;

public class Method_02 {
	
	public static void main(String[] args) {
		
		int intAdd = add();
		int intMulti = multi();
		
		System.out.println(intAdd);
		System.out.println(intMulti);
		
	}
	
	public static int add() {
		
		int intNum1 = 0;
		int intNum2 = 0;
		
		intNum1 = (int)(Math.random()*100) + 1 ;
		intNum2 = (int)(Math.random()*100) + 1 ;
		
		int intSum = 0;
		intSum = intNum1 + intNum2;
		
		return intSum;
		
	}

	public static int multi() {
		
		int intNum3 = 0;
		int intNum4 = 0;
		
		intNum3 = (int)(Math.random() * 100) + 1;
		intNum4 = (int)(Math.random() * 100) + 1;
		
		int intMul = 0;
		intMul = intNum3 * intNum4;
		
		return intMul;
	}
}
