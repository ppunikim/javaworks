package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.utils.Line;

public class ScoreServiceV1 {
	
	private ScoreV2VO[] scores;
	
	public ScoreServiceV1() {
		this(10);
	}//기본생성자
	
	public ScoreServiceV1(int length) {
		scores = new ScoreV2VO[length];
		for(int i=0; i< scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}//임의생성자
	
	//학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV1(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i=0; i<length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}//사용할 준비를 하는 것.
		
	}// 이름 임의생성자
	
	public void makeScore() {
		for(int i=0; i<scores.length; i++) {
			int intKor = (int)(Math.random()*50) +51;
			int intEng = (int)(Math.random()*50) +51;
			int intMath = (int)(Math.random()*50) +51;
			
			scores[i].setIntKor(intKor);
			scores[i].setIntEng(intEng);
			scores[i].setIntMath(intMath);
		}
	}// end makeScore
	
	public void printScore() {
		System.out.println(Line.dLine(50));
		System.out.println("햇살고교 성적표 V1");
		System.out.println(Line.sLine(50));
		System.out.println("이  름 \t국어 \t영어 \t수학 \t총점 \t평균");
		System.out.println(Line.sLine(50));
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i].getStName() + "\t");
			System.out.print(scores[i].getIntKor() + "\t");
			System.out.print(scores[i].getIntEng() + "\t");
			System.out.print(scores[i].getIntMath() + "\t");
			System.out.print(scores[i].getIntSum() + "\t");
			System.out.printf("%3.2f\n", scores[i].getfAvg() );
		}
		int resultKor = 0;
		for(int sum= 0; sum<scores.length; sum++) {
			resultKor += scores[sum].getIntKor(); 
		}
		int resultEng = 0;
		for(int sum= 0; sum<scores.length; sum++) {
			resultEng += scores[sum].getIntEng(); 
		}
		int resultMath = 0;
		for(int sum= 0; sum<scores.length; sum++) {
			resultMath += scores[sum].getIntMath(); 
		}
		int result= 0;
		for(int sum= 0; sum<scores.length; sum++) {
			result += scores[sum].getIntSum(); 
		}
		float resultAvg = 0f;
		for(int sum= 0; sum<scores.length; sum++) {
			resultAvg += scores[sum].getfAvg(); 
		}
		
		
		System.out.println(Line.sLine(50));
		System.out.printf("총  점\t%d\t%d\t%d\t%d\t%6.2f\n",resultKor,resultEng, resultMath, result, resultAvg);
		System.out.println(Line.dLine(50));
		
	}//end printScore
	
	

}//end class
