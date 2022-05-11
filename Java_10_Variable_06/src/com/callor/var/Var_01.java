package com.callor.var;

public class Var_01 {
	
       public static void main(String[] args) {
	
	
		int intNum1 = (int)(Math.random() * 1000) + 1; // 0~0.999 -> 0~9999.999 -> 1~10000.999 -> 1~10000
		int intNum2 = (int)(Math.random() * 1000) + 1;
		
			System.out.printf("\t intNum1: %d\n", intNum1);
			System.out.printf("\t intNum2: %d\n", intNum2);
			
			System.out.printf("\t Num1 > Num2 "+ ( intNum1 > intNum2));
			System.out.printf("\t Num1 < Num2 "+ ( intNum1 < intNum2));
			System.out.printf("\t Num1 = Num2 "+ ( intNum1 == intNum2));
			
			/*
			 * 두 개의 비교대상(intNum1, intNum2)에 담긴 값이 정확히 일치하지 않으면  true,
			 * 두 개의 비교대상이 같지 않냐? 라고 묻는다.
			 */
			System.out.printf("\t Num1 <> Num2 "+ ( intNum1 != intNum2));

			
			/*
			 * Literal(리터럴) : 값을 명확히 확인할 수 있는 값
			 * 일반적인 숫자값, "문자열"
			 * Java에서 리터럴과 리터럴을 비교연산 하는 것은 거의 의미가 없다.
			 * 때문에 eclipse에서 오류 또는 경고를 보여준다.
			 */
			System.out.println(30 == 30);
			System.out.println(30 > 30);
       }
}
