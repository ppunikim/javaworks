package com.callor.app.exec;

public class Exec4 {
	
	 public static void main(String[] args) {
		
		 int num = (int)(Math.random()*100)+1;
		 
		 if(num < 2) {
			 System.out.printf("1. %d 는 소수가 아니다.\n", num);
			 return;
		 } 
		 if (num == 2 ){
			 System.out.printf("2. %d 는 소수이다.\n", num);
			 return;
		 } 
		 
		 for( int i =2 ; i< num ; i++ ) {
			 if( num % i == 0) {
				 System.out.printf("3. %d 는 소수가 아니다.\n", num);
				 return;
			 }
		 }//end for
		 
		 System.out.printf("4. %d는 소수이다.", num);
		 
	}//end main

}
