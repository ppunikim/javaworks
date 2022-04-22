package com.callor.score.exec;

public class ArrayEx1 {
	public static void main(String[] args) {
		int[] intNums = new int[10];
		for(int i=0; i<intNums.length; i++) {
			intNums[i] = (int)(Math.random()*100)+1;
		}// intNums에 랜덤값이 담기고, 위에 배열에서 저장된다.
		
		for(int i=0; i< intNums.length; i++) {
			System.out.printf("%d\t", intNums[i]);
		}// 위에 배열에 저장된 값을 출력한다.
		System.out.println(); //줄바꿈
		
		//          -------- =>   : 뒤에는 배열이 나온다. 이것은 배열을 쫙 펼져서
		// 							int배열의 0번째 위치부터 끝번까지 
		//							num 의 배열이 값바뀌면서 계속 생성
		//							이 코드는 확장된 for, 새로운 for명령 이어서
		// 							"forEach"라고 부른다.
		for(int num : intNums) {
			System.out.printf("%d\t",num);
		} 
		/*
		 이 코드는 전체 배열에 연산을 하고자 할 때, 배열 요소 전체를 개별적으로 읽어 
		 연산 수행하고자 할 때 사용한다.
		 
		 연산 저장은 안된다.
		 * int num = intNums[0]
		 * int num = intNums[1]
		 * int num = intNums[2]
		 * int num = intNums[3]
		 * int num = intNums[4]
		 * int num = intNums[5]
		 * int num = intNums[6]
		 * int num = intNums[7]
		 */
		
	}//end main

}//end class
