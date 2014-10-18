package com.tarsusdata.mongo;

import java.util.List;

import org.springframework.data.mongodb.core.aggregation.TypedAggregation;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.tarsus.common.utils.Filter;
import com.tarsus.common.utils.Sorter;
import com.tarsusdata.domain.BaseDomainObject;

public interface MongoDAO <T extends BaseDomainObject> {
	void create(T domainObj);
	void update(T domainObj, Update update);
	void upsert(T domainObj);
	void bulkUpdate(Class<T> domainObjClass, Query query, Update update);
	void remove(T domainObj);
	void remove(Class<T> domainObjClass, String id);
	
	List<T> listAll(Class<T> domainObjClass);
    T read(Class<T> domainObjClass, String id);
	List<T> list(Class<T> domainObjClass, int skip, int limit, Sorter[] sorters, String[] projectFields);
	List<T> list(Class<T> domainObjClass, int skip, int limit, Sorter[] sorters);
	List<T> listByFilters(Class<T> domainObjClass, int skip, int limit, Sorter[] sorters, Filter[] filters);
	<U> List<U> aggregate(TypedAggregation<T> aggregation, Class<U> u);
	List<T> listByFilters(Class<T> domainObjClass, int skip, int limit, Sorter[] sorters,
			String[] projectFields, Filter[] filters);
	
}
