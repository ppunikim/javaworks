package com.callor.score.exec;

import com.callor.score.domain.ScoreV2VO;

public class ExecV3 {
	public static void main(String[] args) {
		
		// vo 클래스를 사용하여 배열 선언하기 
		ScoreV2VO[] scores = new ScoreV2VO[10];	//배열선언
		
		/*
		 * 배열로 선언된 객체는 아직 사용할 준비가 덜 되었다.
		 * 각 요소들을 반드시 생성자로 초기화 시켜주어야 한다.
		 */
		scores[0] = new ScoreV2VO(); // 이 작업을 하지 않으면 저장도 안되고, 읽지도 못힌다.
		scores[1] = new ScoreV2VO();
		scores[2] = new ScoreV2VO();
		scores[3] = new ScoreV2VO();
		scores[4] = new ScoreV2VO();
		
		
		scores[0].setStName("길동");
		scores[1].setStName("둘리");
		scores[2].setStName("또치");
		scores[3].setStName("도우너");
		scores[4].setStName("마이클");
		
	}//end main

}
