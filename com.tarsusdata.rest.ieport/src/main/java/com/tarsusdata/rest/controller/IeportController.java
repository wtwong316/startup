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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.tarsusdata.domain.StudentChief;
import com.tarsusdata.ieport.Ieport;
import com.tarsusdata.rest.domain.IeportDO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IeportController {

	@Autowired
	private Ieport ieport;

	private static final Logger logger = LoggerFactory
			.getLogger(IeportController.class);

	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void createImportData(@RequestBody final IeportDO ieportDO, Locale locale) {
		logger.info("test logger inside ImportDataController - create a ieport");
			ieport.importData(ieportDO.getDomainObj(), ieportDO.getFilePath());
	}

}
