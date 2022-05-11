package com.callor.classes.controller;

import com.callor.classes.service.ScoreServiceV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		ScoreServiceV1 scrServiceV1 = new ScoreServiceV1(2);
		int intResult = scrServiceV1.input();
		if(intResult < 0) {
			System.out.println("입력을 중단했습니다.");
		} else {
			System.out.println("입력을 모두 완료함!!!");
		}
		
	}

}
