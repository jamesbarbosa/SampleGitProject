package com.schoolregistration.domain;

import java.util.Date;

public class Schedule {
	
	private int scheduleID;
	private Date schedule;
	
	public Schedule(int scheduleID, Date schedule) {
		this.scheduleID = scheduleID;
		this.schedule = schedule;
	}

	public int getScheduleID() {
		return scheduleID;
	}

	public Date getSchedule() {
		return schedule;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleID=" + scheduleID + ", schedule=" + schedule
				+ "]";
	}
	
	

}
