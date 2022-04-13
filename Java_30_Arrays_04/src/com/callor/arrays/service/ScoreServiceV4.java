package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV4 {
	
	/*
	 * 인스턴스 변수(class 영역에 선언된 변수)
	 * 
	 */
	private int[] intKor;
	public ScoreServiceV4() {
		intKor = new int[100];
	}
	public ScoreServiceV4(int length) {
		intKor = new int[length];
	}
	public void makeScore() {
		for(int i=0; i<intKor.length; i++) {
			intKor[i] = (int)(Math.random() * 50 ) + 51;
		}

	}
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("국어 성적 열람표");
		System.out.println(Line.sLine(50));
		
		for(int i = 0; i < intKor.length; i++ ) {
			System.out.printf("%d :%d\t\t",(i+1), intKor[i]);
			
			if( (i+1)%5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine(50));
	}
	
}//end class
