package com.callor.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScoreVO2 {
	
	protected int stNum;
	protected int intKor;
	protected int intEng;
	protected int intMath;
	protected int intSum;
	protected float fAvg;
	
	// TODO 객체지향적인 코드이다.
	public int getIntSum() {
		int intSum = intKor + intEng + intMath; 
		return intSum;
	} 
	
	public float getFAvg() {
		return (float)getIntSum() / 3;
	}
	
	@Override
	public String toString() {
		/* String 문자열 변수 = "대한민국"
		 *	문자열 변수 += "문자열" 
		 *
		 *	와 같은 코드는 문자열 변수가 관리하는 메모리 구조상
		 *  메모리 낭비와 속도에 이슈가 있다고 함
		 *  
		 *  그래서 뮨자열을 여러변 결합하는(+=) 코드는
		 *  StringBuilder 또는 StringBuffer라는 클래스를 사용하도록 한다. 
		 */
		StringBuilder retStr = new StringBuilder();
		retStr.append(String.format("%5d\t",stNum));
		retStr.append(String.format("%5d\t",intKor));
		retStr.append(String.format("%5d\t",intEng));
		retStr.append(String.format("%5d\t",intMath));
		retStr.append(String.format("%5d\t",getIntSum()));
		retStr.append(String.format("%5.2f\t",getFAvg()));
		return retStr.toString(); // 다시 문자열로 바꿔서 출력한다. 번거로움.
	}

}//end class
