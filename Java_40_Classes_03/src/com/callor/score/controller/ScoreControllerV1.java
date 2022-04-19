package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		String[] stNames = {"길동","둘리","또치","도우너","마이클"};
		ScoreServiceV1 scServiceV1 = new ScoreServiceV1(stNames);
		scServiceV1.makeScore();
		scServiceV1.printScore();
	}

}
