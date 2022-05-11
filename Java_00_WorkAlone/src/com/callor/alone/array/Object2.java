package com.callor.alone.array;

import com.callor.alone.model.ScoreVO;
import com.callor.utils.Line;

public class Object2 {

	public static void main(String[] args) {

		ScoreVO[] scVOs = new ScoreVO[5];
		
		makeScore(scVOs);
		printScore(scVOs);

	}// end main

	public static int ranScore(int start, int end) {
		return (int) (Math.random() * start) + end;
	}

	public static void makeScore(ScoreVO[] scVOs) {

		for (int i = 0; i < scVOs.length; i++) {
			scVOs[i] = new ScoreVO(); // 반드시 초기화하는 코드 작성하기

			scVOs[i].setStNum(i + 1);
			scVOs[i].setIntKor(ranScore(50, 51));
			scVOs[i].setIntEng(ranScore(50, 51));
			scVOs[i].setIntMath(ranScore(50, 51));
		}
	}// end makeScore

	public static void printScore(ScoreVO[] scVOs) {
		

		System.out.println(Line.dLine);
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println(Line.sLine);
		for(ScoreVO scVO : scVOs) {
			System.out.print(scVO.getStNum() + " \t" );
			System.out.print(scVO.getIntKor() + " \t");
			System.out.print(scVO.getIntEng() + " \t");
			System.out.print(scVO.getIntMath() + " \t");
			System.out.println();
		}//end for
		
		System.out.println("=".repeat(90));
		
		
	}//end printScore
	
	
	
	
	
	
	
}// end class
