package com.schoolregistration.domain;

import java.util.HashSet;
import java.util.Set;

public class Student2 {

	private int studentID;
	private String studentFirstName;
	private String studentLastName;
	private String studentAddress;
	private String studentContact;
	private Set<SchoolClass> listOfEnrolledClassses;

	public Student2(int studentID, String studentFirstName,
			String studentLastName, String studentAddress, String studentContact) {
		this.studentID = studentID;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAddress = studentAddress;
		this.studentContact = studentContact;
		this.listOfEnrolledClassses = new HashSet<SchoolClass>();
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public String getStudentContact() {
		return studentContact;
	}

	public Set<SchoolClass> getListOfEnrolledClassses() {
		return listOfEnrolledClassses;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentFirstName="
				+ studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentAddress=" + studentAddress + ", studentContact="
				+ studentContact + ", listOfEnrolledClassses="
				+ listOfEnrolledClassses + "]";
	}

	public void addClassToStudent(SchoolClass sc) throws StudentCheckException {
		isSchoolClassHasConflict(sc);
		this.listOfEnrolledClassses.add(sc);
		
	}

	private void isSchoolClassHasConflict(SchoolClass sc2) throws StudentCheckException {
		for(SchoolClass klass : this.listOfEnrolledClassses) {
			if(klass.getSchedule().equals(sc2.getSchedule())) {
				throw new StudentCheckException(sc2.getSchedule().toString() + " has conflict!");
			}
		}
	}

}
