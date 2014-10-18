package com.tarsusdata.searchdomain;

import org.apache.solr.client.solrj.beans.Field;

import com.tarsusdata.searchdomain.BaseSearchDomainObject;
 
public class UserSearch extends BaseSearchDomainObject {
 
	public UserSearch getType() {
		return type;
	}
	public void setType(UserSearch type) {
		this.type = type;
	}
	@Field
	private UserSearch type;
 
}