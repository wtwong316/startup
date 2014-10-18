package com.tarsusdata.report;

import com.tarsusdata.common.report.ReportFormatType;

public interface ReportService {
	void startBirtEngine();
	String runReport(String reportName, String categoryName, ReportFormatType[] reportFormatTypes);
}
