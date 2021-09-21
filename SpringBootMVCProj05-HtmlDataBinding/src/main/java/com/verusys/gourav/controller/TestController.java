package com.verusys.gourav.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.verusys.gourav.model.Employee;

@Controller
public class TestController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/employee_register")
	public String showForm() {
		return "register";
	}
	
	@PostMapping("/employee_register")
	public String empRegister(Map<String,Object> map, @ModelAttribute Employee employee) {
		return "result";
	}
}