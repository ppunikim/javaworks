package com.callor.app;

import java.util.ArrayList;
import java.util.List;

public class E28 {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 100; i ++) {
			int intRan = (int)(Math.random() * 100 ) + 1;
			intList.add(intRan);
		}// 리스트에 랜덤값 담기
		
		for(int lists : intList) {
			if(lists >= 54) {
				System.out.print(lists + "\t");
			}
		}
		
		
	}//end main
}
