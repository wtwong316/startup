package com.tarsusdata.searchdomain;

import org.apache.solr.client.solrj.beans.Field;

import com.tarsusdata.common.schedule.ScheduleType;
 
public class ScheduleSearch extends BaseSearchDomainObject {
 

	public ScheduleType getType() {
		return type;
	}
	public void setType(ScheduleType type) {
		this.type = type;
	}
	@Field
	private ScheduleType type;
 
 
}