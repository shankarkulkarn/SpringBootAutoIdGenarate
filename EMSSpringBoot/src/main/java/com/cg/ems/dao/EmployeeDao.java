package com.cg.ems.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
