package com.verusys.gourav.controller;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.verusys.gourav.model.Customer;
import com.verusys.gourav.service.ICustomerService;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerService service;

	@GetMapping("/")
	public String showCustomerFormPage(@ModelAttribute("cust") Customer customer) {
		return "customer_register";
	}

	@PostMapping("/customer_register")
	public String registerCustomer(Map<String, Object> map, @ModelAttribute("cust") Customer cust) {
		// return LVN
		return "cust_result";

	}

	@ModelAttribute("countriesInfo")
	public Set<String> populateCountry() {
		return service.getAllCountries();

	}

	@ModelAttribute("languagesInfo")
	public Set<String> populateLanguages() {
		return service.getAllLanguages();

	}

	@ModelAttribute("hobbiesInfo")
	public Set<String> populateHobbies() {
		return service.getAllHobbies();

	}
}
