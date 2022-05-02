package com.callor.app.exec.controller;

import com.callor.app.exec.service.impl.ScoreServiceImplV1;

public class Controller {
	public static void main(String[] args) {
		
		ScoreServiceImplV1 scV1 = new ScoreServiceImplV1();
		scV1.makeScore();
		scV1.printScore();
		
		
	}//end main
}
