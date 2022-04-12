package com.callor.arrays.exec;
// 다시 물어볼 것

public class Study {
	public static void main(String[] args) {
		int[] intNum = new int[100];
		for(int i=0; i<intNum.length; i++) {
			intNum[i] = (int)(Math.random()*100)+1;
		}
		
		//각 배열에 저장된 수 중, 짝수가 몇개인지?
		int intEvenNum = 0;
		for(int i=0; i<intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if(bEven == true) {
				intEvenNum++;
			}
			System.out.println(intEvenNum);
		}
		System.out.println("================================");
		
		//각 배열에 저장된 짝수의 값을 모두 더한 것은 얼마?
		int intEvenSum = 0;
		for(int i=0; i<intNum.length; i++) {
			boolean bEven = (intNum[i] % 2 == 0);
			if(bEven == true) {
				intEvenSum += intNum[i];
			}
			System.out.println(intEvenSum);
		}
	}//end main
	
}//end class
