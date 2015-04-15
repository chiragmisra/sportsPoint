package com.ftrd.changeme.repository;
import org.springframework.data.repository.CrudRepository;

import com.ftrd.changeme.domain.Activity;
import com.ftrd.changeme.domain.User;

public interface ActivityRepository extends CrudRepository<Activity, Long>{

	Activity findById(int id);
	
}
