package com.callor.score.exec;

import java.util.List;

import com.callor.score.domain.StudentVO;

public class VarEx3 {
	public static void main(String[] args) {
		
		// primitive type변수 선언 명령문
		int num1; 
		float num2;
		double num3;
		long num4;
		
		boolean bYes;
		char char1;
		
		// class type 변수 선언 명령문
		// 기본형 변수들을 감싸고 있는 class
		// 즉, wrapper 클래스. 이것은 primitive와 형변환이다.
		Integer num11;  //int를 감싼다.
		Float num22;
		Double num33;
		Long num44;
		
		Boolean bYes1;
		Character char11;
		
		
		/* <> : Generic(제네릭)
		 * 이것도 일종의 wrapper class이다.
		 * 제네릭에는 Object type을 선언할 수 있다.
		 * 하지만 그렇게 하지 않는다. 그 이유는
		 * 메모리 관리, 유효성 관리 등이 어렵기 때문에
		 */
		List<Object> objList;
		
		List<Integer> intList;
		/*
		 * intList.add(3.3f);   
		 * Integer에는 정수형 type만 가능. 
		 * 실수형을 넣으려니 오류가 발생함.
		 * 이것이 데이터의 유효성 검사이다.
		 */	
		
		/*
		 * stList 에는 StudentVO type의 데이터만 추가할 수 있다.
		 * 만약 다른 type의 데이터가 추가되면 오류가 난다.
		 * 
		 * 이러한 기능을 사용하지 않으면 
		 * stList에 저장된 데이터가 유효한지, 잘못되었는지
		 * 항상 걱정하며 코딩을 해야할 것이다.
		 * 
		 * 사전에 제네릭을 선언함으로써 
		 * 개발자는 데이터에 대한 유효성  문제를 걱정하지 않아도 된다.
		 * 즉, stList에 담긴 학생 정보들은 "무결성"을 유지한다.
		 */
		List<StudentVO> stList;
		
		
	}//end main

}
