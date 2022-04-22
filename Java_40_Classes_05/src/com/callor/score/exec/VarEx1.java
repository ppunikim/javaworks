package com.callor.score.exec;

import com.callor.score.domain.StudentVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class VarEx1 {
	public static void main(String[] args) {
		
		//첫글자가 소문자면 primitive(기본) type keyword. 즉, primitive type 변수선언.
		int num1 = 100;  //정수형 변수로 type이 int형이다.
		float num2 = 100.3f; // 실수형 변수로 type이 float이다.
		boolean bYes = true; // boolean형이다.
		
		//첫글자가 대문자면 class type keyword. 즉, class type 변수선언. 즉, 참조형 변수선언.
		//참조형이란 어떠한 것이 들어있는 주소를 참조해서 실제 데이터를 가져와 출력하는것이다.
		// two pass access : 주소를 참조해 두번에 걸쳐 데이터가 오는 것을 말한다.
		Integer intNum1 = 100; //Integer타입, Integer형이다. 이것은 Integer class이다.
		Float fNum2 = 100.3f;
		Boolean bYes2 = true;
		
		String str="ppuni"; // 문자열 변수로 type이 String형이다. 또는 String class타입.
		StudentVO stVO = new StudentVO(); // StudentVO class 타입이다. 이것은 객체이기도 하다.
		
		StudentVO[] stList = new StudentVO[10]; //studentVO 배열형이다.
		
		ScoreService scService = new ScoreServiceImplV1(); // scoreService class형이다.
		
		
	}//end main

}
