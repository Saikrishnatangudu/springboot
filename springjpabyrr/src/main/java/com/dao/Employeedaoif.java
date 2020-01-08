package com.dao;

import java.util.List;

import com.model.Employee;

public interface Employeedaoif  {

	void createEmp(Employee employee);

	List<Employee> viewAllEmp();

	void deleteEmp(int id);

}
