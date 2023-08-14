package com.mongodb.workshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongodb.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	

}
