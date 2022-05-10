package com.callor.todo.service;

import java.util.List;

import com.callor.todo.model.TodoVO;

public interface TodoService {
	
	// TODO 추가
	public void todoInsert(String content);
	
	// 전체 TodoList 조회하기
	public List<TodoVO> todoSelectAll();
	
	// key값으로 1개의 TodoList 조회하기
	public TodoVO findByKey(String key);
	
	// Todo내용 변경하기
	// 할 일을 완료했을 때 사용할 method
	public void update(TodoVO tVO);
	
	// TodoList 내용을 파일에 저장하기
	public void saveTodo(String fileName);

}//end interface
