package com.mysite.sbb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user/login")
	public String login() {
		return "/users/login";
	}
	
	@GetMapping("/user/{username}")
	@ResponseBody
	public User getUser(@PathVariable("username") String username) {
		return userService.getUser();
	}

}
