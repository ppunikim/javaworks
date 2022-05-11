package com.callor.classes.exec;

public class String2IntV2 {
	
	public static void main(String[] args) {
		
		String strNum = "";
		int intNum = 0;
		if(strNum.equals("")) {
			System.out.println("숫자로 변환 불가");
		} else {
			intNum = Integer.valueOf(strNum);
			
		}//end else
		
		/*
		 * 만약 키보드 등을 사용하여 값을 입력할 경우
		 * 은연중에 빈칸(space bar)을 눌러서 white space가 담기는 
		 * 경우가 발생할 것이다.
		 * 빈칸을 한번 ~ 여러번 입력한다면 그 경우의 수를 if문으로 만들 수 없음
		 */
		if(strNum.equals("   ")) {
			System.out.println("space는 숫자변환 불가능");
		} else {
			intNum = Integer.valueOf(strNum);
		}// end else
		
	}

}
