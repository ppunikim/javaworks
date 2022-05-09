package com.callor.app.service.impl;

import com.callor.app.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServiceImplV1{
	
	public ScoreServiceImplV2() {
		super();  // 상속받은 클래스의 기본 생성자 호출하는 것
	}//end 기본생성자.
	
	@Override
	public void inputScore() {
		
		while(true) {
			System.out.println("학생 이름 입력(QUIT : 종료) >> ");
			String stName = scan.nextLine();
			if(stName.equals("QUIT")) {
				break;
			}
			
			String[] strSubject = {"국어", "영어", "수학"};
			Integer[] intScore = new Integer[3];
			int index = 0; 
			for(index = 0; index < strSubject.length; index ++ ) {
				intScore[index] = getScore(strSubject[index]);
				if(intScore[index] == null) {
					index --;   // 입력값이 없으면 다시 돌아가는 코드로, 포인트 코드이다.
					continue;
				}//end 두번째 if
				if(intScore[index] < 0 ) break;
			}//end for
			
		/* Build 패턴 사용하기 위해 VO 객체 생성하면서 데이터 Setting 하기
		 * 1. 생성자 키워드 new 사용하지 않음
		 * 2. 클래스.build() 시작
		 * 3. VO 클래스에 정의된 변수 이름이 method 역할 수행
		 * 4. 변수 이름에 해당하는 method에 값 전달하여 데이터 저장
		 * 5. build() method 호출하여 마감
		 */
		/* Build 패턴 사용 이유
		 * 1. VO 객체를 생성하고 setter method 를 사용하여 
		 * 		데이터를 저장하는 번거로움을 해결
		 * 2. 필드 생성자를 사용할 때 모든 변수의 값을 준비해야하는 번거로움 해결
		 * 3. 준비된 데이터만 가지고 VO 객체를 생성하면서 데이터를 Setting 할 수 있다.
		 */
		ScoreVO scVO = ScoreVO.builder()
								  .stName(stName)
								  .stKor(intScore[0])
								  .stEng(intScore[1])
								  .stMath(intScore[2])
								  .build();
		scList.add(scVO);
		}//end while
		
		for(ScoreVO scVO : scList) {
			
		}
		
	}// inputScore override하기
	
	private Integer getScore(String title) {
		System.out.printf("%s 점수입력(QUIT : 종료) >> ", title);
		String score = scan.nextLine();
		
		if(score.equals("QUIT")) {
			return -1;
		}
		
		Integer intScore = 0;
		
		try {
			intScore = Integer.valueOf(score);
		} catch (Exception e) {
			System.out.printf("%s 점수는 정수만 가능\n", title);
			return null;
		}
		
		
		return intScore;
	}//end getScore
	
	
	
}
