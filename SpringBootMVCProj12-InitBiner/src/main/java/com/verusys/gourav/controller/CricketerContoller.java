package com.verusys.gourav.controller;

import java.text.SimpleDateFormat;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.verusys.gourav.entity.Cricketer;
import com.verusys.gourav.service.ICricketerService;

@Controller
public class CricketerContoller {

	@Autowired
	private ICricketerService service;

	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping("/register")
	public String showCricketerRegistrationPage(@ModelAttribute("cktr") Cricketer cktr) {
		return "register_cricketer";
	}
	
	@PostMapping("/register")
	public String registerCricketer(Map<String, Object>map,
			@ModelAttribute("cktr")Cricketer cktr,
			BindingResult errors) {
		String msg = service.registerCricketer(cktr);
		map.put("resultMsg", msg);
		return "show_result";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(sdf, false);
		binder.registerCustomEditor(java.util.Date.class, editor);
	}
}
