package com.tarsusdata.common.report;

public enum ReportCategoryType {
	TEST("Test"), UNKNOWN("Unknown");
	private String type;
	private ReportCategoryType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static ReportCategoryType getReportCategoryType(String type) {
		for (ReportCategoryType CategoryType : ReportCategoryType.values()) {
			if (CategoryType.type.equalsIgnoreCase(type)) {
				return CategoryType;
			}
		}
		return ReportCategoryType.UNKNOWN;
	}
}
