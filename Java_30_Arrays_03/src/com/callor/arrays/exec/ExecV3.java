package com.callor.arrays.exec;

public class ExecV3 {
	public static void main(String[] args) {

		int[] intNum = new int[100];
		for (int i = 0; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1;
		} // end for 인데, intNum[] = 랜덤값 을 넣어준 배열

		int intEvenCount = 0; // 짝수 갯수 세어 저장할 변수
		for (int i2 = 1; i2 < intNum.length; i2++) {
			boolean bEven = (intNum[i2] % 2 == 0);

			if (bEven == true) {
				intEvenCount++;
				//아직 변수를 계속 저장만 해 담고있는 상태
			}

		} // end for 인데, 짝수인지 아닌지 판별

		System.out.println(intEvenCount);
		//이 때 저장된 값의 갯수를 알려준다.

	}// end main
}// end class
