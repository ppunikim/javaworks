package com.callor.classes.service;

public class ScoreServiceV3 {
	
	protected String[] students;
	protected int[] intKor;	
	// 객체지향의 특징  
	// 		1. 다향성 :같은 이름의 method를 arg가 다르면 중복사용 가능
	
	public ScoreServiceV3() { //arg 가 없음
		this(10);
	}//end 생성자
	public ScoreServiceV3(int length) { // arg 가 int형이다.
		students = new String[length];
		intKor = new int[length];
	}//end int형 임의생성자
	public ScoreServiceV3(String[] students) { //arg 가 String형이다.
		this.students = students;
		this.intKor = new int[this.students.length];
	}//end String형 임의생성자
	
	
	

}//end class
