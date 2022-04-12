package com.callor.arrays.exec;

public class ExecV0 {
	
	/*
	 * 진입점 메서드, java시작점
	 *  - 프로젝트를 Run 했을 때 제일먼저 실행되는 위치 혹은 메서드이다.
	 */
	public static void main(String[] args) {
		
		/*
		 * 변수 : 데이터를 저장할 장소
		 * 정수형 변수(에) num를 선언하여 초기화 시켰다.
		 */
		int num = 0;
		
		/*
		 * 1. 클래스를 사용하여 객체를 선언하고
		 * 	  생성자를 호출하여 초기화 하였다.
		 * 2. execV1 인스턴스를 생성하였다. 즉, 인스턴스화 했다.
		 */
		ExecV1 execV1 = new ExecV1();
		
		/*
		 * void type은 print method앞에 변수가 올 수 없다.
		 */
		execV1.print();
		
		/*
		 * return type이 정수형인 sum method는 결과를 변수에 저장가능.
		 */
		int Sum = execV1.sum();
		
		
		
		
	}//end main

}//end class
