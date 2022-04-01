package com.callor.controller.op;

public class Cascading_01 {
	public static void main(String[] args) {
		
		
		//java에서 취급하는 정수
		short shortNum1 = 0; // 2^16
		int intNum1 = 0; // 2^32
		long longNum1 = 0; // 2^64
		
		/*
		 * 크기(저장공간)이 작은 type의 변수에 크기가 큰 type의 변수값을 복사-대입 하는 경우
		 * 값을 잃을 수 있다. 하지만 억지로 대입하고자 한다면, "강제 형 변환(Cascading)"을 수행해야 한다.
		 * 강제 형 변환을 수행했을 때 예측할 수 없는 결과가 나올 수 있고, 그 책임은 순전히 개발자 몫이다.
		 */
		shortNum1= (short)intNum1;
		intNum1 = (int)longNum1;
		
		shortNum1 += intNum1; // 연산식에서 복합연산자가 포함될 경우 변수간 "강제 형 변환"이 발생한다.
							  // 결과는 예측할 수 없고 중요한 문제를 야기할 수 있다.
		intNum1 += longNum1;
		//복합코드로, 상당히 위험한 코드이지만 자바에서는 허용한다.
		
		
		/*
		 * 실수값(double,float)값을 정수형 변수에 대입하면, 문법 오류가 발생한다. 
		 * 이것은 오차에 대한 안전장치이다. 경우에 따라 소수점 이하 값을 무시하고 강제로 형변환을 하여 실수값을
		 * 정수형 변수에 대입하기도 한다.
		 */
		intNum1 = (int)3.9; // 강제 형 변환.
		intNum1 += 3.2; // 강제 형 변환.
		
		intNum1 = 0;
		intNum1 += 3.1213213123; // 강제 형 변환.
		System.out.println(intNum1);
		
		
		
		
		
	
	}

}
