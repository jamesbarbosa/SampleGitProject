package com.schoolregistration.domain;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddClassToStudent() throws StudentCheckException {
		Student student = new Student(1, "James", "Barbosa", "Makati",
				"855-6721");
		Subject subj = new Subject(1, "CS101", "Java");
		Teacher teacher = new Teacher(1, "James", "Barbosa");
		Schedule sched = new Schedule(1, new Date());
		SchoolClass schoolClass = new SchoolClass(1, subj, teacher, sched);
		student.addClass(schoolClass);
		Set<SchoolClass> setOfClasses = student.getListOfEnrolledClassses();
		assertTrue(setOfClasses.contains(schoolClass));
	}

	@Test (expected = StudentCheckException.class)
	public void testScheduleConflict() throws StudentCheckException {
		Student student = new Student(1, "James", "Barbosa", "Makati",
				"855-6721");
		Subject subj = new Subject(1, "CS101", "Java");
		Teacher teacher = new Teacher(1, "James", "Barbosa");
		Schedule sched = new Schedule(1, new Date());

		SchoolClass schoolClass = new SchoolClass(1, subj, teacher, sched);
	
		student.addClass(schoolClass);
		
		SchoolClass schoolClassConflict = new SchoolClass (2, subj, teacher, sched);
		
		student.addClass(schoolClassConflict);
	}

}
