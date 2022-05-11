package com.callor.classes.exec;

public class String2IntV4 {
	public static void main(String[] args) {
		
		String strNum = "-3";
		strNum = "+3";
		
		// strNum = "*3"; 
		//연산기호중 +(-) 3은 정수범위이기 때문에 되지만,
		// +(-) 이외는 NumberFormatException 발생
		
		int intNum = Integer.valueOf(strNum);
		
		
	}//end main

}//end class
