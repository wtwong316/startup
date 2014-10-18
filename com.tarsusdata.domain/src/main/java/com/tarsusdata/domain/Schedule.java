package com.tarsusdata.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.tarsusdata.common.schedule.ScheduleType;
 
@Document(collection = "schedules")
public class Schedule extends BaseDomainObject {
 
	public Schedule() {}
	public Schedule(ScheduleType type) {
		this.type = type;
	}

	public ScheduleType getType() {
		return type;
	}
	public void setType(ScheduleType type) {
		this.type = type;
	}

	@Indexed(unique = true)
	private String scheduleName;
	private ScheduleType type;
 
 
}