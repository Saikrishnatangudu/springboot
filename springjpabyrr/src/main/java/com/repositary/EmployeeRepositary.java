package com.repositary;

import org.springframework.data.repository.CrudRepository;

import com.model.Employee;

public interface EmployeeRepositary extends CrudRepository<Employee, Integer>{

}
