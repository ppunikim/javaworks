package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

/*
 * makeScore()
 * printScore()
 * sumScore()
 * 등의 method를 선언하고
 * 
 * 임의 성적을 생성하여 intKor에 저장
 * 배열에 저장된 성적 일람표 출력
 * 배열에 저장된 총점 계산
 */
public class ScoreServiceV5 {
	
	private int[] intKor;
	public ScoreServiceV5() {
		intKor = new int[100];
	}
	public ScoreServiceV5(int intNum) {
		intKor = new int[intNum];
	}
	
	public void makeScore() {
		for(int i=0; i<intKor.length; i++) {
			intKor[i] = (int)(Math.random()* 100 ) + 1;
		}
	}//end makeScore
	
	public void PrintScore() {
		System.out.println(Line.dLine);
		for(int i=0; i<intKor.length; i++) {
			System.out.printf("%d:%d\t\t " ,(i+1),intKor[i]);
			if( (i+1) % 5 == 0 ) {
				System.out.println();
			}
		}
	}//end PrintScore
	
	public void intSumScore() {
		System.out.println(Line.sLine);
		int intSum = 0;
		for(int i = 0; i< intKor.length; i++) {
			intSum += intKor[i];
		}
		System.out.printf("총점은: %d " , intSum);
	}
	
	

}//end class
