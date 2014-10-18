package com.tarsusdata.solr.repository;

import org.springframework.data.solr.repository.SolrCrudRepository;

import com.tarsusdata.searchdomain.BaseSearchDomainObject;

public interface SolrBaseRepository <T extends BaseSearchDomainObject>extends SolrCrudRepository<T, String>{
}
