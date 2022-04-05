package com.callor.controller;

// 지금부터 java.util package에 담긴 Scanner라는 클래스를 연결해서 사용하겠다.
import java.util.Scanner;

public class ScannerEx_01 {
	
	public static void main(String[] args) {
		int intRnd = (int)(Math.random()* 100) + 1;
		
		// 클래스를 사용하여 객체(object)를 선언하기
		// Scanner 클래스에 포함된 mathod를 호출하여 
		//                            무언가 명령을 수행하기 위한 첫 준비 단계
		// 즉, 객체(object)를 선언한다. 라고 표현.
		// 하지만, 객체가 선언만 된 상태에서는 아직 method를 호출하여 
		// 무언가 명령을 수행할 수 없다.
		Scanner scan; //아직 object라고 부른다.
		
		System.out.println("console에 출력");
		/*
		 *  선언된 scan object를 인스턴스로 만들어
		 *  메모리에 loading하고 사용할 준비가 된 상태.
		 *  이 때, scan 인스턴스라고 부른다.
		 *  
		 *  new Scanner(Syetem.in) 
		 *  PC 에 연결 된 키보드를 Scanner클래스에게 연결하여
		 *  키보드로부터 데이터(값)을 입력받을 수 있도록 한다.
		 */
		scan = new Scanner(System.in); // scan을 사용해 초기화 시킨 코드이다. 
									   // 즉, 인스턴스라고 한다.
		
		
		String inputStr = new String();
		
		
		inputStr = scan.nextLine(); //nextLine은 scan이라는 class에 선언된 것이다.
		System.out.println("inputStr 값: " + inputStr);
		
		
		
		
		
		
	}

}
