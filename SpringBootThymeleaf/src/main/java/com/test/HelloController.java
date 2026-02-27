package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")
	public String simpleHomePage(Model model) {
		//default return statement for the controller is ModelandView 
		
		model.addAttribute("msg", "WELCOME TO THYMELEAF");
		return "index";
	}
}
