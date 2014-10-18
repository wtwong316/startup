package com.tarsusdata.common.report;

public enum ReportActionType {
	RUN("Run"), EXPORT("Export"), UNKNOWN("Unknown");
	private String type;
	private ReportActionType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static ReportActionType getReportActionType(String type) {
		for (ReportActionType reportActionType : ReportActionType.values()) {
			if (reportActionType.type.equalsIgnoreCase(type)) {
				return reportActionType;
			}
		}
		return ReportActionType.UNKNOWN;
	}	
}
