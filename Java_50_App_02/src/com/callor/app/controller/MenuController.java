package com.callor.app.controller;

import java.util.Scanner;

import com.callor.app.utils.Line;

public class MenuController {
	
	private final int lineLength;
	private final Scanner scan;
	public MenuController() {
		lineLength = 50;
		scan = new Scanner(System.in);
	}

	public void viewMainMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("햇살고교 학사관리 2022");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. 학생정보 관리 ");
		System.out.println("2. 성적정보 관리 ");
		System.out.println("QUIT : 업무 종료");
		System.out.println(Line.sLine(lineLength));
		System.out.print("업무를 선택하세요 >> ");
	}//end viewMenu
	
	public void viewStMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("학생정보 관리");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. 학생정보 Loading");
		System.out.println("2. 학생정보 전체보기");
		System.out.println("3. 학번으로 검색하기");
		System.out.println("4. 이름으로 검색하기");
		System.out.println("QUIT : Main Menu로 가기");
		System.out.println(Line.sLine(lineLength));
		System.out.print("업무 선택 >> ");
	}//end viewStMenu
	
	public void viewScMenu() {
		System.out.println(Line.dLine(lineLength));
		System.out.println("성적정보 관리");
		System.out.println(Line.sLine(lineLength));
		System.out.println("1. 성적 파일 Loading");
		System.out.println("2. 전체 성적 리스트 보기");
		System.out.println("3. 학번으로 검색하기");
		System.out.println("4. 이름으로 검색하기");
		System.out.println("QUIT : Main Menu로 가기");
		System.out.println(Line.sLine(lineLength));
		System.out.print("업무 선택 >> ");
	}//end viewScMenu
	
	public Integer selectMenu() {
		
		String strKey = scan.nextLine();
		if(strKey.equals("QUIT")) {
			return -1;
		}
		
		Integer intKey = 0;
		try {
			intKey = Integer.valueOf(strKey);
		} catch (Exception e) {
			return null;
		}
		return intKey;
		
	}//end selectMenu
	
	
}//end class













