package com.callor.app.exec;

public class Exec02 {
	public static void main(String[] args) {
		
		int[] intNum = new int[10];
		for(int i = 0; i < intNum.length; i ++) {
			intNum[i] = (int)(Math.random() * 100 ) + 1;
		}//end for
		
		int intNums = 0;  							// 다음에는 갯수 카운터는 count로 하자!
		int intSum = 0;
		for(int i = 0; i < intNum.length; i ++ ) {
			if(intNum[i] % 2 == 0) {
				System.out.print(intNum[i] + "\t"); // 배열에 저장된 짝수값 출력
				intNums ++ ; 						// 배열에 있는 짝수 갯수 구하기
				intSum += intNum[i];				// 배열에 저장된 짝수값 합 구하기
			}//end if
		}//end for
		System.out.println();
		System.out.println("배열에 저장된 짝수의 갯수는 " + intNums + "개 이다.");
		System.out.println("배열에 저장된 짝수의 합 : " + intSum);
		
		//확장for문으로 구하기
		for(int num : intNum) {
			if(num % 2 == 0) {
				intNums++;
				intSum += num;
			}
		}//확장for문으로 이렇게 간단하게 적을 수 있다. 다음에는 꼭 이용하자!
		
		
		
	}//end main
}//end class
