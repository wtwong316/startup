package com.tarsusdata.rest.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.tarsus.common.search.SearchResourceType;
import com.tarsusdata.common.report.ReportActionType;
import com.tarsusdata.rest.domain.SearchDO;
import com.tarsusdata.rest.helper.SearchHelper;
import com.tarsusdata.search.SearchService;
import com.tarsusdata.searchdomain.ReportSearch;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SearchController {

	@Autowired
	private SearchHelper searchHelper;
	
//	@Autowired
//	private SearchService SearchService;

	private static final Logger logger = LoggerFactory
			.getLogger(SearchController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	 SearchResourceType[] getAllSearchResources(Locale locale) {
		logger.info("SearchController - getAllSearchs");
		return SearchResourceType.values();	
	}
	
	@RequestMapping(value = "/{resourceName}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	ReportSearch createSearch(@RequestBody final SearchDO searchDO, @PathVariable String resourceName, Locale locale) {
		logger.info("SearchController: create a Search index for " + resourceName);
		return searchHelper.createIndex(resourceName, searchDO);
	}

	@RequestMapping(value = "/{resourceName}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	List<ReportSearch> getSearchAll(@PathVariable String resourceName, Locale locale) {
		logger.info("SearchController - getSearchByName for " + resourceName);
		return searchHelper.searchAll(resourceName,0,1);
	}
	
}
