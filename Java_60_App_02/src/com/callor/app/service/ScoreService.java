package com.callor.app.service;

/* 클래스의 한 종류 이지만
 * 모든 메서드에 구현체가 없는 상태, 
 * 즉 설계도(prototype; return type + 매개변수 이름) 역할이다.
 * 그래서 method의 이름만 정의된 상태이다.
 */
public interface ScoreService {
	
	public void inputScore();
	public void saveScore();
}
