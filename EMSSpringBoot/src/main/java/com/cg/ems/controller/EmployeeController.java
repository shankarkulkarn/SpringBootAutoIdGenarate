package com.cg.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.entity.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService  employeeService;
	
	@GetMapping("employee/{id}")
	public  ResponseEntity<Employee>  findEmployeeById(@PathVariable("id")  int id) throws EmployeeException 
	{
		
		   Employee  employee = employeeService.findEmployeeById(id);
		   ResponseEntity<Employee>  re = new ResponseEntity<Employee>(employee,HttpStatus.OK);
		   return re;
	}
	
	@PostMapping("employee")
	public ResponseEntity<Employee>  createEmployee(@RequestBody Employee employee)
	{
		Employee  emp = employeeService.createEmployee(employee);
		ResponseEntity<Employee>  re = new ResponseEntity<Employee>(emp,HttpStatus.OK);
		return re;
	}
	
}
