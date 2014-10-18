package com.tarsusdata.rest.helper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarsusdata.rest.domain.SearchDO;
import com.tarsusdata.search.SearchReportService;
import com.tarsusdata.searchdomain.ReportSearch;

public class SearchHelper {
	@Autowired
	private SearchReportService searchReportService;

	public ReportSearch createIndex(String resourceName, SearchDO searchDO) {
		ReportSearch reportSearch = searchDO.convertToReportSearch();
		return searchReportService.addToIndex(reportSearch);
		
	}

	public List<ReportSearch> searchAll(String resourceName, int startPage, int endPage) {
		return searchReportService.findAll(startPage, endPage);
	}

}
