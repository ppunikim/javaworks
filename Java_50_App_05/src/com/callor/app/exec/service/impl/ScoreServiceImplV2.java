package com.callor.app.exec.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.exec.model.ScoreVO;
import com.callor.app.exec.service.ScoreService;
import com.callor.app.exec.utils.Line;

public class ScoreServiceImplV2 implements ScoreService{
	
	protected int stCount;
	protected final List<ScoreVO> scList;
	
	protected final int linelength = 50;
	protected final String[] subs;
	
	public ScoreServiceImplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		subs = new String[] { " 학번"," 국어"," 영어"," 수학"," 총점"," 평균"  };
	}//end 생성자
	
	private int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}// end getScore : 랜덤 값을 받아오는 것
	
	@Override
	public void makeScore() {
		for(int i = 0; i < stCount ; i ++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			scVO.setIntKor(getScore());
			scVO.setIntEng(getScore());
			scVO.setIntMath(getScore());
			scList.add(scVO);
		}
	}// end makeScore : 랜덤값을 국,영,수에 준다.

	@Override
	public void printScore() {
		System.out.println(Line.dLine(linelength));
		System.out.println("햇살고교 성적처리 V2");
		System.out.println(Line.sLine(linelength));
		for(String sub : subs) {
			System.out.print(sub + "\t");
		}
		System.out.println();
		System.out.println(Line.sLine(linelength));
		int KorTotal = 0;
		int EngTotal = 0;
		int MathTotal = 0;
		int SumTotal = 0;
		for(ScoreVO scVO : scList) {
			System.out.printf("%5d\t", scVO.getStNum());
			System.out.printf("%5d\t", scVO.getIntKor());
			System.out.printf("%5d\t", scVO.getIntEng());
			System.out.printf("%5d\t", scVO.getIntMath());
			System.out.printf("%5d\t", scVO.getIntSum());
			System.out.printf("%5.2f\n", scVO.getfAvg());
			KorTotal += scVO.getIntKor();
			EngTotal += scVO.getIntEng();
			MathTotal += scVO.getIntMath();
			SumTotal += scVO.getIntSum();
		}
		System.out.println(Line.dLine(linelength));
		System.out.print(" 총 점 ");
		System.out.printf("%7d\t",KorTotal);
		System.out.printf("%6d\t",EngTotal);
		System.out.printf("%5d\t",MathTotal);
		System.out.printf("%5d\t",SumTotal);
	}//end printScore : 성적을 출력한다.
	

}//end class



















