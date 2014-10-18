package com.tarsusdata.solrt.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.SimpleStringCriteria;

import com.tarsusdata.searchdomain.BaseSearchDomainObject;
import com.tarsusdata.solr.repository.SolrBaseRepository;

public abstract class SolrBaseRepositoryImpl <T extends BaseSearchDomainObject> implements SolrBaseRepository <T>{
	private SolrOperations solrTemplate;
	@Autowired
	private SolrBaseRepository<T> repository;
	@Autowired
	public void setOperations(SolrOperations solrOperations) {
	  this.solrTemplate = solrOperations;
	}
	
	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public Iterable<T> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public Page<T> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	public <S extends T> S save(S entity) {
		return repository.save(entity);
	}

	@Override
	public <S extends T> Iterable<S> save(Iterable<S> entities) {
		return repository.save(entities);
	}

	@Override
	public T findOne(String id) {
		return repository.findOne(id);
	}

	@Override
	public boolean exists(String id) {
		return repository.exists(id);
	}

	@Override
	public void delete(String id) {
		repository.delete(id);		
	}

	@Override
	public void delete(T entity) {
		repository.delete(entity);
	}

	@Override
	public void delete(Iterable<? extends T> entities) {
		repository.delete(entities);
		
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
		
	}

	@Override
	public Iterable<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Iterable<T> findAll(Iterable<String> ids) {
		return repository.findAll(ids);
	}
	
	@SuppressWarnings("unchecked")
	public Page<T> findByName(String name, Pageable page, T searchDomainObject) {
	    Query query = new SimpleQuery(new SimpleStringCriteria("name:"+name)).setPageRequest(page);
	    return (Page<T>) solrTemplate.queryForPage(query, searchDomainObject.getClass());
	
	}

}
