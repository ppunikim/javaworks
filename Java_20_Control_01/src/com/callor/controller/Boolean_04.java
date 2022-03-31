package com.callor.controller;

public class Boolean_04 {
		public static void main(String[] args) {
			
			boolean bYes1 = true;
			boolean bYes2 = true;
			
			int intNum1 = 33;
			int intNum2 = 55;
			
			bYes1 = intNum1 == intNum2; // false
			bYes2 = intNum1 < intNum2; // true
			
			/*
			 *  || :boolean데이터의 OR연산
			 *  && :boolean데이터의 AND연산
			 */
			boolean bWhat = bYes1 || bYes2;
			bWhat = bYes1 && bYes2;
			
			
			if(bYes1 || bYes2) {
				System.out.println(intNum1
								  + "가 "
								  + intNum2
								  + "보다 작거나 같다.");
			} 
		
			bWhat = !(bYes1 || bYes2);
			System.out.println(bWhat);
			
			bWhat = !(bYes1 && bYes2);
			System.out.println(bWhat);
		
		
		
		}
}
