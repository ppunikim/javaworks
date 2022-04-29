package com.callor.app.exec;

public class Exec1 {

	public static void main(String[] args) {

		int intStudent = 0;
		intStudent = (int) (Math.random() * 25) + 25;// 25~50 의 랜덤값을 만들었다.
		//이것은 사람 수.
		
		System.out.printf("오늘 학원에 나온 사람 수는 %d명이다.\n", intStudent);
		
		int	intPizza = 6 ;
		
		if(intStudent % intPizza == 0) {
			System.out.printf("인원 %d 는 %d 개의 피자가 필요 ", intStudent, intStudent / 6 );
		} else {
			int pan = (intStudent / intPizza ) + 1;
			System.out.printf("인원 %d 는 %d 개의 피자가 필요 ", intStudent, pan );
		}
		
		

		
	}// end main
}
