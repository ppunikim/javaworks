package com.callor.app.exec;

public class Exec21 {
	public static void main(String[] args) {

		/*
		int fiveMan = 50_000;
		int oneMan = 10_000;
		int fiveChun = 5_000;
		int oneChun = 1_000;
		int fiveBack = 500;
		int oneBack = 100;
		int fiveSiv = 50;
		int oneSiv = 10;
		이것들은 %5와 %2로 반복돼있다.
		*/
		
		int intMoney = 555_550;
		System.out.println("처음 돈은 " + intMoney +" 원이다.");

		if(  intMoney % 5 == 0 ) {
			int intAll = intMoney / 5;
			intMoney -= intAll;
			System.out.println(intMoney);
		} else if( intMoney % 2 == 0) {
			int intAll = intMoney / 2;
			intMoney -= intAll;
			System.out.println(intMoney);
		} else {
			System.out.println("나올 수 없다.");
		}
		
	}//end main
}
