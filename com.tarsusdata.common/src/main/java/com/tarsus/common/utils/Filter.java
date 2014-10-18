package com.tarsus.common.utils;

public class Filter {
	public enum OPERATOR {EQ, NE, LT, GT, LTE, GTE, EXIST, NEXIST};
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public OPERATOR getOperator() {
		return operator;
	}
	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Filter(String fieldName, OPERATOR operator, String name) {
		this.fieldName = fieldName;
		this.name = name;
		this.operator = operator;
	}
	private String name;
	private String fieldName;
	private OPERATOR operator;
}
