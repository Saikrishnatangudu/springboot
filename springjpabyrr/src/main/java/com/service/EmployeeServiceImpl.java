package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Employeedaoif;
import com.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeServiceif {
	@Autowired
	Employeedaoif employeedaoif;

	@Override
	public void createEmp(Employee employee) {
		employeedaoif.createEmp(employee);
		
	}

	
	

	@Override
	public List<Employee> viewAllEmp() {
		
		return employeedaoif.viewAllEmp();
	}




	@Override
	public void deleteEmp(int id) {
		employeedaoif.deleteEmp( id);
		
	}


	}


