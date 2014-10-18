package com.tarsusdata.searchdomain;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
 
public class BaseSearchDomainObject {
 
	@Id
	@Field
	private String id;
	@Field
	private String name;
 
	protected BaseSearchDomainObject() {};
	protected BaseSearchDomainObject(String id, String name) {
		this.id = id;
		this.name = name;
	}
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}