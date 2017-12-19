package com.boot.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.admin.service.UserService;

@RestController  
@RequestMapping(value = "/admin/v1")  
public class TestController {  
    
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	@ResponseBody
    public String firstResp (Long id){
		return userService.query(id);
    }
	
	@RequestMapping(value = "/put", method = RequestMethod.GET)
	@ResponseBody
    public String put(Long id, String value){
		return userService.put(id, value);
    }

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	@ResponseBody
    public void delete(Long id){
		userService.remove(id);
    }
} 