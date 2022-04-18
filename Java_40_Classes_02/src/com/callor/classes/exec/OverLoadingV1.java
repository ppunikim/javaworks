package com.callor.classes.exec;

public class OverLoadingV1 { //다형성
	
	//arg의 타입이 다르면 같은 이름을 써도 된다.
	public int add(int num1, int num2) {
		return num1 + num2 ;
	}
	public float add(float num1 , float num2) {
		return num1 + num2 ;
	}
	public long add(long num1 , long num2) {
		return num1 + num2 ;
	}

}// end class
