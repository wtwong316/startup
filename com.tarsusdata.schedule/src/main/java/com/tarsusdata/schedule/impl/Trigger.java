package com.tarsusdata.schedule.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Trigger {
	private static final Logger logger = LoggerFactory
			.getLogger(Trigger.class);
	public void trigger() {
		logger.info("Trigger - trigger");
	}
}
