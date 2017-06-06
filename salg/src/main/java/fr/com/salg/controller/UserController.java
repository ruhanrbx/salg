package fr.com.salg.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.com.salg.entity.UserInfo;
import fr.com.salg.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index(){
		
		return "Welcome to the controller!";
		
	}
	
	@RequestMapping("")
	public String deleteUser(){
		
		return "Welcome to the controller!";
		
	}
	@RequestMapping("/delete{id}")
	public void  deleteUser(@PathVariable String id){
		
		
	}
	
	@RequestMapping("/new")
	public void  createUser(){
		UserInfo user = new UserInfo();
		user.setEmail("ruhanrbx@gmail.com");
		user.setLogin("ruhanrbx");
		user.setName("Ruhan Carolino Silva");
		user.setPassword("password");
		user.setTel("09999988");
		
	userService.saveOrUpdate(user);		
	}

}
