package com.callor.app.controller;

import com.callor.app.service.ScoreService;
import com.callor.app.service.impl.ScoreServiceImplV2;

public class ScoreControllerV1 {
	
	public static void main(String[] args) {
		
		ScoreService scService = new ScoreServiceImplV2();
		scService.inputScore();
		
		
	}//end main
}//end class
