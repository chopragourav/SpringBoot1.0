package com.verusys.gourav.controller;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataBindingController {

	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map,
								@RequestParam("sno")int no,
								@RequestParam("sname")String name) {
		System.out.println(no+"===>"+name);
	return"show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map,
								@RequestParam int sno,
								@RequestParam String sname) {
		System.out.println(sno+"===>"+sname);
	return"show_data";
	}*/
	
	/*@GetMapping("/data")
	public String bindData(Map<String, Object> map,
								@RequestParam int sno,
								@RequestParam String []sname,
								@RequestParam("sname") Set<String> names) {
		System.out.println(sno+" "+Arrays.toString(sname)+" "+names);
	return"show_data";
	}*/
	
	@GetMapping("/data")
	public String bindData(Map<String, Object> map,
								@RequestParam int sno,
								@RequestParam String sname) {
		System.out.println(sno+"===>"+sname);
	return"show_data";
	}
}