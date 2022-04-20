package com.callor.classes.exec;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String strNation = "대한민국만세";
		System.out.println(strNation);
		
		String strName = new String("둘리");
		System.out.println(strName);
		
		String strNo1 = strNation.substring(3); //일부 문자열만 추출할 때 사용
		System.out.println(strNo1);
		String strNo2 = strNation.substring(3, 4); // 시작 끝점 잘라지는 부분 신경쓰기
		System.out.println(strNo2);
		System.out.println();
		for(int i=0; i< strNation.length() ; i++) {
			System.out.println(strNation.substring(i));
		}//end for
		System.out.println();
		for(int i=0; i < strNation.length(); i++) {
			System.out.println(strNation.substring(i,i+1));
		}
		System.out.println(strNation); // 이 코드가 내부에서는 
		for(int i=0; i < strNation.length(); i++) {          //이렇게
			System.out.print(strNation.substring(i,i+1));    //작동
		}                                                    //한
		System.out.println();                                //다.
		
		int[] intNum = new int[10];
		for(int i=0; i< intNum.length; i++) { //length 는 변수(속성)
												// 즉, 10이라는 값을 가진다.
			System.out.print(intNum[i]);
		}
		System.out.println();
		
		
		String str1 = "0123456789";
		/* str1.length() 메서드는 문자열의 길이를 계산하는 method이다.
		 * for() 반복문이 문자열의 길이만큼 반복되서 실행할 때 
		 * 계속해서 문자열의 길이를 계산하는 코드가 실행된다.
		 */
		for(int i=0; i < str1.length(); i++) {  //length 는 메서드
												// method를 10번 호출한다.
			System.out.print(str1.substring(i,i+1));   
		}                                              
		System.out.println();      
		
		/*
		 * for 반복문이 실행되기 전에 문자열의 개수를 계산하여 
		 * return 하는 length()메서드를 호출하고
		 * 결과를 변수에 담자.
		 * 이제는 문자열의 길이를 계산하는 코드는 한번만 실행하고
		 * 문자열의 길이만큼 for()반복문을 수행할 수 있게 되었다.
		 * 상당히 많은 코드 실행이 없어서 효율적인 코드가 된다.
		 */
		int strLength = str1.length();
		for(int i=0; i < strLength ; i++) { 
			System.out.print(str1.substring(i,i+1));   
		}                                              
		
		
		
		
	}//end main
	

}//end class
