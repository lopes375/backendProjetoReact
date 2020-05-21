package com.surittec.backend.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.surittec.backend.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User> listar( ) {
		
		User usr = new User(2, "Alex Lopes", "alex100d@icloud.com");
		
		List<User> user = new ArrayList<>();
		user.add(usr);
		
		return user;
		
	}

}
