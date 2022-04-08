package com.callor.arrays.service;

public class ServiceV3 {
	
	int[] intKor; //신축 아파트에 이름만 붙인 것
	// 생성자 메소드 선언문
	int[] intEng;
	
	/*
	 * ServiveV3 클래스의 생성자 method.
	 * return type이 아무것도 없다.
	 * method이름이 클래스 이름과 같다.(첫글자 대문자)
	 * 클래스를 선언하면 자동으로 생성되나, 코드는 보이지 않는다.
	 * 
	 * 
	 * (만약 My() 과 같은 코드를 만나면 My클래스 생성자 method라고 부른다.)
	 * 
	 * 여기에서는 ServiceV3() 생성자 method코드를 선언할 것이다. 그 이유는 ?
	 * 생성자 method에 intKor 배열을 생성하는 코드를 추가한다.
	 * 
	 * 생성자 method는 class를 사용하여 instance를 생성할 때 반드시 의무적으로 호출해야
	 * 하는 method이다. 이 method에 배열을 생성하는 코드를 추가하면 자동으로 intKor 배열이
	 * 사용할 준비가 된다.
	 * 
	 * 어떤 클래스를 사용하는데 꼭 필요한 변수가 있다 할 때, 그 변수의 초기화 생성clear
	 * 필요한 값 저장하는 코드를 생성자에 주로 포함한다.
	 * 
	 */
	public ServiceV3() { //이곳에서 분양을 한다.
		intKor = new int[10]; //인스턴스를 만들때 무조건 호출해야 한다.
		intEng = new int[10]; //신축아파트를 몇층으로 만들 것인지 정하는 단계로 중요한 단계.
		intKor[3] = 100; 
		intEng[3] = 30; // 3층 분양자 이름 설정
	}
	
	public void viewKor3 () {
		System.out.println(intKor[3]);
	}
	
	public void viewEng3 () {
		System.out.println(intEng[3]);
	}

}
