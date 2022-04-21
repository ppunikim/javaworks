package com.callor.score.service;

import com.callor.score.domain.StudentVO;

// StudentService가 할 일
/*
 * 1. student.txt 파일을 읽어서 학생 데이터들 만들기
 * 2. 생성된 학생 데이터들을 return 해주기
 * 3. 학번을 argument로 받아서 해당 학생데이터를 return 해주기
 */
public interface StudentService {
	
	public void loadStudent();  //1번
	public StudentVO[] getStudents(); //2번
	//stNum 학번을 학생데이터들에서 찾아(findByNum),학생 데이터를 return하기 
	public StudentVO findByNum(String stNum); //3번
	//프로토타입 : 설계도

}//end interface
