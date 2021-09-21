package com.verusys.gourav.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.verusys.gourav.entity.Employee;

public interface IEmployeeService {
	public Iterable<Employee> getAllEmployee();
	public Page<Employee> getEmployeePageData(Pageable pageable);
	public String insertEmployee(Employee emp);
	public Employee getEMployeeByEno(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeebByEno(int no);
}
