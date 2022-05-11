package com.callor.app.exec.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.exec.model.ScoreVO;
import com.callor.app.exec.service.ScoreService;
import com.callor.app.exec.utils.Line;

public class ScoreServiceImplV1 implements ScoreService{
	
	/*
	 * service클래스에서 필요한 데이터를 클래스 영역에 선언할 때는
	 * final 키워드를 부착하자.
	 * final 키워드를 부착하면 혹시 모를 데이터 손상을 방지하고
	 * 			데이터가 저장된 상태에서 임의의 또 다시 초기화하는 것을 방지한다.
	 * 초기화하지 않으면 오류가 나서 NullPointerException도 막을 수 있다.
	 */
	private final List<ScoreVO> scList;  // list를 final로 선언하고
	public ScoreServiceImplV1() {
		scList = new ArrayList<>();      // 생성자에서 리스트 객체를 초기화하여
	} //NullpointerException 사전에 예방한다.
	
	
	// TODO 성적 데이터 생성
	@Override
	public void makeScore() {
		for(int i = 0 ; i < 20 ; i ++) {
			int intKor = (int)(Math.random() * 50 ) + 51;
			int intEng = (int)(Math.random() * 50 ) + 51;
			int intMath = (int)(Math.random() * 50 ) + 51;
			
			// 생성된 3과목의 점수를 VO 클래스를 생성하여 저장하기.
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(i + 1);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			int intSum = intKor + intEng + intMath;
			scVO.setIntSum(intSum);
			
			float fAvg = (float)intSum / 3;
			scVO.setfAvg(fAvg);
			
			scList.add(scVO); // 이것을 꼭 해줘야 
							// scVO에 있는 데이터를 scList에 저장한다.
							// 그러면 impl에 선언한 List에 내용이 담기게 된다.
		}

	}

	@Override
	public void printScore() {
		int size = scList.size();
		int lineLength = 50;
		
		System.out.println(Line.dLine(lineLength));
		System.out.println("햇살 고교 성적 일람표");
		System.out.println(Line.sLine(lineLength));
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println(Line.sLine(lineLength));
		
		int[] intTotal = new int[4];
		int I_KOR = 0;
		int I_ENG = 1;
		int I_MATH = 2;
		int I_SUM = 3;
		
		for(int i = 0 ; i < size; i ++ ) {
			ScoreVO scVO = scList.get(i);
			System.out.printf("%5d\t",scVO.getStNum());
			System.out.printf("%5d\t",scVO.getIntKor());
			System.out.printf("%5d\t",scVO.getIntEng());
			System.out.printf("%5d\t",scVO.getIntMath());
			System.out.printf("%5d\t",scVO.getIntSum());
			System.out.printf("%5.2f\n",scVO.getfAvg());
			
			intTotal[I_KOR] += scVO.getIntKor();
			intTotal[I_ENG] += scVO.getIntEng();
			intTotal[I_MATH] += scVO.getIntMath();
			intTotal[I_SUM] += scVO.getIntSum();
		}//end for
		
		System.out.println(Line.sLine(lineLength));
		System.out.printf("  총점   %d\t %d\t%d\t%5d\n",
							intTotal[I_KOR],
							intTotal[I_ENG],
							intTotal[I_MATH],
							intTotal[I_SUM]
				);
		
		
		
	}//end printScore
	
	
	

}//end class





























