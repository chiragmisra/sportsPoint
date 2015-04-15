package com.ftrd.changeme.repository;
import org.springframework.data.repository.CrudRepository;

import com.ftrd.changeme.domain.User;
import com.ftrd.changeme.domain.UserActivity;

public interface UserActivityRepository extends CrudRepository<UserActivity, Long>{


}
