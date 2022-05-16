package com.callor.app.exec;

public class Exec06 {
	public static void main(String[] args) {
		
		int[] nums = new int[100];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = (int)(Math.random() * 91 ) + 10;
		} // nums 배열에는 10부터 101까지의 값이 들어있다. 
		for(int j = 0; j < nums.length; j ++ ) { 		// j는 0부터 100개의 배열 까지
			int index = 0;
			for(index = 2; index < nums[j]; index ++) {  // j는 2부터 100개 배열 까지
				if(nums[j] % index == 0) {						//배열에 들어있는 값을 2부터 자기자신 전까지 나눴을 때 0이면 소수가 아니다. 
					break;
				}
			}//end for(index)
			
			if( nums[j] <= index ) {
				System.out.println(nums[j] + "는 소수");
			}
		}//end for(j)
		
		
		
	}//end main
}
