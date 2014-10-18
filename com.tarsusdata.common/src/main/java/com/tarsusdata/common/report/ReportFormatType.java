package com.tarsusdata.common.report;

public enum ReportFormatType {
	HTML("html"), PDF("pdf"), EXCEL("xls"), WORD("doc"), UNKNOWN("Unknown");
	private String type;
	
	private ReportFormatType(String type) {
		this.setType(type);
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public static ReportFormatType getReportFormatType(String type) {
		for (ReportFormatType reportFormatType : ReportFormatType.values()) {
			if (reportFormatType.type.equalsIgnoreCase(type)) {
				return reportFormatType;
			}
		}
		return ReportFormatType.UNKNOWN;
	}
	
	public static ReportFormatType[] convert(String[] reportFormatTypeStrs) {
		ReportFormatType[] reportFormatTypes;
		if (reportFormatTypeStrs != null) {
			reportFormatTypes = new ReportFormatType[reportFormatTypeStrs.length];
		} else {
			reportFormatTypes = new ReportFormatType[0];
		}
		return reportFormatTypes;
	}
}
