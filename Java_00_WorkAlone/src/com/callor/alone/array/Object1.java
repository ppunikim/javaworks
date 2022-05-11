package com.callor.alone.array;

import java.util.ArrayList;
import java.util.List;

import com.callor.alone.model.ScoreVO;
import com.callor.utils.Line;

public class Object1 {
	public static void main(String[] args) {
		
		int length = 70;
		
		System.out.println("ScoreVO를 이용해 한 사람 성적 저장");
		ScoreVO scVO = new ScoreVO(); // 한 사람의 성적 저장할 VO 객체
		scVO.setStNum(1);
		scVO.setIntKor(49);
		scVO.setIntEng(100);
		scVO.setIntMath(67);
		System.out.println(scVO);
		System.out.println(Line.dLine(length));
		
		System.out.println("ScoreVO를 이용해 한 사람 성적 저장");
		ScoreVO scVO2 = new ScoreVO();
		scVO2.setStNum(2);
		scVO2.setIntKor(69);
		scVO2.setIntEng(60);
		scVO2.setIntMath(65);
		System.out.println(scVO2);
		System.out.println(Line.dLine(length));
		
		System.out.println("ScoreVO[] 를 이용, 0번째 배열에 한 사람 성적 저장");
		ScoreVO[] scVOs = new ScoreVO[5]; // 5사람의 성적을 저장할 배열 선언
		scVOs[0] = new ScoreVO();// 0번째 요소를 객체로 생성(초기화)하기
		scVOs[0].setStNum(3);
		scVOs[0].setIntKor(60);
		scVOs[0].setIntEng(60);
		scVOs[0].setIntMath(67);
		System.out.println(scVOs[0]);
		System.out.println(Line.dLine(length));
		
		System.out.println("List<ScoreVO> 를 이용, ScoreVO를 불러와서 한 사람 성적 저장 후, 배열에 저장");
		List<ScoreVO> scList ; //scList 를 생성(아직 사용할 수 없음)
		scList = new ArrayList<>();	 // 리스트를 초기화하기(사용할 준비 완료) 
		
		ScoreVO sVO1 = new ScoreVO(); // ScoreVO 준비하기
		sVO1.setStNum(4);
		sVO1.setIntKor(29);
		sVO1.setIntEng(60);
		sVO1.setIntMath(62); //먼저 sVO1에 값들을 담고
		
		scList.add(sVO1);  // 리스트에 추가하기
		System.out.println(scList);
		
	}//end main
}//end class
