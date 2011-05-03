package com.schoolregistration.domain;

import java.util.Set;
import java.util.TreeSet;


public class SchoolClass {
	
	private int schoolClassID;
	private Subject subject;
	private Teacher teacher;
	private Schedule schedule;
	private Set<StudentTest> listOfStudents;
	
	public SchoolClass(int schoolClassID, Subject subject, Teacher teacher,
			Schedule schedule) {
		super();
		this.schoolClassID = schoolClassID;
		this.subject = subject;
		this.teacher = teacher;
		this.schedule = schedule;
		this.listOfStudents = new TreeSet<StudentTest>();
	}
	
	public int getSchoolClassID() {
		return schoolClassID;
	}


	public Subject getSubject() {
		return subject;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public Schedule getSchedule() {
		return schedule;
	}
	
	public Set<StudentTest> getListOfStudents() {
		return listOfStudents;
	}
	
	@Override
	public String toString() {
		return "SchoolClass [schoolClassID=" + schoolClassID + ", subject="
				+ subject + ", teacher=" + teacher + ", schedule=" + schedule
				+ "]";
	}

	
	

}
