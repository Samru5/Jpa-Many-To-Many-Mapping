package com.capgemini.springjpamanytomany.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springjpamanytomany.entity.Employee;
import com.capgemini.springjpamanytomany.entity.Project;
import com.capgemini.springjpamanytomany.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/")
	public Set<Employee> addNewPerson() {
		Set<Project> project = new HashSet<Project>();
		project.add(new Project(1, "Java"));
		project.add(new Project(2, "Python"));

		Set<Employee> employee = new HashSet<Employee>();
		employee.add(new Employee(101, "John", project));
		employee.add(new Employee(102, "Smith", project));

		service.addNew(employee);
		return employee;
	}

}
