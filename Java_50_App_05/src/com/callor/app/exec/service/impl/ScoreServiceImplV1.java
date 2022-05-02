package com.callor.app.exec.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.exec.model.ScoreVO;
import com.callor.app.exec.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService{

	private final List<ScoreVO> scList;  // list를 final로 선언하고
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();      // 생성자에서 리스트 객체를 초기화하여
	} //NullpointerException 사전에 예방한다.
	
	
	// TODO 성적 데이터 생성
	@Override
	public void makeScore() {
		for(int i = 0 ; i < 20 ; i ++) {
			
			
			
		}

	}

	@Override
	public void printScore() {
//		int size = scList.size();

		
	}
	
	
	

}//end class
