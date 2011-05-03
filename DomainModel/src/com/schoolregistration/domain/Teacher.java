package com.schoolregistration.domain;

import java.util.Set;
import java.util.TreeSet;

public class Teacher {
	
	private int teacherID;
	private String teacherFirstName;
	private String teacherLastName;
	private Set<SchoolClass> listOfAssignedClass;
	
	public Teacher(int teacherID, String teacherFirstName,
			String teacherLastName) {
		this.teacherID = teacherID;
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.listOfAssignedClass = new TreeSet<SchoolClass>();
	}

	public int getTeacherID() {
		return teacherID;
	}

	public String getTeacherFirstName() {
		return teacherFirstName;
	}

	public String getTeacherLastName() {
		return teacherLastName;
	}
	
	public Set<SchoolClass> getListOfAssignedClassses() {
		return listOfAssignedClass;
	}
	
	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", teacherFirstName="
				+ teacherFirstName + ", teacherLastName=" + teacherLastName
				+ "]";
	}
	
	

}
