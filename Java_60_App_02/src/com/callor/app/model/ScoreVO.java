package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class ScoreVO {
	
	private String stName; // 학생(st)이름(name)
	private int stKor;
	private int stEng;
	private int stMath;
	
	// private int stSum;
	// private int stAvg;
	
	/*필드 변수와 관계없이 총점을 계산하여
	return 하는 method 정의하기.
	객체지향에서 이러한 별개의 method를 메세지 라고 한다.
	*/
	public int getIntSum() {
		int sum = stKor + stEng + stMath;
		return sum;
	}//end getIntSum
	
	/* getAvg method를 호출하면 세 과목 평균 계산해
	 * return 한다.
	 */
	public float getAvg() {
		int sum = getIntSum();
		Float avg = (float)sum / 3;
		return avg;
	}//end getAvg
	
	
	public String toString() {
		String result = "";
		result += String.format("%-10s\t",stName);  // "-10" 하면 왼쪽 정렬로 10자리 공간을 만든다.
		result += String.format("%5d \t",stKor);
		result += String.format("%5d \t",stEng);
		result += String.format("%5d \t",stMath);
		
		result += String.format("%5d \t",getIntSum());
		result += String.format("%5.2f \t",getAvg());
		
		return result;
	}//end toString
	
	

}
