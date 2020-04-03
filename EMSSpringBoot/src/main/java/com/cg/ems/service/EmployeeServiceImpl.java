package com.cg.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.entity.Employee;
import com.cg.ems.exception.EmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	  @Autowired
	  EmployeeDao  employeeDao;
	@Override
	public Employee findEmployeeById(int employeeId) throws EmployeeException  {
		
		if( ! employeeDao.existsById(employeeId))
		{
			throw new EmployeeException(" ID NOT FOUND ");
		}
		return employeeDao.findById(employeeId).get();
	}
	@Override
	public Employee createEmployee(Employee employee) {
	 Employee  emp = employeeDao.saveAndFlush(employee);
     return emp;
	}

}
