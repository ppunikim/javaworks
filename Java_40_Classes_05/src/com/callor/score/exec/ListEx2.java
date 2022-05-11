package com.callor.score.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.score.domain.StudentVO;

public class ListEx2 {
	public static void main(String[] args) {
		
		List<StudentVO> stList = new ArrayList<>(); // java 9 부터 뒷 <> 생략가능
		// 질문: 원래 Integer있어야 하는데, StudentVO가 들어간 이유?
		// <> 안에는 type을 지정하는 것인데, class도 type이기 때문.
		// 이것의 의미는 stList를 <>것만 가져오기 위한것으로, 배열에 비해 낭비가 없다.
		
		for(int i=0; i< 10; i++) {
			StudentVO vo = new StudentVO();
			
			String strNum = String.format("%05d",i+1);
			
			int intNum = (int)(Math.random()*100)+1;
			int intGrade = (intNum % 4) + 1;
			String strGrade = intGrade + "";
			
			vo.setStNum(strNum);
			vo.setStGrade(strGrade);
			System.out.println(vo.toString());

			stList.add(vo); // 10명의 학생정보를 저장할 배열이다.
			
		}
		
		
		
	}//end main
}//end class
