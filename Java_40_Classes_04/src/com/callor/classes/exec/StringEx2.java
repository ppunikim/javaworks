package com.callor.classes.exec;

public class StringEx2 {
	public static void main(String[] args) {
		
		String strText = "뿌니,78,33,98";
		
		String[] names = { "뿌니","길동","둘리"  };
		String[] items = strText.split(","); // ,를 기준으로 문자열을 나눈다.
		for(int i=0; i< items.length; i++) {
			System.out.println(items[i]);
		}
				
		
		
	}//end main

}// end class
