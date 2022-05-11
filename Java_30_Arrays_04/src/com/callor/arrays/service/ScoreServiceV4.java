package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV4 {
	
	/*
	 * 인스턴스 변수(class 영역에 선언된 변수)
	 * 인스턴스 변수:
	 * 1. 선언문만 있고 초기화 코드는 없다.
	 * 2. 클래스의 생성자 메서드에서 변수를 초기화한다.
	 */
	private int[] intKor;

	// 이것이 클래스의 생성자 메서드이다.
	public ScoreServiceV4() {
		intKor = new int[100];
	}
	/* 인스턴스 변수가 배열일 경우:
	* 1. 정수형 매개변수(여기에서는 length)가 있는 생성자를 선언해
	* 2. 생성되는 배열의 개수를 Controller에서 설정할 수 있다.	
	*/
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
