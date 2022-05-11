package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 입력 > ");
		String strNum = scanner.nextLine();
		int intNum = 0;
		if(strNum.equals("")) { // 이것은 exception handling이라고 한다.
			System.out.println("숫자만 입력해 주세요~~");
		} else if(strNum.equals(" ")){
			System.out.println("숫자만 입력해 주세요~~");
		} else {
			intNum = Integer.valueOf(strNum);
		}
		System.out.print("문자열 입력 > ");
		String strValue = scanner.nextLine();
		
		System.out.println();
		System.out.println("입력된 정수 : " + intNum);
		System.out.println("입력된 문자열 : " + strValue);
		
	}//end main

}//end class
