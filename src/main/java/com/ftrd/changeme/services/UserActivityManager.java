package com.ftrd.changeme.services;

import com.ftrd.changeme.domain.Activity;

public interface UserActivityManager {
	
	public void saveUserActivity(int userId, int activity, double distance);
	
}
