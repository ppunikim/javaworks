package com.callor.todo.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.TodoService;

public class TodoServiceImplV1 implements TodoService{
	
	private final List<TodoVO> todoList;
	
	public TodoServiceImplV1() {
		todoList = new ArrayList<>();
	}
	
	
	/* 
	 * 매개변수로 content(할일) 내용을 전달받아
	 * key, 추가날짜, 시간을 생성한 후, TodoVO에 담고
	 * todoList에 추가하기
	 * 
	 * java에서 날짜, 시간을 취급하는 방법이 여러가지가 있다.
	 * 1.7 이전 : java.util.Date, java.util.Calendar
	 * 1.8 이후 : java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime
	 */
	@Override
	public void todoInsert(String content) {  //현재 날짜와 시간 구하기
		
		//컴퓨터의 현재 날짜, 시각을 읽어오기
		Date curDate = new Date(System.currentTimeMillis());
		
		//Date 객체의 값을 날짜, 시각 문자열 타입으로 변경하기 위한 객체 생성
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 날짜는 대문자 M
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss"); // 시간은 소문자 m
		
		// 현재 날짜, 시간에 해당하는 문자열 생성하기.
		// SimpleDateFormat에 의해 패턴대로 날짜, 시각, 문자열 만든다.
		String today = dateFormat.format(curDate); //문자열을 읽어온다.
		String time = timeFormat.format(curDate); // 문자열을 읽어온다.
		
		/* 
		 *  Data 관련하여 사용되는 KEY, ID값
		 *  Data의 무결성을 보장하기 위해 모든 데이터(레코드 단위, row 단위)는
		 *  데이터를 유일하게 식별(구별)할 수 있는 데이터를 가지고 있어야 한다.
		 *  각 언어, DBMS 등에는 고유의 방법으로 ID를 만들고 관리한다.
		 *  
		 *  Java에서는 java.util.UUID 클래스를 사용하여 범 우주적으로 유일한
		 *  		   ID 값을 생성하는 도구를 제공한다.
		 *     
		 */
		UUID uuid = UUID.randomUUID();  // 고유한 번호를 랜덤으로 만들어준다.
		String idStr = uuid.toString(); // 문자로 된 key를 만들어준다.
		
		TodoVO tVO = TodoVO.builder().tKey(idStr).sDate(today).sTime(time).tContent(content).build();
		todoList.add(tVO);
		
	}//end todoInsert

	@Override
	public List<TodoVO> todoSelectAll() {
		
		return todoList;
	}//end todoSelectAll

	@Override
	public TodoVO findByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}//end findByKey

	@Override
	public void update(TodoVO tVO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTodo(String fileName) {
		// TODO Auto-generated method stub
		
	}
	
	

}//end class
