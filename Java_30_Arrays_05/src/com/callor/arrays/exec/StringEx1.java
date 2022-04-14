package com.callor.arrays.exec;

import com.callor.arrays.utils.Line;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		/*
		 * 문자열 형 변수는 숫자형, boolean형 변수와 저장 방식이 다르다.
		 * 때문에 문자열형 변수에 저장된 문자열을 EQ(==) 비교를 하는 
		 * 것은 매우 위험한 코드가 될 수 있다.
		 * 
		 * 문자열형 변수는 절대 EQ(==)또는 Not EQ(!=)  를 사용하여 비교x.
		 */
		String strNation = "KOREA";
		System.out.println(strNation == "KOREA");
		
		String strName = new String("둘리");
		System.out.println(strName);
		System.out.println(strName == "둘리");
		
		// method를 이용하여 같은지 물어봐야 한다.
		System.out.println(strNation.equals("KOREA"));
		System.out.println(strName.equals("둘리"));
		
		boolean bYes = strNation.equals("KOREA");
		if(bYes) {
			//큰따옴표 안에 큰따옴표를 또 사용할 수 없으므로 \"를 사용한다.
			System.out.println("strNation 변수에는 \"korea\"가 담겨있다.");
		}
		bYes = strName.equals("둘리");
		
		strNation = "Republic Of Korea";
		bYes = strNation.equals("republic of korea");
		
		String upString = strNation.toUpperCase();
		bYes = upString.equals("REPUBLIC OF KOREA");
		// 아래의 코드를 한 문장의 명령문으로 완성하기
		
		// strNation 에 있는 값을 대문자로 바꿔 뒤 값과 비교하라.
		// . . 으로 이어져 있는 것을 method Chaining으로 부른다.
		bYes = strNation.toUpperCase().equals("REPUBLIC OF KOREA");
		bYes = strNation.toLowerCase().equals("republic of korea");
		System.out.println(Line.dLine(20));
		
		// 대소문자 무시하고 문자열 비교해라.
		// 단, 띄어쓰기는 무시하지 않는다.
		// 위의 것들보다 훨씬 쓰기 편하다.
		bYes = strNation.equalsIgnoreCase("rePUblic oF KoreA");
		System.out.println(bYes);
				
		
	}//end main

}//end class
