package com.cg.deptemp.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.entities.Department;
import com.cg.deptemp.repository.DepartmentRepository;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository deptrepo;
	@Override
	public void addDepartment(Department dept) {
		deptrepo.save(dept);
		
	}
	@Override
	public List<Department> viewAllDepts() {
		List<Department>dept=deptrepo.findAll();
		return dept;
	}
	@Override
	public List<Department> getdeptbyid() {
		List<Department> d=deptrepo.findAll();
		return d;
	}
	@Override
	public void updatedepartment(Department dept) {
		
	deptrepo.save(dept);
	}
	@Override
	public void deletedepartment(int code) {
		deptrepo.deleteById(code);
		
	}
	

}
