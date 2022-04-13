package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV2 {
	
	//클래스 영역에 선언된 변수
	/*
	 * ScoreServiceV1클래스에 선언된 모든 method에서
	 * 변수에 접근(읽고,쓰기)할 수 있다.
	 */
	int[] intKor; //배열은 선언만 한 상태에서 저장이 안된다.
	/*
	 * 없어도 되는, 생략된 
	 * 임의로 생성자 메서드를 선언하는 이유
	 * 1. 클래스 영역에 선언된 변수를 초기화 하여 사용할 수 있도록 
	 * 			준비하는 코드를 포함한다. 
	 */
	public ScoreServiceV2() {
		intKor = new int[100]; //intKor 배열이 사용 할(저장하고 읽기)  준비가 된다.
	}
	public void makeScore() {
		for(int i=0; i<intKor.length; i++) {
			intKor[i] = (int)(Math.random() * 50 ) + 51;
		}
	}
	public void printScore() {
		/*
		 * line 클래스에 static으로 선언된 dLine()에게
		 * 정수값을 전달하고, 정수개수만큼 라인문자열을
		 * return받는다.
		 */
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
