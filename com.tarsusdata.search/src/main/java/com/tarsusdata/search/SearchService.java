package com.tarsusdata.search;

import java.util.List;

public interface SearchService <T>{
	T addToIndex(T t);
	void deleteFromIndex(String id);
	T findById(String id);
	List<T> findAll(int startPage, int endPage);
}
