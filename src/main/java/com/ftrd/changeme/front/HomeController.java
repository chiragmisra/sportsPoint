package com.ftrd.changeme.front;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ftrd.changeme.services.UserManager;

/**
 * @author Your Name
 * 
 */
@Controller
@RequestMapping("/")
@SessionAttributes("user")
public class HomeController {
	private Logger log = Logger.getLogger(getClass());
	@Autowired
	private UserManager userManager;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
