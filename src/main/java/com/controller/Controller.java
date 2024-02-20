package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dao.UserInfoRepository;
import com.model.StudentInfo;
import com.model.User;
import com.service.StudentInfoService;
import com.service.UserInfoService;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/index.html")
	public String index() {
		return "index";
	}
	
	
	
	
	@GetMapping("/loginsuccess.html")
	public String loginsuccess() {
		return "loginsuccess";
	}

	
	@GetMapping("/login.html")
	public String login(Model model) {
		model.addAttribute("User", new User());
		
		return "login";
	}
	
	@Autowired
	UserInfoRepository userRepo;
	
	@PostMapping("/login")
	public String userLogin(@ModelAttribute User userLogin, Model model) {
		User user= userRepo.findByUsermailAndUserpassword(userLogin.getUsermail(), userLogin.getUserpassword());
		
		if(user != null )
		{
			return "redirect:/loginsuccess.html";
		}else {
			model.addAttribute("error","invalid Email and Password");
			return "login.html";
		}
	}
	
	@GetMapping("/Register.html")
	public String register(Model model) {
		
		  model.addAttribute("User", new User());

		return "Register";
	}
	

	@Autowired
	UserInfoService userinfoservice;
	
	@PostMapping("/register")
	   public String saveUserData(User user) {
	        // Save data to the database
		userinfoservice.saveUser(user);
		return "redirect:/login.html";
	    }
	
	
	
	@GetMapping("/information.html")
	public String information(Model model) {
		
		model.addAttribute("StudentInfo", new StudentInfo());
		return "information";
	}
	

	
}
