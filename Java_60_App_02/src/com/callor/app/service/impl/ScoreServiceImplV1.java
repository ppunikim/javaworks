package com.callor.app.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.app.model.ScoreVO;
import com.callor.app.service.ScoreService;

/*
 * implements 와 extends 의 차이
 * implements : 인터페이스 상속
 * extends : 클래스 상속
 *  이거 맞는지 물어보기!!
 */
public class ScoreServiceImplV1 implements ScoreService {
	
	protected final  Scanner scan;
	protected final List<ScoreVO> scList;
	public ScoreServiceImplV1() {
		scList = new ArrayList<ScoreVO>();   // 예전java는 generic(<>) 안에 ScoreVO를 넣어줘야 하지만
											// 지금은 생략 가능함.
		scan = new Scanner(System.in);
	}//end 기본생성자
	
	@Override
	public void inputScore() {
		
		while(true) {
			
			System.out.printf("학생이름 입력(QUIT: 종료) : ");
			String stName = scan.nextLine();
			
			if(stName.equals("QUIT")) {
				break;
			}
			
			System.out.printf("국어 점수 >> ");
			// 국어 입력
			String strKor = scan.nextLine();
			Integer stKor = Integer.valueOf(strKor);
			
			String strEng = scan.nextLine();
			Integer stEng = Integer.valueOf(strEng);
			
			String strMath = scan.nextLine();
			Integer stMath = Integer.valueOf(strMath);
			
			//VO 생성
			ScoreVO scVO = new ScoreVO();
			
			//VO 에 Setting
			scVO.setStName(stName);
			scVO.setStKor(stKor);
			scVO.setStEng(stEng);
			scVO.setStMath(stMath);
			
			//scList.add();
			scList.add(scVO);
			
			
			
			
			
			
		}//end while
		
		System.out.println("입력이 중단되었습니다.");
		
	}//end inputScore

	@Override
	public void saveScore() {
		
	}//end saveScore
	
}
