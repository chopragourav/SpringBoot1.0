package com.verusys.gourav.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.verusys.gourav.entity.Employee;

@Component
public class EmployeeFormValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(Employee.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Employee emp = (Employee) target;

		// validation for employee name
		if (emp.getEname() == null || emp.getEname().isBlank())
			errors.rejectValue("ename", "e.ename.required");
		else if (emp.getEname().length() < 5)
			errors.rejectValue("ename", "e.ename.minlength");

		// validation for employee desg
		if (emp.getJob() == null || emp.getJob().isBlank())
			errors.rejectValue("job", "e.job.required");
		else if (emp.getJob().length() < 5)
			errors.rejectValue("ename", "e.job.minlength");

		// validation for employee sal
		if (emp.getSal() == null)
			errors.rejectValue("sal", "e.sal.required");
		else if (emp.getSal() < 10000 || emp.getSal() > 1000000)
			errors.rejectValue("sal", "e.sal.range");

		// validation for employee deptno
		if (emp.getDeptno() == null)
			errors.rejectValue("sal", "e.deptno.required");
		else if (emp.getDeptno() < 10 || emp.getDeptno() > 100)
			errors.rejectValue("sal", "e.deptno.range");
	}

}
