package com.callor.arrays.controller;

import com.callor.arrays.service.StudentServiceV1;

public class StudentControllerV1 {
	
	public static void main(String[] args) {
		
		StudentServiceV1 stService10 = new StudentServiceV1();
		StudentServiceV1 stService = new StudentServiceV1(5);
		
		stService.inputStudent();
		//stService.printStudent();
	}
	

}//end class
