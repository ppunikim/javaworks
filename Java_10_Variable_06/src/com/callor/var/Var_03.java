package com.callor.var;


public class Var_03 {
	
	public static void main(String[] args) {
		
		
		int intNum1 = (int)(Math.random() * 100 + 1);
		
		// boolean type의 변수 초기화는 true값을 주로 사용한다.
		boolean bEven = true;
		
		bEven = (intNum1 % 2) == 0;
		
		if(bEven) {
			System.out.println(intNum1 + " 는(은) 짝수");
		}
		/*
		 * 비교(조건) 명령문
		 * if(boolean){ boolean이 true일 때 실행 }
		 * else{ boolean이 true가 아닐 때 실행 }
		 * boolean 의 값이 true인가 false인가에 따라 명령문을 선택적으로 실행할 수 있다.
		 */
		else { System.out.println(intNum1 + " 는(은) 짝수가 아니다.");}
		
		
		if( (intNum1 % 3)== 0) {
			System.out.println(intNum1 + " 는 3의 배수이다.");
		} else { System.out.println(intNum1 + " 는 3의 배수가 아니다.");}
		  
		
		
		if( (intNum1 % 4) == 0) {
			System.out.println(intNum1 + " 는 4의 배수");
		} else if( (intNum1 % 3)== 0 ){ System.out.println(intNum1 + " 는 4의 배수가 아니다.");
		                                System.out.println("하지만 3의 배수이다.");}
		else if( (intNum1 % 2)== 0 ) {System.out.println(" 는 4의 배수 아님");
		                              System.out.println(" 3의 배수도 아님");
		                              System.out.println(" 그런데 2의 배수인 것 같다.");}
		else {System.out.println("2의 배수도아니고 3의 배수도 아니고, 4의 배수도 아니다."); }
		
		
		
	}

}
