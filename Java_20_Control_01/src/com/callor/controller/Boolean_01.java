package com.callor.controller;

public class Boolean_01 {
	
	public static void main(String[] args) {
		
		int intNum1= (int)(Math.random() * 1000) + 1;
		int intNum2= (int)(Math.random() * 1000) + 1;
		
		boolean bEq = intNum1 == intNum2;
		boolean bNotEq = intNum1 != intNum2;
		boolean bGT = intNum1 > intNum2; //  greater than
		boolean bLT = intNum1 < intNum2; //  less than
		
		if(bEq) {
			System.out.printf("\t %d와 %d는 같다.\n", intNum1, intNum2);
		}
		/*
		 * 이 코드로 인해 밑에 두 개의 코드가실행되지 않는다. 이것을 "논리적 오류가 있는 코드"
		 * 라고부른다. 이유는 bEq와 bnotEq로 실행문이 끝나기 때문이다.
		 * else if(bNotEq) { System.out.printf("\t %d와 %d는 다르다.\n", intNum1, intNum2); }
		 */
		else if(bGT) {
			System.out.printf("\t %d가 %d보다 크다.\n", intNum1, intNum2);
		} 	else if(bLT) {
			System.out.printf("\t %d가 %d보다 작다.\n", intNum1, intNum2);
		} 	else {
			System.out.println("모른다.");
		}
		
	
	}

}
