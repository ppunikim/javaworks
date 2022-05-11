package com.callor.controller;

public class Boolean_03 {
	
		public static void main(String[] args) {
			
			boolean bYes = true;
			boolean bWhat = bYes;
			
			//bYes에 저장된 값이 false 인지 물어보는 연산이 실행되고, 그, 결과는 bWhat에 저장된다.
			bWhat = bYes == false;
			System.out.println(bWhat);
			
			//bYes에 저장된 값이 true가 아니냐? 물어보는 연산 실행, 결과는 당연히 false
			bWhat = bYes != true;
			System.out.println(bWhat);
			// ! : not 연산기호로, boolean형 데이터를 반전시키는 연산. 
			// true가 담겨있으면 false로, false가 담겨있으면 true로 바꾸기
			bWhat = !bYes;
			
			// !(not연산자)를 사용하여 변수값을 true, false가 반복되도록 하는 명령문들
			bWhat = !bWhat;
			bWhat = !bWhat;
		
		}

}
