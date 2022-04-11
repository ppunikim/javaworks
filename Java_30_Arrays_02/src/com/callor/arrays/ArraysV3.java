package com.callor.arrays;

public class ArraysV3 {
	
	public static void main(String[] args) {
		
		int[] intNums = new int[5];
		int index = 0;
		
		// index 변수값이 0이므로 index[0] 과 같은 코드가 된다.
		// index라는 변수를 사용하여 첨자를 지정하므로, 반복되는 코드가 생성됐고, 
		// 단순한 코드가 생성됐다.
		intNums[index++] = (int)(Math.random()*100)+1;
		intNums[index++] = (int)(Math.random()*100)+1;
		intNums[index++] = (int)(Math.random()*100)+1;
		intNums[index++] = (int)(Math.random()*100)+1;
		intNums[index++] = (int)(Math.random()*100)+1;
		
		//index 값을 0부터 1씩 증가시키면서 5미만 동안 블럭에 코드를 실행한다.
		for(index=0; index<5; index++ ) {
			intNums[index] = (int)(Math.random()*100)+1;
		}//end for
		
		//100 의 점수를 저장할 배열 생성
		int[] intScore = new int[100];
		// 100개의 배열에 각 1~100까지 점수를 생성하여 저장, 테스트에 사용할 데이터 만듦.
		for(index = 0; index < 100 ; index++) {
			intScore[index] = (int)(Math.random()*100)+1;
		}
		
		/*
		 * 위 코드에서 만약 데이터 갯수를 200으로 변경(new int[200]) 했을 때
		 * for()명령문의 index < 100 을 index < 200으로 변경해줘야 한다.
		 * 만약 for() 명령문의 코드를 변경하지 않으면 테스트 데이터의 개수를 
		 * 											  늘린 효과가 없어진다.
		 * 배열의 갯수를 변경할때 마다 코드를 추가로 변경하는 불편을 없에기 위해
		 * java 에서는 배열의 크기와 관련된 내부속성을 마련해 두었다.
		 *
		 */
		/*
		 * 배열.length 속성은 배열의 개수를 담고있는 특별한 변수이다.
		 * 배열.length는 배열을 생성하면 배열의 개수를 보관하도록 자동으로 
		 * 							만들어지는 특별한 변수이다.
		 * 
		 * 참고로 
		 * 배열.toString() : 배열의 메서드
		 * 배열.length : 배열의 속성
		 */
		for(index=0; index < intScore.length ; index++) {
			intScore[index]=  (int)(Math.random()*100)+1;
		}//end for
		
		int intSum = intScore[0];
		intSum += intScore[1];
		intSum += intScore[2];
		System.out.println(intSum);
		
		
		intSum = 0;
		System.out.println("=======================");
		
		//문제 1번
		// intScore 배열의 0번부터 intScore.length -1  번까지 의 점수를
		// 모두 합산하여 intSum에 담고, console에 출력
		//int[] intScore = new int[100];
		//intScore은 100층짜리 건물이다.
		for(index=0 ; index<intScore.length ; index++ ) {
			intSum += intScore[index];
		}//end for
		System.out.println("총합 : "+ intSum);
		
		System.out.println("=======================");
		//문제 2번
		//평균을 계산하여 console에 출력
		System.out.println(" 평균 : "+ intSum/intScore.length);
		
		
		//평균 결과를 소수점까지 표현하고 싶으면 원 데이터를 먼저 실수형으로
		//강제 형 변환 후 연산을 하고 결과를 실수형 변수에 저장하면 된다.
		float floatAvg = (float)intSum / (float)intScore.length;
		System.out.println(floatAvg);
		
		
	}//end main
}
