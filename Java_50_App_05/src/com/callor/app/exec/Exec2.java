package com.callor.app.exec;

public class Exec2 {
	public static void main(String[] args) {
		
		int fiveMan = 50_000;
		int oneMan = 10_000;
		int oneChun = 1_000;
		int fiveBack = 500;
		int oneBack = 100;
		int fiveSiv = 50;
		int oneSiv = 10;
		
		int intMoney = 555_550;
		System.out.println("처음 돈은 " + intMoney +" 원이다.");
		
		int intNum = intMoney / fiveMan;
		intMoney = intMoney % fiveMan;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		 intNum = intMoney / oneMan;
		intMoney = intMoney % oneMan;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);

		intNum = intMoney / oneChun;
		intMoney = intMoney % oneChun;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		intNum = intMoney / fiveBack;
		intMoney = intMoney % fiveBack;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		intNum = intMoney / oneBack;
		intMoney = intMoney % oneBack;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		intNum = intMoney / fiveSiv;
		intMoney = intMoney % fiveSiv;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		intNum = intMoney / oneSiv;
		intMoney = intMoney % oneSiv;
		System.out.printf("%d 의 갯수로, %d가 되었다.\n" ,intNum , intMoney);
		
		
		
		
		
		
	}//end main
}
