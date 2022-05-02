package com.callor.app.exec.service.impl;

import com.callor.app.exec.model.ScoreVO;
import com.callor.app.exec.utils.Line;

public class ScoreServiceImplV3 extends ScoreServiceImplV2{
	
	public ScoreServiceImplV3() {
		/* super() method
		 * 상속받은(V2) 클래스의 기본 생성자를 호출하여
		 * protected 로 선언된 변수를 초기화 하기
		 */
		super();
	}//end 기본생성자
	
	
	//내가 바꾸고자 하는 부분만 재정의해준다.
	@Override
	public void printScore() {
		
		System.out.println(Line.dLine(linelength));
		System.out.println("햇살고교 성적일람표 V3");
		System.out.println(Line.sLine(linelength));
		for(String sub : subs) {
			System.out.print(sub + "\t");
		}// 단어 별로 나눈다.
		System.out.println();
		System.out.println(Line.sLine(linelength));
		
		int KorTotal = 0; 
		int EngTotal = 0; 
		int MathTotal = 0; 
		int SumTotal = 0; 
		
		for(ScoreVO scVO : scList) {
			System.out.print(scVO.toString());
			KorTotal += scVO.getIntKor(); 
			EngTotal += scVO.getIntEng(); 
			MathTotal += scVO.getIntMath(); 
			SumTotal += scVO.getIntSum(); 
		}
		System.out.println(Line.sLine(linelength));
		System.out.printf(" 총  점 ");
		System.out.printf("%5d\t", KorTotal);
		System.out.printf("%5d\t", EngTotal);
		System.out.printf("%5d\t", MathTotal);
		System.out.printf("%5d\t", SumTotal);
		System.out.println();
		System.out.println(Line.dLine(linelength));
		
	}//end printScore
}//end class
