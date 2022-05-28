package com.cg.deptemp.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.cg.deptemp.entities.Department;
import com.cg.deptemp.service.DepartmentServiceImpl;
@RestController
@RequestMapping("/dept")
public class DepartmentController {
	@Autowired
 DepartmentServiceImpl service;
	@PostMapping
	public ResponseEntity<String> adddepartment(@RequestBody Department dept){
		service.addDepartment(dept);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);}
	@GetMapping
	public ResponseEntity<List<Department>>getAllDepts(){
		List<Department> deptlist=service.viewAllDepts();
		return new ResponseEntity<List<Department>>(deptlist,HttpStatus.OK);
		}
		@GetMapping("/id/{code}")
		public ResponseEntity<Department>getbyid(@PathVariable int code){
			List<Department> dept=service.getdeptbyid();
			for(Department dept1:dept){
				if(dept1.getDeptno()==code) {
					 return new ResponseEntity<Department>(dept1,HttpStatus.OK);
				}
			}
			return null;
			
		}
		@PutMapping
		public ResponseEntity<String>putdepartment(@RequestBody Department dept){
			service.updatedepartment(dept);
			return new ResponseEntity<String>("updated",HttpStatus.OK);
		}
		@DeleteMapping("/id/{code}")
		public ResponseEntity<String>delete(@PathVariable int code){
			service.deletedepartment(code);
			return new ResponseEntity<String>("deleted",HttpStatus.OK);
		}
}

