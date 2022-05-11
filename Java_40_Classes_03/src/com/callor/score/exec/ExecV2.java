package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV2 {
	
	public static void main(String[] args) {
		
		ScoreV2VO stNo1 = new ScoreV2VO(); //생성자호출
		
		stNo1.setStName("길동");
		System.out.println(stNo1.getStName());
		
		ScoreV2VO stNo2 = new ScoreV2VO();
		
		stNo2.setStName("둘리");
		System.out.println(stNo2.getStName()); 
		//캡슐화(내부에 어떤것이 있는지 모르지만 이름만 보고 작용하는 것을 아는 것 ) 라고 한다.
		
		stNo1.setIntKor(70);
		stNo2.setIntKor(70);
		
		stNo1.setIntEng(60);
		stNo2.setIntEng(60);
		
		stNo1.setIntMath(100);
		stNo2.setIntMath(50);
		
		System.out.println(stNo1.toString()); // 저장된 기억장소의 위치를 알려준다.
		
		
		
	}//end main

}
