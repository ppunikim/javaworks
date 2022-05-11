package com.callor.score.service;

import com.callor.score.domain.StudentVO;

// StudentService가 할 일
/*
 * 1. student.txt 파일을 읽어서 학생 데이터들 만들기
 * 2. 생성된 학생 데이터들을 return 해주기
 * 3. 학번을 argument로 받아서 해당 학생데이터를 return 해주기
 */
// class이지만 keyword가 다르다.
public interface StudentService {
	
	/* 추상메서드
	 * 메서드의 접근제한자(public), 메서드의 이름, 
	 * 매개변수, return type만 정의한 것
	 * 연산(실행)되는 실제 코드가 없는 method
	 */
	public void loadStudent();  //1번
	public StudentVO[] getStudents(); //2번
	//stNum 학번을 학생데이터들에서 찾아(findByNum),학생 데이터를 return하기 
	public StudentVO findByNum(String stNum); //3번
	//프로토타입 : 설계도

}//end interface
