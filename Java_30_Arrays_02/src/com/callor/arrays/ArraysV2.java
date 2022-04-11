package com.callor.arrays;

public class ArraysV2 {
	public static void main(String[] args) {
		
		/*
		 *  index 는 배열의 크기보다 1개 작다.
		 *  즉, 0부터 시작한다.
		 *  다음과 같은 식이 성립한다.
		 *  index < length : index와 length는 항상 0보다 큰 정수이다.
		 */
		
		int[] intNums = new int[3]; 
		intNums[0] = 10;
		intNums[1] = 20;
		intNums[2] = 30;
		
		// 배열의 개수가 3인데, 첨자(index) 3번에 값을 저장하려고 시도하면 
		// ArrayOutOfBound 문제(exception)가 발생한다.
		intNums[3] = 40;
		
		
		
	}//end main
}
