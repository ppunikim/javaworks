package com.callor.arrays.exec;

public class ExecV2 {
//아직 이해가 안된다. 주의깊게 다시 공부하기!
	
	public static void main(String[] args) {
		
		// new 는 배열선언
		int[] intNum = new int[100]; // intNum라는 100층 아파트 기획
		
		/*
		 * for()명령문의 선언부에서 변수를 선언
		 * for() {} 이 끝날때 변수가 소멸된다.
		 * 그러므로 같은 method내에서 같은 이름의 변수를 계속 사용할 수 있다.
		 * 
		 */
		for (int i = 1; i < intNum.length; i++) {
			intNum[i] = (int) (Math.random() * 100) + 1; //inNum[i]라는 데이터 저장공간에 랜덤값 담기
		}//임의의 수를 담은 배열 만듦.
		
		// {}가 끝나면 다른 코드가 되므로 i를 위 아래 써줘도 다른 i값이다.
		for(int i= 0; i<intNum.length; i++) {
			boolean bEven = (intNum[i] %2) == 0;
		
			if (bEven) {
				System.out.printf("%d 은/는 짝수.\n", intNum[i]);
			} else {
				System.out.printf("%d 은/는 짝수가 아니다.\n", intNum[i]);
			} // 임의의 값이 짝수인지 아닌지 판별
		

		}//end for

	}// end main
}// end class
