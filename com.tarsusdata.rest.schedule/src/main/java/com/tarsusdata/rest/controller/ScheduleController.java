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

import com.tarsusdata.mongoNative.ScheduleDAO;
import com.tarsusdata.common.schedule.ScheduleActionType;
import com.tarsusdata.domain.Schedule;
import com.tarsusdata.rest.domain.ScheduleDO;
import com.tarsusdata.schedule.ScheduleService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ScheduleController {

	@Autowired
	private ScheduleDAO scheduleDAO;
	
//	@Autowired
//	private ScheduleService scheduleService;

	private static final Logger logger = LoggerFactory
			.getLogger(ScheduleController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	List<Schedule> getAllSchedules(Locale locale) {
		logger.info("ScheduleController - getAllSchedules");
		List<Schedule> schedules = scheduleDAO.listAll();	
		return schedules;
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	Schedule createSchedule(@RequestBody final ScheduleDO scheduleDO, Locale locale) {
		logger.info("ScheduleController: create a Schedule");
		Schedule schedule = ScheduleDO.convert(scheduleDO);
		return scheduleDAO.create(schedule);		
	}

	@RequestMapping(value = "/schedule/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	Schedule getScheduleByName(@PathVariable String name, Locale locale) {
		logger.info("ScheduleController - getScheduleByName");
		return scheduleDAO.readByName(name);	
	}
	
	@RequestMapping(value = "/schedule/action", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	ScheduleActionType[] getScheduleActions(Locale locale) {
		logger.info("ScheduleController - getScheduleAction");
		return ScheduleActionType.values();	
	}	
	
	@RequestMapping(value = "/schedule/action/{action}", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	void runSchedule(@PathVariable String action, @RequestBody final ScheduleDO scheduleDO, Locale locale) {
		logger.info("ScheduleController - run a Schedule");
		Schedule schedule = scheduleDAO.readByName(scheduleDO.getName());
	}
}
