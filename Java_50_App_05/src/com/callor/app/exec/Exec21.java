package com.callor.app.exec;

public class Exec21 {
	/* 예제문제.
	 * 급여를 현금으로 지급하는 것.
	 * 
	 * 대한민국 화폐단위는 %5, %2 로 반복되어있다.
	 */
	public static void main(String[] args) {

				
		int intMoney = 555_550;
		System.out.println("처음 돈은 " + intMoney +" 원이다.");

		int paper = (intMoney / 50000 );
		System.out.println("5만원 권 개수: " + paper);
		intMoney -= paper* 50000;
		
		//이 것을 10원까지 반복하면 만들어진다.
		//하지만 반복되므로, 다음장에서 리뷰한다.
		
	}//end main
}
