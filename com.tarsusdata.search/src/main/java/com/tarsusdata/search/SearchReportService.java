package com.tarsusdata.search;

import java.util.List;

import com.tarsusdata.searchdomain.ReportSearch;

public interface SearchReportService extends SearchService <ReportSearch>{
	List<ReportSearch> findByName(String name, int startPage, int endPage);
}
