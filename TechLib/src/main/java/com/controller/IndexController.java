package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Dao.UserDao;

@Controller
public class IndexController {

	@Autowired
	
	private UserDao userdao;
	 
	 @RequestMapping(value = "/")
	 public String indexpage(){
		 return "index";
	 }
	
}
