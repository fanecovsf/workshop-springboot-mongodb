package com.mongodb.workshop.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.workshop.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User maria = new User("1", "Maria", "maira@gmail.com");
		User alex = new User("2", "Alex", "alex@gmail.com");
		
		List<User> users = new ArrayList<>();
		users.add(maria);
		users.add(alex);
		
		return ResponseEntity.ok().body(users);
	}

}
