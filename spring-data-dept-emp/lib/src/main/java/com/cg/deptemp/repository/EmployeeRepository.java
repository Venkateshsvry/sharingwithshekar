package com.cg.deptemp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.deptemp.entities.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

}
