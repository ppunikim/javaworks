package com.callor.score.controller;

import com.callor.score.service.ScoreServiceV1;
import com.callor.score.service.ScoreServiceV2;
import com.callor.score.service.ScoreServiceV3;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		String[] stNames = {"길동","둘리","또치","도우너","마이클"};
		ScoreServiceV1 scServiceV1 = new ScoreServiceV1(stNames);
		ScoreServiceV2 scServiceV2 = new ScoreServiceV2(stNames);
		ScoreServiceV3 scServiceV3 = new ScoreServiceV3(stNames);
		scServiceV1.makeScore();
		scServiceV1.printScore();
		System.out.println();
		System.out.println();
		scServiceV2.makeScore();
		scServiceV2.printScore();
		System.out.println();
		System.out.println();
		scServiceV3.makeScore();
		scServiceV3.printScore();
	}

}
