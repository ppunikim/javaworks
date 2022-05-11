package com.callor.arrays.exec;

/*
 *	정수형 배열 100개를 선언하고 
 *	Math.random()를 사용하여 1~100까지 임의 수를 생성하고
 *	각 요소에 저장
 *	배열의 각 요소에 저장된 수 중에
 *	짝수의 리스트를 한 라인에 5개씩 끊어서 출력하시오. 
 */
public class ExecV6 {
	public static void main(String[] args) {

		System.out.println("짝수 리스트");
		System.out.println("--------------------------");
		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // end 첫 번째 for
		int intAllNum = 0;
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if (bEven == true) {

				System.out.print(intNum[i] + ",\t"); 
				//print 와 println의 차이점 : 한줄 아래로 쓰기.
				
				// 짝수를 출력한 후 출력한 횟수를 1 증가시키기
				intAllNum++;
				
				// 짝수를 출력한 횟수가 5가 되면 줄바꿈(println();)을 한다.
				if (intAllNum % 5 == 0) {
					System.out.println();
				}
			}//end if

		} // end 두 번째 for
		System.out.println("\n===========================");
	}// end main

}// end class
