package com.cg.deptemp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cg.deptemp.dto.Employeedto;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl service;
	
	@GetMapping
	public List<Employee> getemplist() {
	return service.getemplist();
	}
	@PostMapping
	public ResponseEntity<Integer>addemployee(@RequestBody Employeedto emptdo){
		int empno=service.addemployee(emptdo);
		return new ResponseEntity<Integer>(empno,HttpStatus.OK);
		
	}
}
