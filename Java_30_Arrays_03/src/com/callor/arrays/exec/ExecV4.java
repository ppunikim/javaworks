package com.callor.arrays.exec;

public class ExecV4 {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // end for , 랜덤값을 intNum[]에 저장해 위 intNum에 저장된다.
		  // 그리고 이 for문은 효과가 사라짐

		int intEvenSum = 0; //짝수인 수를 덧셈할 변수 선언
		//이곳의 i는 위for문의 i와 다르다.
		for (int i = 1; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0; //비교하기 위해 boolean을 사용

			if (bEven == true) {
				intEvenSum += intNum[i];// 합산	
			}//end if 
			
		}//end for ,짝수인 수를 찾기 위한 것
		System.out.println(intEvenSum);
	}// end main

}// end class
