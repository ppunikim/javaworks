package com.callor.var;

public class Var_02 {
	
	public static void main(String[] args) {
		
		int intNum1 = (int)(Math.random() * 10) + 1;
		int intNum2 = (int)(Math.random() * 10) + 1;
		
		boolean bYes = intNum1 >= intNum2;
		
		/*
		 * boolean type 변수 선언하고
		 * intNum1 과 intNum2 의 값을 비교 ( >= ) 하여
		 * 나타나는 결과 (true, false)를 변수에 저장
		 */
		System.out.println(bYes);
		
		
		/*
		 * 산술연산과 비교연산을 함께 표현하는 연산 식(expresstion)
		 * 1. intNum1 % 2 가 연산되고
		 * 2. 그 결과가 0과 같은지 비교 연산을 수행한다.
		 * 3. 최종적으로 비교 연산 결과를 bEven 변수에 저장
		 * 이 연산식의 최종 결과가 담기는 bEven의 값은 intNum1 이 짝수면 true, 짝수아니면 false
		 * 
		 */
		boolean bEven = (intNum1 % 2) == 0;
		
		
		/*
		 * intNUm1 에 저장된 값이 3의 배수인가?
		 * drainge3 에 담긴 값이 true이면 3의 배수이다. 담긴 값이 false이면 "3의 배수가 아니다."라고 표현.
		 */
		boolean drainge3 = (intNum1 & 3) == 0;
		System.out.println("\n===================");
		System.out.println(drainge3);
		
		
	}

}
