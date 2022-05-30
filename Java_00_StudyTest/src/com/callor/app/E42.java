package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E42 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		
		for(int i = 0; i < 10; i ++) {
			int intRan = (int)(Math.random() * 100 ) + 1;
			intList.add(intRan);
		}// 랜덤값 만들기
		
		int count = 0;
		int intSum = 0;
		for(int i = 0; i < intList.size(); i ++) {
			if(intList.get(i) % 2 == 0) {
				count++;
				intSum += intList.get(i);
			}
		}
		System.out.println("짝수의 개수는 : " + count);
		System.out.println("짝수의 합은 : " + intSum);
		
	}//end main
}//end class
