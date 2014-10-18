package com.tarsusdata.common.schedule;

public enum ScheduleType {
	MONTHLY("Monthly"), DAILY("Daily"), UNKNOWN("Unknown");
	private String type;
	private ScheduleType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ScheduleType getReportEngineType(String type) {
		for (ScheduleType engineType : ScheduleType.values()) {
			if (engineType.type.equalsIgnoreCase(type)) {
				return engineType;
			}
		}
		return ScheduleType.UNKNOWN;
	}
}
