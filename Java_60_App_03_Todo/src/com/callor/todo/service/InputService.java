package com.callor.todo.service;

/*
 * Scanner를 이용해 keybord에서 
 * 입력받는 일을 대신 수행 할 클래스 정의
 */
public interface InputService {

	public Integer menu();
	public String inputContent(); //컨텐트 입력받을 것
	public Integer selectTodo();
	
}
