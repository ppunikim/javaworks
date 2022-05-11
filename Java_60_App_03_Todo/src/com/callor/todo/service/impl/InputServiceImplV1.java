package com.callor.todo.service.impl;

import java.util.Scanner;

import com.callor.todo.service.InputService;
import com.callor.utils.Line;

public class InputServiceImplV1 implements InputService{

	protected final Scanner scan; //입력받을 sanner 
	
	public InputServiceImplV1() {
		scan = new Scanner(System.in);
	}//end 기본생성자
	
	
	@Override
	public Integer menu() {
		System.out.println(Line.dLine(50));
		System.out.println("업무를 선택하세요");
		System.out.println(Line.sLine(50));
		System.out.println("1. TODO 추가하기");
		System.out.println("2. TODO List로 보기");
		System.out.println("3. key 로 검색하기");
		System.out.println("4. 완료 처리하기");
		System.out.println("5. 종료하기");
		System.out.println(Line.sLine(50));
		System.out.print("선택 >> ");
		String strMenu = scan.nextLine();
		Integer intMenu = 0;
		
		try {
			intMenu = Integer.valueOf(strMenu);
		} catch (Exception e) {
			return null;
		}
		return intMenu;
	}

	@Override
	public String inputContent() {
		System.out.print("할 일 >> ");
		String content = scan.nextLine();
		return content;
	}


	@Override
	public Integer selectTodo() {
		// TODO Auto-generated method stub
		return null;
	}

}//end class