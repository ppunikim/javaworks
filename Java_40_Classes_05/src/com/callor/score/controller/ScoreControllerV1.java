package com.callor.score.controller;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.impl.StudentServiceImplV1;

public class ScoreControllerV1 {
	public static void main(String[] args) {
		
		String stFile= "student.txt";
		int stLength = 50;
		
		StudentServiceImplV1 stServiceV1 = 
				new StudentServiceImplV1(stFile, stLength);
		
		stServiceV1.loadStudent();
		StudentVO[] stList = stServiceV1.getStudents();
		StudentVO stNo1 = stServiceV1.findByNum("0001");
		
		
		ScoreServiceImplV1 scServiceV1 = new ScoreServiceImplV1();
		scServiceV1.makeScore();
		int intSum = scServiceV1.makeSum();
		float fAvg = scServiceV1.retAvg();
		scServiceV1.printScore();
		
	}//end main

}
