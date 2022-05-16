package com.callor.app.exec;

public class Exec3 {
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		for(int i = 0; i < intNum.length; i ++ ) {
			intNum[i] = (int)(Math.random() * 100 ) + 1;
		}//랜덤값 담기
		for(int i = 0; i < intNum.length; i ++) {
			System.out.println(intNum[i]);
		}//배열 리스트 보여주기
		int intSum = 0; 
		for(int i = 0; i < intNum.length; i ++) {
			intSum += intNum[i];
		}//배열에 저장된 정수의 총합 구하기
		System.out.println("배열의 총점은 : " + intSum);
		
		float intAvg = 0f;
		int intAll = intNum.length;
		intAvg = (float)intSum / intAll;
		System.out.println("배열의 평균값은 : " + intAvg);
		
		
		
		
	}//end main

}
