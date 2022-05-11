package com.callor.alone.array;

import com.callor.alone.model.StudentVO;

public class Array1 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[4];
		for(int i = 0; i < intNums.length; i ++) {
			intNums[i] = (int)(Math.random() * 100 ) + 1;
		}// intNums 배열에 랜덤값 입주시키기
		
		for(int i = 0; i < intNums.length; i++ ) {
			System.out.printf("%d\t", intNums[i]);
		}
		System.out.println();
		System.out.println("확장 for 문");
		for(int num : intNums ) {
			System.out.printf("%d\t",num);
		}// 확장for문
		
		
		int length = 10;
		String[] stNums = new String[length];
		String[] stNames = new String[length];
		int[] intGrade = new int[length];
		
		StudentVO[] stVO = new StudentVO[10];
		for(int i = 0; i < stVO.length; i ++ ) {
			stVO[i] = new StudentVO();
		}
		/*
		 * 앞에 선언, 생성되고 데이터가 추가된 배열을 
		 * 다시 생성하게 된다면 원래 저장된 값은 소멸된다.
		 */
		stVO = new StudentVO[10];
		
		
		
	}//end main
}//end class
