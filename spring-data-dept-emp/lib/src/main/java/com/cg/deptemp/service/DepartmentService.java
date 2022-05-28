package com.cg.deptemp.service;

import java.util.List;

import com.cg.deptemp.entities.Department;

public interface DepartmentService {
	void addDepartment(Department dept);
	List<Department> viewAllDepts();
	List<Department> getdeptbyid();
	void updatedepartment(Department dept);
	void deletedepartment(int code);
}
