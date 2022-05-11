package com.callor.todo.controller;

import java.util.List;

import com.callor.todo.model.TodoVO;
import com.callor.todo.service.InputService;
import com.callor.todo.service.TodoService;
import com.callor.todo.service.impl.InputServiceImplV1;
import com.callor.todo.service.impl.TodoServiceImplV1;

public class TodoControllerV11 {
	public static void main(String[] args) {
		
		TodoService toService = new TodoServiceImplV1();
		InputService inService = new InputServiceImplV1();
		
		while(true) {
			Integer menu = inService.menu();
			
			if(menu == null) {
				System.out.println("빈칸 쫌 넣지마라");
				continue;
			} 
			if(menu == 5) {
				break;
			} else if(menu == 1) {
				String content = inService.inputContent();
				toService.todoInsert(content);
			} else if(menu == 2) {
				List<TodoVO> todoList = toService.todoSelectAll();
				for(TodoVO vo: todoList) {
					System.out.println(vo.toString());
				}
			}
			
			
			
		}//end while
		System.out.println("드디 어 업무 끝~  즐거운 퇴근시간");
		
		
		
	}//end main
}//end class
