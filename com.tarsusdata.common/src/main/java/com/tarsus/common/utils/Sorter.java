package com.tarsus.common.utils;

public class Sorter {
	public enum DIRECTION {ASC, DESC};

	public DIRECTION getDirection() {
		return direction;
	}
	public void setDirection(DIRECTION direction) {
		this.direction = direction;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	public Sorter(String fieldName, DIRECTION direction) {
		this.fieldName = fieldName;
		this.direction = direction;
	}
	private DIRECTION direction;
	private String fieldName;
}
