package com.tarsusdata.report.impl;

import java.io.IOException;

import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.report.engine.api.EngineException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarsusdata.common.report.ReportFormatType;
import com.tarsusdata.report.ReportService;
import com.tarsusdata.report.birt.BirtEngine;
import com.tarsusdata.report.exception.TDBirtNotStartedException;
import com.tarsusdata.report.exception.TDRunBirtReportException;
import com.tarsusdata.report.exception.TDStartBirtException;

@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private BirtEngine birtEngine;
	private static boolean birtEngineStarted = false;

	@Override
	public void startBirtEngine() {
		
		try {
			birtEngine.startDesignEngine();
			birtEngineStarted = true;
		} catch (BirtException e) {
			throw new TDStartBirtException();
		}
		
	}

	@Override
	public String runReport(String reportName, String categoryName, ReportFormatType [] reportFormatTypes) {
		if (birtEngineStarted == false) {
			startBirtEngine();
			//throw new TDBirtNotStartedException();
		}
		
		try {			
			return birtEngine.runAndRenderRptDesignDoc("/tmp/Reports/test.rptdesign", "/tmp/Reports/test.html");
		} catch (EngineException | IOException e) {
			throw new TDRunBirtReportException(e);
		}
		
	}

}
