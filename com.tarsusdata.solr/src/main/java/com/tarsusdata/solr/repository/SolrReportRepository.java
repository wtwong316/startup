package com.tarsusdata.solr.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tarsusdata.searchdomain.ReportSearch;

public interface SolrReportRepository extends SolrBaseRepository<ReportSearch>{
	Page<ReportSearch> findByName(String name, Pageable page);
}
