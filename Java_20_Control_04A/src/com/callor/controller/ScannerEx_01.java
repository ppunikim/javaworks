package com.callor.controller;

import java.util.Scanner;

public class ScannerEx_01 {
	
	
	public static void main(String[] args) {
		
	Scanner scanner;
	scanner = new Scanner(System.in);
	
	System.out.println("console에 출력");
	System.out.print("Console을 클릭하고 문자열을 입력하시오\n");

	 
	
	String inputStr = new String();
	inputStr = scanner.nextLine();
	System.out.println("inputStr값 입력: " + inputStr);

	}//end main
}
