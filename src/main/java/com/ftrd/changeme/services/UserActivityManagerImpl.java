package com.ftrd.changeme.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.ftrd.changeme.domain.Activity;
import com.ftrd.changeme.domain.User;
import com.ftrd.changeme.domain.UserActivity;
import com.ftrd.changeme.repository.ActivityRepository;
import com.ftrd.changeme.repository.UserActivityRepository;
import com.ftrd.changeme.repository.UserRepository;

public class UserActivityManagerImpl implements UserActivityManager {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ActivityRepository activityRepository;
	
	@Autowired
	private UserActivityRepository userActivityRepository;
	
	
	

	@Override
	public void saveUserActivity(int userId, int activityId, double distance) {
		// TODO Auto-generated method stub
		Activity activity= activityRepository.findById(activityId);
		User user = userRepository.findById(userId);
		UserActivity userActivity= new UserActivity();
		userActivity.setActivity(activity);
		userActivity.setUser(user);
		userActivity.setDistance(distance);
		
		
	}

}
