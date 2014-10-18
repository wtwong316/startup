package com.tarsusdata.solr.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tarsusdata.search.SearchService;
import com.tarsusdata.searchdomain.BaseSearchDomainObject;
import com.tarsusdata.solr.repository.SolrBaseRepository;

@Service
public abstract class SolrServiceImpl <T extends BaseSearchDomainObject, U extends SolrBaseRepository<T>> 
	implements SearchService <T> {
	@Autowired
	private U repository;
	
    @Transactional
    public T save(T entry) {       
        return repository.save(entry);
    }
    
    @Transactional
    public void delete(String id) {       
        repository.delete(id);
    }
    
    public T findById(String id) {
    	return repository.findOne(id);
    }
    
    @SuppressWarnings("unchecked")
	public List<T> findAll(int startPage, int endPage) {
    	Pageable pageable = new PageRequest(startPage, endPage);
    	return repository.findAll(pageable).getContent();
    }

}
