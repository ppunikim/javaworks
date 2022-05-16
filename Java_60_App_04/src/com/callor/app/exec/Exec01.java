package com.callor.app.exec;

public class Exec01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		Exec01_Call call = new Exec01_Call();
		int Sum = call.add(num1 , num2);
		System.out.println("두 수의 합계 : " + Sum);
		
		
	}//end main

}
