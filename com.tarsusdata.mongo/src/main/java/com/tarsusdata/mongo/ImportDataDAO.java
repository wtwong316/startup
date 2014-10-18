package com.tarsusdata.mongo;

import java.util.List;

import com.tarsusdata.domain.BaseDomainObject;

public interface ImportDataDAO<T extends BaseDomainObject> {
	List<T> listAll();
}
