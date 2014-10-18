package com.tarsusdata.solr.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tarsusdata.search.SearchReportService;
import com.tarsusdata.searchdomain.ReportSearch;
import com.tarsusdata.solr.repository.SolrReportRepository;

@Service
public class SolrReportServiceImpl extends SolrServiceImpl <ReportSearch, SolrReportRepository> implements SearchReportService {
	@Autowired
	private SolrReportRepository repository;
	@Override
	public ReportSearch addToIndex(ReportSearch t) {
		return save(t);		
	}

	@Override
	public void deleteFromIndex(String id) {
		delete(id);		
	}

	@Override
	public ReportSearch findById(String id) {
		return findById(id);
	}

	@Override
	public List<ReportSearch> findByName(String name, int startPage, int endPage) {
		Pageable page = new PageRequest(startPage, endPage);
		Page<ReportSearch> reportSearch = repository.findByName(name, page);
		return reportSearch.getContent();
	}

}
