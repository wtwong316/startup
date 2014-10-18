package com.tarsusdata.common.schedule;

public enum ScheduleActionType {
	RUN("Run"), UNKNOWN("Unknown");
	private String type;
	private ScheduleActionType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static ScheduleActionType getReportCategoryType(String type) {
		for (ScheduleActionType CategoryType : ScheduleActionType.values()) {
			if (CategoryType.type.equalsIgnoreCase(type)) {
				return CategoryType;
			}
		}
		return ScheduleActionType.UNKNOWN;
	}
}
