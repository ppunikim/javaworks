package com.callor.app.exec.controller;

import com.callor.app.exec.service.impl.ScoreServiceImplV3;

public class Controller {
	public static void main(String[] args) {
		
		ScoreServiceImplV3 scV1 = new ScoreServiceImplV3();
		scV1.makeScore();
		scV1.printScore();
		
		
	}//end main
}
