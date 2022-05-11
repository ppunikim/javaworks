package com.callor.app.exec.model;

/*
 * 성적처리를 하기 위해 반드시 필요한 데이터
 * 학번, 국어, 영어, 수학
 * 출력 결과를 보기위해서 총점과 평균도 있으면 좋겠다.
 * 좀 더 확장을 해서 학생의 석차 항목도 있으면 좋겠다.
 */
public class ScoreVO {
	private int stNum;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float fAvg;
	private int intRank;
	// 0으로 초기화하지 않아도 자동으로 된다.
	
	public int getIntSum() {
		intSum = intKor + intEng + intMath;
		return intSum;
	}

	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}

	public float getfAvg() {
		return fAvg = (float)intSum / 3;
	}

	public void setfAvg(float fAvg) {
		this.fAvg = fAvg;
	}

	public int getIntRank() {
		return intRank;
	}

	public void setIntRank(int intRank) {
		this.intRank = intRank;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}

	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		String scStr = String.format("%5d\t", stNum);
		scStr += String.format("%5d\t",intKor);
		scStr += String.format("%5d\t",intEng);
		scStr += String.format("%5d\t",intMath);
		scStr += String.format("%5d\t",getIntSum());
		scStr += String.format("%5.2f\n",getfAvg());
		return scStr;
	}
	
	

}
