package com.callor.score.exec;

public class VarEx2 {
	public static void main(String[] args) {
		
		int num1 = 100;
		Integer intNum1 = num1; // 참조형으로, 주소값을 저장한다. 즉, 박싱
		/*
		 * int형 변수에 담긴 데이터를 Integer형 변수에 복사
		 * int형 데이터에 box를 씌워 Integer형으로 보낸다.
		 * boxing
		 */
		
		
		num1 = intNum1; // int는 값을 그대로 저장한다. 즉, 언박싱
		/*
		 * Integer형변수에 담긴 데이터를 int형 변수에 복사
		 * Integer box에 담긴 데이터를, box 풀어헤쳐 내용물만 int형 변수에 저장
		 * unboxing
		 */
		//변수의 형이 바뀌는 것이 아니라, 이것들은 감싸고있는 기억장치의 모양이바뀐 것이다. 
	}

}
