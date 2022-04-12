package com.callor.arrays.exec;

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
				intAllNum++;
				if (intAllNum % 5 == 0) {
					System.out.println();
				}
			}//end if

		} // end 두 번째 for
		System.out.println("\n===========================");
	}// end main

}// end class
