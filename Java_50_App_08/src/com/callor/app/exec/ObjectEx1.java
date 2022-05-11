package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;

public class ObjectEx1 {
	public static void main(String[] args) {
		
		ScoreVO scVO = new ScoreVO();  // 한 사람의 성적을 저장 할 scVO 객체 생성.
		scVO.setStNum(1);
		scVO.setIntKor(69);
		scVO.setIntEng(40);
		scVO.setIntMath(89);
		
		ScoreVO scVO2 = new ScoreVO();
		scVO2.setStNum(6);
		scVO2.setIntKor(54);
		scVO2.setIntEng(76);
		scVO2.setIntMath(45);
		
		
		ScoreVO[] scVOs = new ScoreVO[5];  // 다섯 사람들의 성적을 저장할 배열 선언.
		scVOs[0] = new ScoreVO();  // scVOs 배열의 0번째 요소를 객체로 생성하기(초기화하기)
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(86);
		scVOs[0].setIntEng(97);
		scVOs[0].setIntMath(05);
		
		scVOs[1] = new ScoreVO();
		scVOs[1].setStNum(3);
		scVOs[1].setIntKor(43);
		scVOs[1].setIntEng(93);
		scVOs[1].setIntMath(65);
		
		List<ScoreVO> scList;    // 다수의 학생 성적을 저장할 ScoreVO List를 생성(데이터 없음)
		scList = new ArrayList<>();   // scList 를 생성하기(초기화하기)  
		ScoreVO sVO1 = new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(59);
		sVO1.setIntEng(95);
		sVO1.setIntMath(49);
		scList.add(sVO1);
		
		sVO1 = new ScoreVO();
		sVO1.setStNum(5);
		sVO1.setIntKor(65);
		sVO1.setIntEng(43);
		sVO1.setIntMath(12);
		scList.add(sVO1);
		
	}// end main
}// end class
