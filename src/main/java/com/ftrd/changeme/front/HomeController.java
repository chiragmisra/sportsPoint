package com.ftrd.changeme.front;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ftrd.changeme.services.UserActivityManager;
import com.ftrd.changeme.services.UserManager;
import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Your Name
 * 
 */
@Produces({ MediaType.APPLICATION_JSON })
@Path("/")
public class HomeController {
	@Autowired
	private UserActivityManager userActivityManager;
	
	private Logger log = Logger.getLogger(getClass());
	
	
	@GET
	@Path("/index")
	public String index(@Context HttpServletRequest request) {
		return "index";
	}
	
	@POST
	@Path("/activity")
	public Response saveUserActivity(@Context HttpServletRequest request,
			@FormParam("userId") int userId, @PathParam("activityId") int activityId,
			@FormParam("distance") double distance
			) {
		System.out.println("user id"+ userId);
		System.out.println("activity  id"+activityId);
		System.out.println("distance "+distance);
		Response res = null;
		userActivityManager.saveUserActivity(userId, activityId, distance);
		res = Response.ok().build();
		return res;
	}
	
	

}
