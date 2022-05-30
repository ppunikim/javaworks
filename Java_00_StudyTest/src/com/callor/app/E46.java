package com.callor.app;

import com.callor.utils.Line;

public class E46 {
	public static void main(String[] args) {
		
		int intNum = 7;
		System.out.println(Line.dLine);
		System.out.printf("%d 단 구구단 \n", intNum);
		System.out.println(Line.sLine);
		for(int i = 0; i < 9; i ++) {
			System.out.printf("%d x %d = %d\n", intNum, i + 1, intNum * (i + 1));
		}
		System.out.println(Line.dLine);
	}//end main
}
