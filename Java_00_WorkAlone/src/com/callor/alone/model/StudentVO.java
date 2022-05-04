package com.callor.alone.model;

public class StudentVO {
	
	private String stNum;
	private String stName;
	private String stGrade;
	private String stDept;
	private String stAddr;
	
	public StudentVO() {
	}
	public StudentVO(String stNum, String stName, String stGrade, String stDept, String stAddr) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stGrade = stGrade;
		this.stDept = stDept;
		this.stAddr = stAddr;
	}
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public String getStDept() {
		return stDept;
	}
	public void setStDept(String stDept) {
		this.stDept = stDept;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	
	
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stGrade=" + stGrade + ", stDept=" + stDept
				+ ", stAddr=" + stAddr + ", getStNum()=" + getStNum() + ", getStName()=" + getStName()
				+ ", getStGrade()=" + getStGrade() + ", getStDept()=" + getStDept() + ", getStAddr()=" + getStAddr()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
