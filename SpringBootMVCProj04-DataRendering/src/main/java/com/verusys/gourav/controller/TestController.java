package com.verusys.gourav.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.verusys.gourav.model.Employee;

@Controller
public class TestController {
	
	@GetMapping("/report")
	public String showReport(Map<String,Object> map) {
		/*map.put("name", "Gourav");
		map.put("age", 24);
		map.put("addr", "Sanawad");*/
		
		
		/*String[] nickNames=new String[] {"Gourav","Ruchika","Nandini"};
		Set<Long> mobilePhones=new HashSet<>();
		mobilePhones.add(8435286065L);mobilePhones.add(9171446264L);
		mobilePhones.add(9977064968L);
		List<String> coursesInfo=List.of("Java","Spring","Spring Boot","Hibernate");
		Map<String, Long> idsInfo=Map.of("Adhaar",212824390175L,
										"Voter ID", 289566L);
		
		map.put("nickNames", nickNames);
		map.put("mobile", mobilePhones);
		map.put("courses", coursesInfo);
		map.put("ids", idsInfo);*/
		
		List<Employee> empsList=List.of(new Employee(101, "Gourav", "TL", 100000.0),
										new Employee(102, "Divya", "UI", 80000.0),
										new Employee(103, "Deva", "Developer", 50000.0));
		map.put("empsInfo", empsList);
		return "show_report";
	}
}
