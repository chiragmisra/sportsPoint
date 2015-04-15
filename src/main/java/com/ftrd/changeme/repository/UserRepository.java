package com.ftrd.changeme.repository;
import org.springframework.data.repository.CrudRepository;

import com.ftrd.changeme.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findById(int id);
	
}
