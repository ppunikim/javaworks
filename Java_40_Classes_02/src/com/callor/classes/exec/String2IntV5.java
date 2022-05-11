package com.callor.classes.exec;

import java.util.Scanner;

public class String2IntV5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while(true) {

			System.out.printf("정수입력(END:종료) > ");
			String strNum = scan.nextLine();
			if(strNum.equals("END")) {
				break;
			}
			
			int intNum = 0;
			try {
				intNum = Integer.valueOf(strNum);
				boolean bEven = intNum % 2 == 0;
				if (bEven) {
					System.out.println(intNum + "는 짝수이다.");
				} else {
					System.out.println(intNum + "는 짝수가 아니다.");
				}
			} catch (Exception e) {
				System.out.println("입력한 \"" + strNum + "\" 는 숫자로 변경불가!");
			}
		} // end while
		System.out.println("GAME OVER");
	}// end main

}// end class
