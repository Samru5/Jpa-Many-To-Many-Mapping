package com.capgemini.springjpamanytomany.service;

import java.util.Set;

import com.capgemini.springjpamanytomany.entity.Employee;
import com.capgemini.springjpamanytomany.entity.Project;

public interface EmployeeService {

	public Set<Employee> addNew(Set<Employee> employee);

}
