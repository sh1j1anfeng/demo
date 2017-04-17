package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.UserService;

/**
 * Created by shijianfeng on 2017/2/28.
 */
@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;

    @GetMapping("/")
    public String sayHello(){
        return "hello";
    }
    

    @PostMapping("/getUser")
    public User getUser(String name){
    	return userService.findUser(name);
    }
}
