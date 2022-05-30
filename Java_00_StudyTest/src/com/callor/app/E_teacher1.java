package com.callor.app;

public class E_teacher1 {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int intNum = (int) (Math.random() * 100) + 1;
			if (intNum % 2 == 0) {
				System.out.printf("%d 의 값은 짝수이다. ", intNum);
				System.out.println();
			} else {
				System.out.printf("%d 의 값은 짝수가 아니다. ", intNum);
				System.out.println();
			}

		}//end for

	}// end main
}
