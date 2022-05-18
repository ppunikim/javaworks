package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	protected final List<ScoreVO> scList;
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();
	}
	
	@Override
	public void makeScore() {
		
		for(int i = 0; i < 10; i ++) {		//리스트는 갯수가 정해지지 않아서 for문에 넣어줘야 한다.
			int Kors = (int)(Math.random() * 100) + 1;
			int Engs = (int)(Math.random() * 100) + 1;
			int Maths = (int)(Math.random() * 100) + 1;
			ScoreVO scVO = new ScoreVO();
			scVO.setIntKor(Kors); 
			scVO.setIntEng(Engs);
			scVO.setIntMath(Maths);
			scList.add(scVO);
		}// scVO를 초기화 하고, 값을 담는다.
		// 같은 값이 
		
		System.out.println(scList);
		
	}//end makeScore

	@Override
	public void printScore() {
		
	}

	@Override
	public void sumScore() {

	}

	@Override
	public void avgScore() {

	}

}
