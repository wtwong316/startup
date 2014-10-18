package com.tarsusdata.rest.domain;

import com.tarsusdata.domain.Report;

public class ReportDO {
	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	} 
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String [] getReportFormatTypes() {
		return reportFormatTypes;
	}

	public void setReportFormatTypes(String [] reportFormatTypes) {
		this.reportFormatTypes = reportFormatTypes;
	}

	private String reportName;
	private String categoryName;
	private String [] reportFormatTypes;
	public static Report convert(ReportDO reportDO) {
		return new Report(reportDO.getReportName(), reportDO.getCategoryName());
	}
	
}
