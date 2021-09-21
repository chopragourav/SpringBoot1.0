package com.verusys.gourav.service;

import com.verusys.gourav.entity.Employee;

public interface IEmployeeService {
	public Iterable<Employee> getAllEmployee();
	public String insertEmployee(Employee emp);
	public Employee getEMployeeByEno(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeebByEno(int no);
}
