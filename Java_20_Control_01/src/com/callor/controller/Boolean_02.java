package com.callor.controller;

public class Boolean_02 {
	
	public static void main(String[] args) {
		
		boolean bYes = true;
		
		//bYes에저장된 값을 출력
		System.out.println(bYes);
		
		//bYes에 저장된 값이 true인지 비교연산하여 결과를 출력
		System.out.println(bYes == true);
		
		boolean bWhat = bYes; //다른값가져오기
		bWhat = bYes == true; //직접담기
		bWhat = bYes(); //명령실행해 담기
		
	} // end main()

	
	public static boolean bYes() {
		return true;
	}
	
	
	
}
