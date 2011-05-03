package com.schoolregistration.domain;


import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Student2Test {
	Student2 stud;
	@Before
	public void setUp() throws Exception {
		stud = new Student2(1, "James","Barbosa","QC","0918-212-888");
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void TestAddClassToStudent() throws StudentCheckException {
		
		Subject subj = new Subject(1,"CS101","Java Fundamentals");
		Teacher teacher = new Teacher(1,"James","Barbosa");
		Schedule schedule = new Schedule(1, new Date());
		SchoolClass sc = new SchoolClass(1, subj , teacher, schedule);
		
		//Set<SchoolClass> listOfClasses = new HashSet<SchoolClass>();
		stud.addClassToStudent(sc);
		
		assertTrue(stud.getListOfEnrolledClassses().contains(sc));
		
		
	}
	
	@Test (expected = StudentCheckException.class)
	public void HasConflictWithSchedule() throws StudentCheckException {
		
		Subject subj = new Subject(1,"CS101","Java Fundamentals");
		Teacher teacher = new Teacher(1,"James","Barbosa");
		Schedule schedule = new Schedule(1, new Date());
		SchoolClass sc = new SchoolClass(1, subj , teacher, schedule);
		SchoolClass sc2 = new SchoolClass(2,subj,teacher,schedule);
		//Set<SchoolClass> listOfClasses = stud.getListOfEnrolledClassses();
		
		stud.addClassToStudent(sc);
		stud.addClassToStudent(sc2);
		
		
		 
		
	}



	

}
