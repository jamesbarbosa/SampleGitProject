package com.schoolregistration.domain;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private int studentID;
	private String studentFirstName;
	private String studentLastName;
	private String studentAddress;
	private String studentContact;
	private Set<SchoolClass> listOfEnrolledClassses;

	public Student(int studentID, String studentFirstName,
			String studentLastName, String studentAddress, String studentContact) {
		this.studentID = studentID;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentAddress = studentAddress;
		this.studentContact = studentContact;
		this.listOfEnrolledClassses = new HashSet<SchoolClass>();
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	
	
	
	/**
	 * 
	 * @param schoolClass - Add SchoolClass to listOfEnrolledClasses
	 * @throws StudentCheckException
	 */
	
	public void addClass(SchoolClass schoolClass) throws StudentCheckException {
		//TODO PARAMETER VALIDATION!
		
		hasScheduleConflict(schoolClass);
		this.listOfEnrolledClassses.add(schoolClass);
		 
			
	}
	
	/**
	 * 
	 * @param schoolClass - SchoolClass to be validated if has conflict
	 * @throws StudentCheckException
	 */
	
	private void hasScheduleConflict(SchoolClass schoolClass) throws StudentCheckException {
		//TODO  PARAMETER VALIDATION!
		for(SchoolClass klass : this.listOfEnrolledClassses) {
			if(klass.getSchedule().equals(schoolClass.getSchedule())) {
				throw new StudentCheckException(
						"SchoolClass being added has schedule conflict with currently enrolled class. Being added: "
								+ schoolClass
								+ " Currently enrolled with conflict: " + klass);
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentFirstName="
				+ studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentAddress=" + studentAddress + ", studentContact="
				+ studentContact + ", listOfEnrolledClassses="
				+ listOfEnrolledClassses + "]";
	}
}
