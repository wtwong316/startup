package com.tarsus.common.search;

public enum SearchResourceType {
	REPORT("Report"), UNKNOWN("Unknown");
	private String type;
	private SearchResourceType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static SearchResourceType getSearchResource(String type) {
		for (SearchResourceType searchResourceType : SearchResourceType.values()) {
			if (searchResourceType.type.equalsIgnoreCase(type)) {
				return searchResourceType;
			}
		}
		return SearchResourceType.UNKNOWN;
	}		
}
