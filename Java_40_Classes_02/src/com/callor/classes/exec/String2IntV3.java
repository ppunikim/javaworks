package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하라 > ");
		String strNum = scan.nextLine();
		
		int intNum = 0;
		try {
			intNum = Integer.valueOf(strNum);
			
			System.out.println("입력할 정수는 : "+ intNum );
			boolean bEven = intNum % 2 == 0;
			if(bEven) {
				System.out.printf("**정수 %d는 짝수 \n", intNum );
			} else {
				System.out.printf("**정수 %d 는 짝수가 아님 \n", intNum );
				
			}//end else
		} catch (Exception e) {
			System.out.println("입력한 문자열을 숫자로 변경할 수 없음");
			System.out.println("빈칸을 입력하지 않은 채로 입력하시오.");
		}// exception handling 이다. 
		 // 즉, exception이 발생할 때 유연하게 대처하는 것이다.
		
	}

}
