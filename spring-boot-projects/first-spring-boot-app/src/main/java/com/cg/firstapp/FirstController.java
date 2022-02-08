package com.cg.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.firstapp.dto.UserDto;

@RestController
public class FirstController {
	@Autowired
	RestTemplate rt;
	
	
	
	@RequestMapping("/hello")
	public String getMyName() {
		return "Tushar Sharma";
	}
	
	@GetMapping("/user/{username}")
	public UserDto getUserDetails(@PathVariable String username) {
		ResponseEntity<UserDto> user = rt.getForEntity("https://api.github.com/users/"+username, UserDto.class);
		System.out.println(user.getStatusCode());
		return user.getBody();
	}
	
}
