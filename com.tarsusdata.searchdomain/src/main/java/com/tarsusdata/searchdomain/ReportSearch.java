package com.tarsusdata.searchdomain;

import org.apache.solr.client.solrj.beans.Field;


public class ReportSearch extends BaseSearchDomainObject {
	private ReportSearch(String id, String name, String categoryName){ 
		super(id.toString(), name);
		this.categoryName = categoryName;
	};
	public static ReportSearch getInstance(String id, String name, String categoryName) {
		ReportSearch reportSearch = new ReportSearch(id, name, categoryName);
		return reportSearch;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Field
	private String categoryName;
}