package com.callor.score.domain;

public class ScoreV2VO extends Object {
	
	private String stName; 
	private int intKor;    
	private int intEng;
	private int intMath;
	private int intSum; // = 0;
	private float fAvg;
	
	//마우스 우클릭, source, getter and setter 눌러서 select all 하고 finish하면 자동생성된다.
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
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
	
	
	public int getIntSum() {
		
		intSum = intKor;
		intSum += intEng;
		intSum += intMath;
		return intSum;
	}
	public float getfAvg() {
		
		fAvg = (float)getIntSum() / 3.0f;
		return fAvg;
	}
	// toString을 Override해서 내가 필요한 것으로 만들었다.
	@Override   //상속을 해서 내가 필요한 값으로 재정의해준 것이다.
	public String toString() {
		return "ScoreV2VO [stName=" + stName 
							+ ", intKor=" + intKor 
							+ ", intEng=" + intEng 
							+ ", intMath=" + intMath
							+ ", intSum=" + getIntSum()
							+ ", fAvg=" + getfAvg()
							+ "]";
	}
	
	
	
	
	
	
	
}//end class
