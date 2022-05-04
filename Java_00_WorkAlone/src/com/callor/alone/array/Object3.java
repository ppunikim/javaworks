package com.callor.alone.array;

import java.util.ArrayList;
import java.util.List;

import com.callor.alone.model.ScoreVO;

public class Object3 {
	public static void main(String[] args) {
		
		List<ScoreVO> scList = new ArrayList<>();
		makeScore(scList, 10);
		printScore(scList);
		
	}//end main
	
	private static void makeScore(List<ScoreVO> list, int size) {
		for(int i = 0; i < size; i ++) {
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1 );
			scVO.setIntKor(getScore());
			scVO.setIntEng(getScore());
			scVO.setIntMath(getScore());
			list.add(scVO);
		}
	}
	
	private static int getScore() {
		return (int)(Math.random() * 100 ) + 1; 
	}
	
	private static void printScore(List<ScoreVO> list) {
		int size = list.size();
		System.out.println("=".repeat(10));
		System.out.println("학번\t국어\t영어\t수학");
		System.out.println("=".repeat(10));
		for(int i = 0; i < size; i ++) {
			ScoreVO sVO = list.get(i);	
			System.out.print(sVO.getStNum() + "\t");
			System.out.print(sVO.getIntKor() + "\t");
			System.out.print(sVO.getIntEng() + "\t");
			System.out.println(sVO.getIntMath() + "\t");
					
		}
		System.out.println("=".repeat(10));
				
	}
	
	
}//end class
