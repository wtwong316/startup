package com.tarsusdata.domain;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
@JsonIgnoreProperties
public abstract class BaseDomainObject {
	@JsonIgnore
	private String _id;
	private long entityId;
	
	public String get_id() {
		return _id;
	}
	private Date creationTime;
	
	private String creator;

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public long getId() {
		return entityId;
	}

	public void setId(long entityId) {
		this.entityId = entityId;
	}
	
	public void setObjectId(String _id) {
		this._id = _id;
	}

}