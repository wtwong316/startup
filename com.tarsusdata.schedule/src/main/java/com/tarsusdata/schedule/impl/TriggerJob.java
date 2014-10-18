package com.tarsusdata.schedule.impl;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class TriggerJob extends QuartzJobBean {
	  private int timeout;
		private static final Logger logger = LoggerFactory
				.getLogger(TriggerJob.class);	  
	  /**
	   * Setter called after the ExampleJob is instantiated
	   * with the value from the JobDetailBean (5)
	   */ 
	  public void setTimeout(int timeout) {
	    this.timeout = timeout;
	  }
	  
	@Override
	protected void executeInternal(JobExecutionContext ctx)
			throws JobExecutionException {
			logger.info("TriggerJob - executeInternal");
	}
	
}
