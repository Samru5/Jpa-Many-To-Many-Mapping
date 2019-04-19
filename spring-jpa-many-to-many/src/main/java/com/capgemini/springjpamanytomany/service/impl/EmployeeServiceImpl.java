package com.capgemini.springjpamanytomany.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.springjpamanytomany.dao.EmployeeDao;
import com.capgemini.springjpamanytomany.entity.Employee;
import com.capgemini.springjpamanytomany.entity.Project;
import com.capgemini.springjpamanytomany.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public Set<Employee> addNew(Set<Employee> employee) {
		dao.saveAll(employee);
		return employee;
	}

}
