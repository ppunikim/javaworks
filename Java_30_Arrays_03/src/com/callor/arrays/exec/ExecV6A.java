package com.callor.arrays.exec;

/*
 *	정수형 배열 100개를 선언하고 
 *	Math.random()를 사용하여 1~100까지 임의 수를 생성하고
 *	각 요소에 저장
 *	배열의 각 요소에 저장된 수 중에
 *	짝수의 리스트를 한 라인에 5개씩 끊어서 출력하시오. 
 */
public class ExecV6A {
	public static void main(String[] args) {

		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // end 첫 번째 for
		
		int intAllNum = 0;
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if (bEven == true) {

				System.out.print(intNum[i] + ",\t"); 
				//짝수의 값들만 나열
			
				intAllNum++;
				//짝수의 갯수를 세는것
				
				if (intAllNum % 5 == 0) {
				// 짝수의 갯수에서 5개씩만 센다.
					
					System.out.println();
					// 짝수의 값들을 5개씩 출력한다.
				}
			}//end if

		} // end 두 번째 for
	}// end main

}// end class
