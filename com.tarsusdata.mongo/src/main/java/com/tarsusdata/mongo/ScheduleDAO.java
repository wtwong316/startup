package com.tarsusdata.mongo;

import java.util.List;

import com.tarsusdata.domain.Schedule;

public interface ScheduleDAO extends MongoDAO<Schedule> {
	List<Schedule> listAll();
	Schedule readByName(String name);
	void removeByName(String name);
}
