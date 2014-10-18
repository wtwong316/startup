package com.tarsusdata.domain;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
 
@Document(collection = "users")
public class User extends BaseDomainObject {
 
	public User() {}
	public User(String accountName, String userName, String password) {
		this.accountName = accountName;
		this.userName = userName;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getType() {
		return type;
	}
	public void setType(User type) {
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Indexed(unique = true)
	private String accountName;
	private String userName;
	private String password;
	private User type;
 
 
}