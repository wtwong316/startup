package com.tarsusdata.common.report;

public enum ReportEngineType {
	BIRT("Birt"), JASPER("Jasper"), UNKNOWN("Unknown");
	private String type;
	private ReportEngineType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static ReportEngineType getReportEngineType(String type) {
		for (ReportEngineType engineType : ReportEngineType.values()) {
			if (engineType.type.equalsIgnoreCase(type)) {
				return engineType;
			}
		}
		return ReportEngineType.UNKNOWN;
	}
}
