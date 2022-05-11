package com.callor.classes.service;

import java.util.Scanner;

import com.callor.classes.utils.Line;

public class ScoreServiceV1 {

	protected String[] student;
	protected int[] intKor;
	protected Scanner scan;
	protected int lineLength;

	public ScoreServiceV1() {
		this(10);
	}// end 생성자

	public ScoreServiceV1(int length) {
		student = new String[length];
		intKor = new int[length];
		scan = new Scanner(System.in);
		lineLength = 50;
	}// end 임의생성자

	public int input() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("대한 고교 성적처리 V2");
		System.out.println(Line.sLine(lineLength));
		int index = 0;
		while (index < student.length) {
			System.out.print("이름(END:중단) >> ");
			String strName = scan.nextLine();
			if (strName.equals("END")) {
				break;
			}
			System.out.print("점수(정수로, END:중단) >> ");
			String strKor = scan.nextLine();
			if (strKor.equals("END")) {
				break;
			}

			int intScore = 0;
			try {
				intScore = Integer.valueOf(strKor);
				student[index] = strName;
				intKor[index] = intScore;
				index++;
				System.out.println( "\t이름 = " + strName );
				System.out.println( "\t국어점수 = " + intScore );
			} catch (Exception e) {
				System.out.println("입력 도중에 오류 발생!!");
			}

		} // end while
		
		if(index < student.length) { // 도중 end 입력한 것
			return -1;
		} else {
			System.out.println();
			System.out.println("입력 처리 끝!");
			System.out.println(Line.dLine(lineLength));
			return 0;
		}
		
	}// end input()

}// end class
