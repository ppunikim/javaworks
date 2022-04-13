package com.callor.arrays.controller;

import com.callor.arrays.service.ScoreServiceV5;

public class ScoreControllerV5 {
	
	public static void main(String[] args) {
		
		ScoreServiceV5 scServiceV5 = new ScoreServiceV5();
		scServiceV5.makeScore();
		scServiceV5.PrintScore();
		scServiceV5.intSumScore();
		
	}//end main

}//end class
