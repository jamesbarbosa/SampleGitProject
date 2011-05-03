package com.schoolregistration.domain;

public class Subject {

	private int subjectID;
	private String subjectName;
	private String subjectDesc;
	
	public Subject(int subjectID, String subjectName, String subjectDesc) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.subjectDesc = subjectDesc;
	}
	
	public int getSubjectID() {
		return subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public String getSubjectDesc() {
		return subjectDesc;
	}
	
	
	
	@Override
	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectName="
				+ subjectName + ", subjectDesc=" + subjectDesc + "]";
	}
	
	
	
}
