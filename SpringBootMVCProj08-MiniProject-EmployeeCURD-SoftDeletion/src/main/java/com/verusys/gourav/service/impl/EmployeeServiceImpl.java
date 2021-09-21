package com.verusys.gourav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.verusys.gourav.entity.Employee;
import com.verusys.gourav.repository.IEmployeeRepo;
import com.verusys.gourav.service.IEmployeeService;

@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public Iterable<Employee> getAllEmployee() {
		return empRepo.findAll(Sort.by("job").ascending());
	}

	@Override
	public String insertEmployee(Employee emp) {
		
		return "Employee inserted with id "+empRepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEMployeeByEno(int eno) {
		return empRepo.findById(eno).get();
	}

	@Override
	public String updateEmployee(Employee emp) {
		return "EmpNo with "+empRepo.save(emp).getEmpno()+" employee update";
	}

	@Override
	public String deleteEmployeebByEno(int no) {
		empRepo.deleteById(no);
		return "Employee number with "+no+" deleted";
	}
	
	

}
