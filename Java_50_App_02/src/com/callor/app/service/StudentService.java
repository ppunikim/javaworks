package com.callor.app.service;

import java.util.List;

import com.callor.app.domain.StudentVO;

public interface StudentService {
	
	public void loadStudent();
	public List<StudentVO> getStudents();
	public StudentVO findByStNum(String stNum); //학번은 고유하므로 한 학생으로 가져오기
	public List<StudentVO> findByStName(String stName); // 중복가능성 있으므로 List로 가져오기
	
	
}
