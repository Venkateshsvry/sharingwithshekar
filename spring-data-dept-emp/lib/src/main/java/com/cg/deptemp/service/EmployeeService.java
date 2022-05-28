package com.cg.deptemp.service;

import java.util.List;

import com.cg.deptemp.dto.Employeedto;
import com.cg.deptemp.entities.Employee;

public interface EmployeeService {
List<Employee>getemplist();
int addemployee(Employeedto empdto);
}
