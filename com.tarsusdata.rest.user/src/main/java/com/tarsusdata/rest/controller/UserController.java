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

import com.tarsusdata.domain.User;
import com.tarsusdata.mongoNative.UserDAO;
import com.tarsusdata.rest.domain.UserDO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;

	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	List<User> getAllUsers(Locale locale) {
		logger.info("UserController - getAllUsers");
		List<User> users = userDAO.listAll();	
		return users;
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	User getUserByName(@PathVariable String name, Locale locale) {
		logger.info("UserController - getUserByName");
		return userDAO.readByName(name);
	}
	
	@RequestMapping(value = "/{name}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteUserByName(@PathVariable String name, Locale locale) {
		logger.info("ReportController - deleteUserByName");
		userDAO.removeByName(name);	
	}	
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public @ResponseBody
	User createUser(@RequestBody final UserDO userDO, Locale locale) {
		logger.info("test logger inside UserController - create a user");
		User user = UserDO.convert(userDO);
		return userDAO.create(user);		
	}

}
