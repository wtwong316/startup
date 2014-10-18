package com.tarsusdata.common.user;

public enum UserType {
	ADMIN("Admin"), REGULAR("Regular"), UNKNOWN("Unknown");
	private String type;
	private UserType(String type) {
		this.setType(type);
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public UserType getReportEngineType(String type) {
		for (UserType engineType : UserType.values()) {
			if (engineType.type.equalsIgnoreCase(type)) {
				return engineType;
			}
		}
		return UserType.UNKNOWN;
	}
}
