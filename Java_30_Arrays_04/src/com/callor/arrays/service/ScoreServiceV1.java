package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV1 {
	
	//클래스 영역에 선언된 변수
	int[] intKor; //배열은 선언만 한 상태에서 저장이 안된다.
	/*
	 * 없어도 되는, 생략된 
	 * 임의로 생성자 메서드를 선언하는 이유
	 * 1. 클래스 영역에 선언된 변수를 초기화 하여 사용할 수 있도록 
	 * 			준비하는 코드를 포함한다. 
	 */
	public ScoreServiceV1() {
		intKor = new int[100]; //intKor 배열이 사용 할(저장하고 읽기)  준비가 된다.
	}
	public void makeScore() {
		for(int i=0; i<intKor.length; i++) {
			intKor[i] = (int)(Math.random() * 50 ) + 51;
		}
	}
	public void printScore() {
		
		System.out.println(Line.dLine);
		System.out.println("국어 성적 열람표");
		System.out.println(Line.sLine);
		
		for(int i = 0; i < intKor.length; i++ ) {
			System.out.printf("%d\t",intKor[i]);
			
			if( (i+1)%5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine);
	}

}//end class
