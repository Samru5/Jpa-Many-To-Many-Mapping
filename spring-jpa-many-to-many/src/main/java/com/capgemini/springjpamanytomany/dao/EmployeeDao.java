package com.capgemini.springjpamanytomany.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.springjpamanytomany.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
