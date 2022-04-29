package com.callor.app.exec;

public class Exec22 {
	
	public static void main(String[] args) {
		
	int pay = 55345340;
	int money = 50000;
	int sw = 1;
	
	while( pay > 0 ) {
		
		int paper = pay / money;
		System.out.printf("%d 권 : %d 매 ", pay, paper);
	} 

	}
}
