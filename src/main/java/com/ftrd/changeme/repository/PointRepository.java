package com.ftrd.changeme.repository;
import org.springframework.data.repository.CrudRepository;

import com.ftrd.changeme.domain.Activity;
import com.ftrd.changeme.domain.Point;
import com.ftrd.changeme.domain.User;

public interface PointRepository extends CrudRepository<Point, Long>{

	Point findById(int id);
	
	Point findPointByUserAndActivity(User user, Activity activity);
}
