package com.tarsusdata.solrt.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrOperations;
import org.springframework.data.solr.repository.support.SolrRepositoryFactory;

public abstract class SolrSearchBaseRepositoryFactory <T>{
	  @Autowired
	  private SolrOperations solrOperations;

	  @SuppressWarnings("unchecked")
	  public T create(T t) {
	    return (T) new SolrRepositoryFactory(this.solrOperations).getRepository(t.getClass());
	  }
}
