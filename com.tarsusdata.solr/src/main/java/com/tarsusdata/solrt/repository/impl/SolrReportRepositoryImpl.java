package com.tarsusdata.solrt.repository.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.core.SolrOperations;

import com.tarsusdata.searchdomain.ReportSearch;
import com.tarsusdata.solr.repository.SolrReportRepository;

public class SolrReportRepositoryImpl extends SolrBaseRepositoryImpl<ReportSearch>implements SolrReportRepository {
	private static ReportSearch reportSearch = ReportSearch.getInstance("-1", "UNKNOWN", "UNKNOWN");
	private SolrOperations solrTemplate;

	@Autowired
	public void setOperations(SolrOperations solrOperations) {
	  this.solrTemplate = solrOperations;
	}

	@Override
	public Page<ReportSearch> findByName(String name, Pageable page) {
		return findByName(name, page, reportSearch);
	}
}
