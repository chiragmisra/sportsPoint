package com.ftrd.changeme.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ftrd.changeme.domain.Activity;
import com.ftrd.changeme.domain.Point;
import com.ftrd.changeme.domain.User;
import com.ftrd.changeme.domain.UserActivity;
import com.ftrd.changeme.repository.ActivityRepository;
import com.ftrd.changeme.repository.PointRepository;
import com.ftrd.changeme.repository.UserActivityRepository;
import com.ftrd.changeme.repository.UserRepository;

public class UserActivityManagerImpl implements UserActivityManager {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ActivityRepository activityRepository;
	
	@Autowired
	private UserActivityRepository userActivityRepository;
	
	@Autowired
	private PointRepository pointRepository;
	

	@Override
	public void saveUserActivity(int userId, int activityId, double distance) {
		Activity activity= activityRepository.findById(activityId);
		User user = userRepository.findById(userId);
		
		UserActivity userActivity= new UserActivity();
		userActivity.setActivity(activity);
		userActivity.setUser(user);
		userActivity.setDistance(distance);
		
		int points = (int) Math.round(CalculatePoints(distance, activity));
		userActivity.setPoints(points);
		java.util.Date today = new java.util.Date();
		userActivity.setTimeStamp(new java.sql.Timestamp(today.getTime()));
		
		userActivityRepository.save(userActivity);
		
		Point point = pointRepository.findPointByUserAndActivity(user, activity);
		
		if(null==point) {
			point = new Point();
		}
		
		point.setActivity_Id(activity);
		point.setUser(user);
		point.setTotal_Points(point.getTotal_Points());
		
		pointRepository.save(point);
		
	}
	
	
	private double CalculatePoints(double distance, Activity activity) {
		return distance/activity.getUnits();
		
	}

}
