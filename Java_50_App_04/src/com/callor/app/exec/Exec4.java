package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class Exec4 {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0; i < 100; i ++ ) {
			num.add((int)(Math.random() * 100) + 1 );
		}// 100개의 랜덤값 이나오는 100개의 정수 생성
		
		int intSize = num.size();
		for(int i = 0; i < intSize ; i ++) {
			if( num.get(i) >= 55) {
				System.out.println(num.get(i));
			}
		}
		System.out.println("배열은 끝");
		
		
		
	}//end main
}



//집에서는 키보드로 입력한 배열의 값 출력하는 코드 작성하기.