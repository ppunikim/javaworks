package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec2 {
	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		for(int i = 0; i < 100 ; i++ ) {
			nums.add((int)(Math.random() * 100) + 1);
		}// nums 배열에 랜덤값 넣기
		
		
		int index = 0;
		for( Integer num : nums ) {
			if( num >= 55 ) {
				System.out.printf("%3d번째 수 : %3d \n ", index, num);
			}
			index ++ ;
		}
		
		int size = nums.size();
		for( int i = 0; i < size ; i ++ ) {
			if( nums.get(i) >= 55 ) {
				System.out.printf("%d  : %d ", i, nums.get(i));
			}
		}
		
		
		
		
		
	}//end main
}
