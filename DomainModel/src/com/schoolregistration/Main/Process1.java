package com.schoolregistration.Main;


public class Process1 extends Thread {
	
		@Override
		public void run() {
			try {
				while(true) {
				Thread.sleep(1000L);
				//Increment
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}
	
	class process2 extends Thread {
		
	}
	
	

}




//Subject subj = new Subject(1 , "CS101","Java");
//Teacher teacher = new Teacher(1, "James", "Barbosa");
//Schedule sched = new Schedule(1, new Date());
//
//SchoolClass klass = new SchoolClass(1, subj , teacher, sched );
//
//Student student = new Student(1, "Richie", "Gay", "Laguna", "019203123");
//
//student.getListOfEnrolledClassses().add(klass);
//
//System.out.println(student.toString());
