package com.callor.arrays.service;

import com.callor.arrays.utils.Line;

public class ScoreServiceV1 {
	
	/* 클래스 영역에 선언된 변수:
	 * ScoreServiceV1 클래스에 선언된 모든 method에서 
	 * 변수에 접근(읽고, 저장)할 수 있다.
	 * 
	 * 인스턴스 변수: 
	 * ScoreServiceV1 클래스를 사용하여 인스턴스를 생성할 때 => ControllerV1에서 
	 * (자동으로 ) 초기화되는 변수 => ScoreServiceV1에서.
	 */
	int[] intKor; //배열은 선언만 한 상태에서 저장이 안된다.
	
	/*
	 * ScoreServiceV1 클래스를 초기화할 생성자 메서드 선언:
	 * 		생성자 메서드(ScoreServiceV1())는 클래스(ScoreServiceV1)를 선언하면 
	 * 		클래스블럭{} 내부에 자동으로 선언된다. 자동으로 선언된 
	 * 		생성자 메서드는 코드상에는 보이지 않는다.
	 * 
	 *  없어도 되는, 생략된 ,임의로 생성자 메서드를 선언하는 이유
	 * 1. 클래스 영역에 선언된 변수를 초기화 하여 사용할 수 있도록 
	 * 			준비하는 코드를 포함한다. 
	 * 2. java규칙상으로 이렇게 쓰는 것이 좋다.
	 */
	public ScoreServiceV1() {
		intKor = new int[100]; //intKor 배열이 사용 할(저장하고 읽기)  준비가 된다.
	}
	
	public void makeScore() {
		for(int i=0; i<intKor.length; i++) {
			/*
			 * random() * 50 을 연산하면 0~49까지 범위의 임의 수가 생성된다.
			 * 여기에 +51 을 하면 0일때는 51, 49일때는 100의 결과가 생성된다.
			 * 그래서 51~100 까지의 범위에서 임의 수를 생성하는 코드
			 */
			intKor[i] = (int)(Math.random() * 50 ) + 51;
		}
	}
	public void printScore() {
		/*
		 * Line 클래스에 선언된 dline 속성(변수)은 static이기 때문에
		 * Line 클래스를 line 인스턴스로 만들고 line.dLine처럼 
		 * 접근할 필요가 없다.
		 * 
		 * dLine 속성(변수)은 static으로 선언되어 있기 때문에
		 * Line클래스를 인스턴스로 생성하지 않고 접근할 수 있다.
		 */
		
		System.out.println(Line.dLine);
		System.out.println("국어 성적 열람표");
		System.out.println(Line.sLine);
		
		for(int i = 0; i < intKor.length; i++ ) {
			System.out.printf("%d\t",intKor[i]);
			
			if( (i+1)%5 == 0 ) {
				System.out.println();
			}
		}
		System.out.println(Line.dLine);
	}

}//end class
