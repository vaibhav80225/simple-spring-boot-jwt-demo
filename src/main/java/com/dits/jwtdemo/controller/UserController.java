package com.dits.jwtdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dits.jwtdemo.response.UserData;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public String home(){
		return "Welcome to jwt example";
	}

    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/users")
    public @ResponseBody UserData getUsers() {
    	
        return new UserData("Doe", "joe");
    }
}