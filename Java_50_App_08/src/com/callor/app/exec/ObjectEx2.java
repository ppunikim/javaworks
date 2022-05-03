package com.callor.app.exec;

import com.callor.app.model.ScoreVO;

public class ObjectEx2 {
	public static void main(String[] args) {
		// ScoreVO 를 5개의 배열 객체로 선언
		ScoreVO[] scVOs = new ScoreVO[5];
		
		/* 배열 객체를 makeScore() 에 매개변수로 전달
		 * 
		 * 참조형 변수
		 	매개변수로 scVOs 를 makeScore() 에 전달하고
		 	
		*/
		makeScore(scVOs);  // 초기화 후, 학번만 세팅하기
		printScore(scVOs);
	}//end main
	
	private static void makeScore(ScoreVO[] scVOs) {
		
		for(int i = 0; i < scVOs.length; i ++ ) {
			scVOs[i] = new ScoreVO(); //초기화하기
			scVOs[i].setStNum( i + 1 ); // 학번을 1번부터 순서대로 저장하겠다.
			scVOs[i].setIntKor(getScore(50,51));
			scVOs[i].setIntEng(getScore(50,51));
			scVOs[i].setIntMath(getScore(50,51));
		}
	}// end makeScore
	
	private static int getScore(int start, int end) {
		int num = (int)(Math.random() * start) + end;
		return num;
	}//end getScore
	
	private static void printScore(ScoreVO[] scVOs) {
		System.out.println("=".repeat(50));
		System.out.println("학번 \t 국어 \t 영어 \t 수학 ");
		System.out.println("-".repeat(50));
		for(ScoreVO scVO : scVOs) {
			System.out.print(scVO.getStNum() + "\t");
			System.out.print(scVO.getIntKor() + "\t");
			System.out.print(scVO.getIntEng() + "\t");
			System.out.print(scVO.getIntMath() + "\n");
		}
		System.out.println("=".repeat(50));
		
	}//end printScore
}
