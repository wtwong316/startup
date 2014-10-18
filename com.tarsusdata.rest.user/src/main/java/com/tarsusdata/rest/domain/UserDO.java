package com.tarsusdata.rest.domain;

import com.tarsusdata.domain.User;

public class UserDO {
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	private String accountName;	
	private String userName;
	private String password;
	
	public static User convert(UserDO userDO) {
		return new User(userDO.getAccountName(), userDO.getUserName(), userDO.getPassword());
	}
	
}
