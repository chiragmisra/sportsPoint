package com.ftrd.changeme.front;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ftrd.changeme.services.UserActivityManager;
import com.ftrd.changeme.services.UserManager;
import com.google.gson.JsonObject;

/**
 * @author Your Name
 * 
 */
@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	private UserActivityManager userActivityManager;
	
	private Logger log = Logger.getLogger(getClass());
	
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/activity", method = RequestMethod.POST, consumes="application/json")
	public String saveUserActivity(@RequestBody String json) {
		JSONObject jsonObject = new JSONObject(json);
		int userId = (Integer) jsonObject.get("user_id");
		System.out.println("user id"+ userId);
		int activityId = (Integer) jsonObject.get("activity_id");
		System.out.println("activity  id"+activityId);
		double distance = (Double) jsonObject.get("distance");
		System.out.println("distance "+distance);

		userActivityManager.saveUserActivity(userId, activityId, distance);
		
		return "index";
	}
	
	

}
