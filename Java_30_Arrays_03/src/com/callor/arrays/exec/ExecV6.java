package com.callor.arrays.exec;

public class ExecV6 {
	public static void main(String[] args) {

		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // end for, intNum의 배열에 값을 넣어줌

		int intEvenCount = 0;
		for (int i = 0; i < intNum.length; i++) {
			boolean bEven = (intNum[i] % 2) == 0;
			if (bEven == true) {
				System.out.print(intNum[i]+ ", \t");
				intEvenCount++;
				if(intEvenCount%5 == 0) {
					System.out.println();
				}
			} // end if1
		} // end for1
		
			
		
		
		
	}// end main

}// end class
