package com.callor.alone.array;

import com.callor.alone.model.StudentVO;

public class Array3 {
	
	// primitive(기본) type keyword
	int num1 = 100;
	float num2 = 100.22f;
	boolean bYes = true;
	
	// class type keyword
	// 참조형 변수: 주소값을 저장하는 것
	Integer intNum1 = 100;
	Float intnNum2 = 100.2f;
	Boolean bYes1 = false;
	
	String str = "korea";
	StudentVO stVO = new StudentVO();
	
	StudentVO[] stList = new StudentVO[10];
	
	public static void main(String[] args) {
		
	int intNum = 100;			// intNum에 100 값 저장 
	Integer intNums = intNum;	// intNums에 intNum의 주소값 저장
	
	intNum = intNums;
	
	}//end main
}//end class
