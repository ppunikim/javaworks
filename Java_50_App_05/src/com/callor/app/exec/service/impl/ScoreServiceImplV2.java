package com.callor.app.exec.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.exec.model.ScoreVO;
import com.callor.app.exec.service.ScoreService;

public class ScoreServiceImplV2 implements ScoreService{
	
	protected int stCount;
	protected final List<ScoreVO> scList;
	
	protected final int linelength = 50;
	protected final String[] subs;
	
	public ScoreServiceImplV2() {
		scList = new ArrayList<>();
		stCount = 20;
		subs = new String[] { "학번","국어","영어","수학","총점","평균"  };
	}
	
	private int getScore() {
		int score = (int)(Math.random() * 50) + 51;
		return score;
	}
	
	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub
		
	}
	

}
