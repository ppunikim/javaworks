package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec3 {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < 100; i ++ ) {
			num.add((int)(Math.random() * 100) + 1 );
		}// 100개의 랜덤값 이나오는 100개의 정수 생성
		
		int index = 0;
		for( Integer nums : num ) {

			System.out.printf("%d : %d\n ", index, nums);
				break;
			}
			index ++;
		}
		
		
}
//잘못적음
