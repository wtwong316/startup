package com.tarsusdata.mongo;

import java.util.List;

import org.springframework.data.mongodb.core.aggregation.TypedAggregation;

import com.tarsusdata.domain.Report;

public interface ReportDAO extends MongoDAO<Report> {
	String REPORT_FIELD_NAME = "rptN";
	String REPORT_CATEGORY_FIELD_NAME = "catN";
	List<Report> listAll();
	Report readByName(String name);
	void removeByName(String name);
	List<AggregateCategory> listByCategoryGroup();
	

}
