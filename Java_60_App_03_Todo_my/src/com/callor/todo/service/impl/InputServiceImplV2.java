package com.callor.todo.service.impl;

import com.callor.utils.Line;

public class InputServiceImplV2 extends InputServiceImplV1{

	/*
	 * V1클래스의 생성자를 호출하여
	 * Scan을 초기화 실행
	 */
	public InputServiceImplV2() {
		super();
	}//end 기본생성자
	
	@Override
	public String inputContent() {

		System.out.print("할 일(QUIT : 종료) >> ");
		String content = scan.nextLine();
		return content;
	}//end inputContent
	
	
	@Override
	public Integer selectTodo() {
		System.out.println(Line.dLine(50));
		System.out.print("할 일 선택(QUIT: 종료) ");
		String selectNum = scan.nextLine();
		Integer intNum = 0;
		
		if(selectNum.equals("QUIT")) return -1;
		
		try {
			intNum = Integer.valueOf(selectNum);
		} catch (Exception e) {
			return null;
		}
		return intNum;
	}//end selectTodo

}//end class
