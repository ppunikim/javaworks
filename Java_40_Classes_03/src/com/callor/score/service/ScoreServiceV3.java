package com.callor.score.service;

import com.callor.score.domain.ScoreV2VO;
import com.callor.utils.Line;
import com.callor.utils.Score;

public class ScoreServiceV3 extends ScoreServiceV1 { //상속받음.
	
	
	protected final static int I_KOR = 0;
	protected final static int I_ENG = 1;
	protected final static int I_MATH = 2;
	protected final static int I_TOTAL = 3;
	protected final static int I_AVG = 4;
	
	public ScoreServiceV3() {
		this(10);
	}//기본생성자
	
	public ScoreServiceV3(int length) {
		scores = new ScoreV2VO[length];
		for(int i=0; i< scores.length; i++) {
			scores[i] = new ScoreV2VO();
		}
	}//임의생성자
	
	//학생 이름 리스트를 배열로 받아서 초기화 하기
	public ScoreServiceV3(String[] stNames) {
		int length = stNames.length;
		scores = new ScoreV2VO[length];
		for(int i=0; i<length; i++) {
			scores[i] = new ScoreV2VO();
			scores[i].setStName(stNames[i]);
		}//사용할 준비를 하는 것.
		
	}// 이름 임의생성자
	
	public void printScore() {
		
		float[] totals = new float[5];
		
		System.out.println(Line.dLine(50));
		System.out.println("햇살고교 성적표 V3");
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

			totals[I_KOR] += scores[i].getIntKor();
			totals[I_ENG] += scores[i].getIntEng();
			totals[I_MATH] += scores[i].getIntMath();
			totals[I_TOTAL] += scores[i].getIntSum();
			totals[I_AVG] += scores[i].getfAvg();
			
		}//end for
		
		
		System.out.println(Line.sLine(50));
		System.out.printf("%-4s\t", "총점"); // 총 자리수를 6자리로 만들고, 빈칸은 비워놔라.
		System.out.printf("%4.0f\t",totals[Score.I_KOR]);
		System.out.printf("%4.0f\t",totals[Score.I_ENG]);
		System.out.printf("%4.0f\t",totals[Score.I_MATH]);
		System.out.printf("%4.0f\t",totals[Score.I_TOTAL]);
		System.out.printf("%4.2f\n",totals[Score.I_AVG]/(float)scores.length); //자동형변환되므로 굳이 안써도 된다.
		System.out.println(Line.dLine(50));
		
	}//end printScore
	
	

}//end class
