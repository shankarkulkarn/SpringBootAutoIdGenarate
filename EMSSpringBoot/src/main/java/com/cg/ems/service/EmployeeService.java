package com.cg.ems.service;

import com.cg.ems.entity.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeService {

	public Employee findEmployeeById(int employeeId) throws EmployeeException ;
	
	public Employee createEmployee(Employee  employee);
}
