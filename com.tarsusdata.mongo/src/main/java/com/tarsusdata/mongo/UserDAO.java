package com.tarsusdata.mongo;

import java.util.List;

import com.tarsusdata.domain.User;

public interface UserDAO extends MongoDAO<User> {
	List<User> listAll();
	User readByName(String name);
	void removeByName(String name);
}
