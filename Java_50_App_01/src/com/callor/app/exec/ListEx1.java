package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		
		/*
		 * List(ArrayList)
		 * : java에서 배열을 대신해 사용되는 자료형
		 * : 여러가지 자료형 중, 가장 많이 사용되는 구조
		 * List = interface
		 * ArrayList = 구현클래스(interface를 상속받은 class)
		 */
		List<Integer> intList = new ArrayList<>();
		
		/* 구현 클래스 만으로 객체를 선언하고 생성하는 코드를
		 * 사용할 수는 있지만, interface가 있는 경우는 
		 * interface를 사용하여 객체를 선언하는 것이 좋다.
		 * 이유는, 이 코드는 결합도가 높아서 나중에 문제가 될 수 있다. 
		 */
		ArrayList<String> strList = new ArrayList<>();
		
		/* List형의 자료는 저장(추가)할 데이터의 type을 
		 * Generic(제네릭)으로 설정한다.
		 * Generic 으로 설정할 수 있는 type은 
		 * 반드시 class type이어야 한다.
		 * primitive(기본) type은 Generic으로 설정할 수 없다. 
		 *  primitive = 기본형으로 선언한 변수들 즉, int num = 100;
		 *  Generic = <> 로 돼있는 것들
		 */
		List<Float> floatList = new ArrayList<>();
		
		
	}//end main
}//end class
