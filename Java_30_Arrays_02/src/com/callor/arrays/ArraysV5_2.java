package com.callor.arrays;

public class ArraysV5_2 {

	public static void main(String[] args) {
		
		int[] intScore = new int[100]; //배열을 100개 만든다.
		
		for(int i=0; i<intScore.length ; i++) {
			intScore[i] = (int)(Math.random()*100)+1;
		}
		
		/*
		 * intScore배열에 담긴 값을 for()문을 사용하여 
		 * 각 요소별로 한줄로 출력하다가
		 * 5번째 요소를 출력한 후 enter(new line. println())를 하라
		 * i(index) 값을 5로 나눈 나머지가 0이 될 때 println()을 실행하여
		 * 		new line을 부여한다.
		 * 그런데 i값은 0부터 시작한다. 0%5 의 결과는 0이 되어
		 * 						처음 요소를 출력한 후 new line이 되어버린다.
		 * 그래서 i+1을 먼저 실행하여 index % 5의 연산을 1부터 시작하도록 하여준다.
		 */
		for(int i=0; i<intScore.length ; i++) {
			System.out.print(intScore[i]+",\t");
			if( (i+1)%5 == 0 ) { //i가 0~4까지일때 띄어쓰기를 한다는 것인데
								 //그러면 맨 처음에 한개 쓰고 띄어써지니까
								 //i+1 을 한다.
				System.out.println();
			}//end if

		}//end for
		
		}//end main

}

