package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.utils.Line;

public class ScoreServiceV2 extends ScoreServiceV1 { //상속받음.
	
	
	public ScoreServiceV2() {
		this(10);
	}//기본생성자
	
	public ScoreServiceV2(int length) {
		scores = new ScoreV2VO[length];
		for(int i=0; i< scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}//임의생성자
	
	//학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV2(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i=0; i<length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}//사용할 준비를 하는 것.
		
	}// 이름 임의생성자
	
	public void printScore() {
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		int sumTotal = 0;
		float avgResult = 0;
 		
		System.out.println(Line.dLine(50));
		System.out.println("햇살고교 성적표 V2");
		System.out.println(Line.sLine(50));
		System.out.println("이  름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균");
		System.out.println(Line.sLine(50));
		for(int i=0; i<scores.length; i++) {
			System.out.printf("%-4s\t",scores[i].getStName());
			System.out.printf("%4d\t",scores[i].getIntKor() );
			System.out.printf("%4d\t",scores[i].getIntEng() );
			System.out.printf("%4d\t",scores[i].getIntMath() );
			System.out.printf("%4d\t",scores[i].getIntSum() );
			System.out.printf("%4.2f\n", scores[i].getfAvg() );

			korTotal += scores[i].getIntKor();
			engTotal += scores[i].getIntEng();
			mathTotal += scores[i].getIntMath();
			sumTotal += scores[i].getIntSum();
			
			avgResult += scores[i].getfAvg();
			
		}//end for
		
		
		System.out.println(Line.sLine(50));
		System.out.printf("%-4s\t", "총점"); // 총 자리수를 6자리로 만들고, 빈칸은 비워놔라.
		System.out.printf("%4d\t",korTotal);
		System.out.printf("%4d\t",engTotal);
		System.out.printf("%4d\t",mathTotal);
		System.out.printf("%4d\t",sumTotal);
		System.out.printf("%4.2f\n",avgResult/scores.length);
		System.out.println(Line.dLine(50));
		
	}//end printScore
	
	

}//end class
