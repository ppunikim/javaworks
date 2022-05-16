package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.utils.Line;

public class Exec1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			int intRnd = (int) (Math.random() * 100) + 1;
			if (intRnd % 2 == 0) {
				System.out.printf("%d 는 짝수입니다.", intRnd);
				System.out.println();
			} else {
				System.out.printf("%d 는 짝수가 아닙니다.", intRnd);
				System.out.println();
			}

		}//end for반복문
		
		System.out.println(Line.dLine(50));
		
		int[] intNum = new int[10];
		for(int i = 0 ; i < intNum.length; i ++) {
			intNum[i] = (int)(Math.random() * 100) + 1;
		}//배열에 랜덤값 담기
		for(int i = 0; i < intNum.length; i ++ ) {
			if(intNum[i] % 2 == 0) {
				System.out.println(intNum[i] + "는 짝수이다.");
			} else {
				System.out.println(intNum[i] + "는 짝수가 아니다.");
			}
		}//end 일반 for문 배열
		for(int num : intNum ) {
			System.out.println("확장for문 : " + num);
		}
		
		System.out.println(Line.dLine(50));
		
		List<Integer> Nums = new ArrayList<>();
		int size = Nums.size();
		for(int i = 0; i < size ; i ++) {
			Integer num = Nums.get(i);
			System.out.println(num);
		}
		
		
		
	}//end main

}

















