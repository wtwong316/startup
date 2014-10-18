package com.tarsusdata.rest.domain;

import com.tarsusdata.common.schedule.ScheduleType;
import com.tarsusdata.domain.Report;
import com.tarsusdata.domain.Schedule;

public class ScheduleDO {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 
	
	private String name;
	private String type;

	public static Schedule convert(ScheduleDO scheduleDO) {
		return new Schedule(ScheduleType.valueOf(scheduleDO.getType()));
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
