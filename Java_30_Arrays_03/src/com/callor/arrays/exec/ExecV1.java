package com.callor.arrays.exec;

public class ExecV1 {

	public static void main(String[] args) {

		int intNum = (int) (Math.random() * 100) + 1;
		boolean bEven = false; // 초기화 상태
		bEven= (intNum % 2)== 0;
		
		if(bEven) {
			System.out.println(intNum + " ~ 는(은) 짝수");
		} else {
			System.out.println(intNum + " ~ 는(은) 짝수가 아님");
		}
		
		
		
		/*
		 * if (intNum % 2 == 0) { System.out.println(" 짝수이다."); } else { //홀수이다. 라고 표현하는
		 * 것보다 if가 아니다. 라고 표현하는 것이 맞다. System.out.println(" 짝수가 아니다."); }
		 */
	}// end main
}// end class
