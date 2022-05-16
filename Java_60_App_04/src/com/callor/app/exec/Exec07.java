package com.callor.app.exec;

import com.callor.utils.Line;

public class Exec07 {
	public static void main(String[] args) {
		
		int num = 7;
		int length = 20;
		System.out.println(Line.dLine(length));
		System.out.println(num + "단 구구단");
		System.out.println(Line.sLine(length));
		for(int i = 0; i < 9; i ++) {
			System.out.printf("%d X %d = %d\n", num, (i+1), num*(i+1));
		}
		System.out.println(Line.dLine(length));
		
	}//end main
}//end class
