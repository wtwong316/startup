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

import com.tarsusdata.mongoNative.ReportDAO;
import com.tarsusdata.common.report.ReportActionType;
import com.tarsusdata.common.report.ReportFormatType;
import com.tarsusdata.domain.Report;
import com.tarsusdata.report.ReportService;
import com.tarsusdata.rest.domain.ReportDO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ReportController {

	@Autowired
	private ReportDAO reportDAO;
	@Autowired
	private ReportService reportService;

	private static final Logger logger = LoggerFactory
			.getLogger(ReportController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	List<Report> getAllReports(Locale locale) {
		logger.info("ReportController - getAllReports");
		List<Report> reports = reportDAO.listAll();	
		return reports;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	Report createReport(@RequestBody final ReportDO reportDO, Locale locale) {
		logger.info("ReportController: create a Report");
		Report report = ReportDO.convert(reportDO);
		return reportDAO.create(report);	
	}

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	Report getReportByName(@PathVariable String name, Locale locale) {
		logger.info("ReportController - getReportByName");
		return reportDAO.readByName(name);	
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteReportByName(@PathVariable String name, Locale locale) {
		logger.info("ReportController - deleteReportByName");
		reportDAO.removeByName(name);	
	}
	
	@RequestMapping(value = "/action", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	ReportActionType[] getReportActions(Locale locale) {
		logger.info("ReportController - getReportAction");
		return ReportActionType.values();	
	}	
	
	@RequestMapping(value = "/action/{action}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	String runReport(@PathVariable String action, @RequestBody final ReportDO reportDO, Locale locale) {
		logger.info("ReportController - run a Report");
		Report report = reportDAO.readByName(reportDO.getReportName());
		String[] reportFormatTypeStrs = reportDO.getReportFormatTypes();
		ReportFormatType[] reportFormatTypes = ReportFormatType.convert(reportFormatTypeStrs);
		return reportService.runReport(report.getRptN(), report.getCatN(), reportFormatTypes);
	}
}
