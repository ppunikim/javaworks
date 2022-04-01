package com.callor.controller.op;

public class Operator_04 {
	
	public static void main(String[] args) {
		
		int intNum1 = 100;
		int intNum2 = -intNum1; // intNum1 의 값의 부호를 음수로 하여 intNum2에 대입하라.
		
		intNum1 = 100;
		intNum2 = intNum1 * (-1);
		
		
		
		System.out.println(intNum1);
		System.out.println(intNum2);
		
		//bit연산자
		// intNum1을 이진수로 정수 2를 이진수로 변환, 각 bit를 or연산
		intNum2 = intNum1 ^ 2;
		intNum2 = intNum1 | 2;
		//각 값을 이진수로 변환 후 각 bit를 and연산
		intNum2 = intNum1 & 2;
		
		
		//제곱연산
		intNum2 = intNum1 * intNum1;//제곱
		intNum2 = intNum1 * intNum1 * intNum1;//세제곱
		
		
		
	}

}
