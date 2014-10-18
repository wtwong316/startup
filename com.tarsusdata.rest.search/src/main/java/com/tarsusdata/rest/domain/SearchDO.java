package com.tarsusdata.rest.domain;

import java.util.UUID;

import com.tarsusdata.searchdomain.ReportSearch;

public class SearchDO {
	String name;
	String categoryName;
	public ReportSearch convertToReportSearch() {
		return ReportSearch.getInstance(UUID.randomUUID().toString(), this.name, this.categoryName);
	}
	
}
