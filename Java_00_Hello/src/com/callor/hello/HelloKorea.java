/* 
 * 현재 생성된 HelloKorea 클래스는 
 * com.callor.hello폴더에 저장되어있다는 표식
 * 현재 생성한 클래스가 저장된 base package다. 라고 한다.
 * 
 * */

/*
 * 빨간글씨는 명령(단)어로, key world(reserved word)이다.
 * -> package, public, class, static, void 
 *   *  */

package com.callor.hello;

//지금 작성하는 소스코드는 HelloKorea.java 파일이다.
//HelloKorea/java를 클래스파일 또는 자바소스코드라고 한다.
public class HelloKorea {
	
	public static void main(String[] args) {
		//main 키워드 Ctrl+Space = 상용구 작성
		
		System.out.println("반갑습니다.");
		// ""로 묶어있으면 문자열 이라고 불린다.
	    System.out.println(30+20);
	    System.out.println(30-20);
	    // 숫자가 있으면 연산  이라고 불린다.
	    System.out.println(30*20);
	    System.out.println(30/20);
	    System.out.println(30%20);
		
	    System.out.println("30 + 40 =" + (30+40));  //1번
	    System.out.println("30 + 40 =" + "70");     //2번  
	    //1번 줄은 컴파일하면서 2번 줄로 바뀐다.
	    
	    System.out.println("대한" + "민국" + "만세"); 
	    //문자열 덧셈 연산 : 문자열 + 문자열은 문자열 (cpu에서)연결해 결과를 만든다.
	}
}
