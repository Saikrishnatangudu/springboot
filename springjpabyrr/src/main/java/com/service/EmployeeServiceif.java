package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeServiceif {

	void createEmp(Employee employee);

	
	List<Employee> viewAllEmp();


	void deleteEmp(int id);

}