package com.verusys.gourav.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.verusys.gourav.entity.Employee;

public interface IEmployeeRepo extends PagingAndSortingRepository<Employee, Integer> {

}
