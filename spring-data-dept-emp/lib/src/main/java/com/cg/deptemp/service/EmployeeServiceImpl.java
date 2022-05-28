package com.cg.deptemp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.deptemp.dto.Employeedto;
import com.cg.deptemp.entities.Department;
import com.cg.deptemp.entities.Employee;
import com.cg.deptemp.repository.DepartmentRepository;
import com.cg.deptemp.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
@Autowired
EmployeeRepository emprep;
@Autowired
DepartmentRepository deptrep;
	@Override
	public int addemployee(Employeedto empdto) {
	Department dept=deptrep. getDeptById(empdto.getDeptno());
	Employee emp=new Employee();
	emp.setEmpname(empdto.getEmpname());
	emp.setDoj(empdto.getDoj());
	emp.setJob(empdto.getJob());
	emp.setSalary(empdto.getSalary());
	emp.setDept(dept);
	emprep.save(emp);
	return emp.getEmpno();
	}
	@Override
	public List<Employee> getemplist() {
		
		return null;
	}

}
