package com.verusys.gourav.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.verusys.gourav.entity.Employee;
import com.verusys.gourav.service.IEmployeeService;
import com.verusys.gourav.validation.EmployeeFormValidation;

@Controller
public class EmployeeController {
	@Autowired
	private IEmployeeService service;

	@Autowired
	private EmployeeFormValidation validator;

	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/emp_report")
	public String showEmpReport(@PageableDefault(page = 0,size = 3,sort = "job",direction = Direction.ASC)Pageable pageable,
			Map<String, Object> map) {
		Page<Employee> page= service.getEmployeePageData(pageable);
		map.put("pageData", page);
		return "employee_report";
	}

	/*@GetMapping("/emp_report")
	public String showEmpReport(Map<String, Object> map) {
		Iterable<Employee> empsList = service.getAllEmployee();
		map.put("empsList", empsList);
		return "employee_report";
	}*/

	@GetMapping("/insert_employee")
	public String showAddEmpForm(@ModelAttribute("emp") Employee emp) {
		return "add_employee";
	}

	/*@PostMapping("/insert_employee")
	public String insertEmployee(HttpSession ses, @ModelAttribute("emp") Employee emp) {
		String result = service.insertEmployee(emp);
		ses.setAttribute("resultMsg", result);
		return "redirect:emp_report";
	}*/

	@PostMapping("/insert_employee")
	public String insertEmployee(RedirectAttributes rd, @ModelAttribute("emp") Employee emp, BindingResult errors) {
		if (emp.getVflag().equalsIgnoreCase("no")) {
			if (validator.supports(emp.getClass())) {
				validator.validate(emp, errors);
				if (errors.hasErrors())
					return "add_employee";
			}
		}
		if (emp.getJob().equalsIgnoreCase("PRESIDENT") || emp.getJob().equalsIgnoreCase("QUEEN")) {
			errors.rejectValue("job", "e.job.restriction");
			return "add_employee";
		}
		String result = service.insertEmployee(emp);
		rd.addFlashAttribute("resultMsg", result);
		return "redirect:emp_report";
	}

	/*@PostMapping("/insert_employee")
	public String insertEmployee(Map<String, Object>map,
								@ModelAttribute("emp") Employee emp) {
		String result=service.insertEmployee(emp);
		Iterable<Employee> empsList = service.getAllEmployee();
		map.put("resultMsg", result);
		map.put("empsList", empsList);
		return "employee_report";
	}*/

	@GetMapping("/edit_employee")
	public String showEditEmpForm(@RequestParam("eno") int no, @ModelAttribute("emp") Employee emp) {
		Employee emp1 = service.getEMployeeByEno(no);
		BeanUtils.copyProperties(emp1, emp);
		return "modify_employee";
	}

	@PostMapping("/edit_employee")
	public String editEmployee(RedirectAttributes rd, @ModelAttribute("emp") Employee emp, BindingResult errors) {
		if (emp.getVflag().equalsIgnoreCase("no")) {
			if (validator.supports(emp.getClass())) {
				validator.validate(emp, errors);
				if (errors.hasErrors())
					return "modify_employee";
			}
		}
		if (emp.getJob().equalsIgnoreCase("PRESIDENT") || emp.getJob().equalsIgnoreCase("QUEEN")) {
			errors.rejectValue("job", "e.job.restriction");
			return "modify_employee";
		}
		String result = service.updateEmployee(emp);
		rd.addFlashAttribute("resultMsg", result);
		return "redirect:emp_report";
	}

	/*@PostMapping("/edit_employee")
	public String editEmployee(Map<String, Object>map,
								@ModelAttribute("emp") Employee emp) {
		String result=service.updateEmployee(emp);
		Iterable<Employee> empsList = service.getAllEmployee();
		map.put("resultMsg", result);
		map.put("empsList", empsList);
		return "employee_report";
	}*/

	@GetMapping("/delete_employee")
	public String deleteEmployee(@RequestParam("eno") int no, RedirectAttributes rd) {
		String result = service.deleteEmployeebByEno(no);
		rd.addFlashAttribute("resultMsg", result);
		return "redirect:emp_report";
	}

	/*@GetMapping("/delete_employee")
	public String deleteEmployee(@RequestParam("eno") int no,
								Map<String, Object> map) {
		String result=service.deleteEmployeebByEno(no);
		Iterable<Employee> empsList = service.getAllEmployee();
		map.put("resultMsg", result);
		map.put("empsList", empsList);
		return "employee_report";
	}*/
}