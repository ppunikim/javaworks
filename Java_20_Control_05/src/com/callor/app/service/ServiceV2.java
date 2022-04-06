package com.callor.app.service;

public class ServiceV2 {
	
	/*
	 * 지금 ServiceV2 클래스에는 guguDanV2() 가 2번 선언돼있다.
	 * 보통은 같은 이름의 method를 두 번 이상 선언하면 오류가 선언한다.
	 * 하지만 java에서는 method안에 매게변수(argument)의 있고 없음에 따라 
	 *        이름은 같지만 서로 다른 메소드로 판단하여 오류가 발생하지 x.
	 * 이것은 java뿐 아니라 객체지향 프로그래밍 언어의 공통된 특징이다. 
	 */
	
	public void guguDan() {
		
		int num = 1;
		for( ; num<10; num++ ) {
			
			System.out.printf("\t %d x %d = %d \n",3,num,3*num );
		} //end for
		
	}// end guguDan
	
	public void guguDanV2() {
		
		int dan = 3;
		int index = 100;
		
		/*
		 * for(초기화 코드; 비교코드; 변화코드) { }
		 * 1. 초기화 코드는 for() 명령을 만나면 최초에 한번만 실행
		 * 2. 비교 코드는 실행하여 
		 * 3. 결과가 true이면 {} 내부의 코드 실행
		 * 4. {}코드가 실행 완료되면 변화코드 실행
		 * 
		 * 1~ 4 가 계속반복 비교코드가 false가 되기 전까지 
		 */
		for( index = 1; index<10; index++ ) {
			
			System.out.print("\t");
			System.out.print(dan);
			System.out.print("x");
			System.out.print(index);
			System.out.print("=");
			System.out.print( dan * index);
		} //end for
		
	}//end guguDanV2
	
	/*
     *  guguDan(변수 선언) 형식으로 method선언하기
     *  method의 괄호안에 선언된 변수를 "argument(아규먼트)"라고 한다.
     *  argument : 매게변수, parameter(파라메터)
	     *  호출하는 곳에서 값을 전달하면 전달된 값을 변수에 저장하고
	     *  코드 내에서 변수값을 사용하여 연산을 수행한다.
	 *  argument가 포함된 method를 호출할 때는 반드시 argument에 합당한
	 *  값을 함께 전달(주입)해 주어야 한다.
	 */
	public void guguDanV2( int dan ) {
		
		int index = 1;
		for( index = 1; index<10; index++ ) {
			
			System.out.print("\t");
			System.out.print(dan);
			System.out.print("x");
			System.out.print(index);
			System.out.print("=");
			System.out.print( dan * index);
		  
		}//end for
		
	}// end guguDanV2_dan

}











