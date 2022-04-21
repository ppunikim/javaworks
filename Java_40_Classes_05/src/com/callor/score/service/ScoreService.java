package com.callor.score.service;

public interface ScoreService {
	
	// interface의 모양이다. 이것은 설계도이다.
	// method의 코드가 없고 ; 를 붇인다.
	// 한개라도 빼면 오류가 나서, 반드시 작성해야하는 친구다.
	public void makeScore();
	public void printScore();
	
	public int makeSum();
	public float retAvg();

}
