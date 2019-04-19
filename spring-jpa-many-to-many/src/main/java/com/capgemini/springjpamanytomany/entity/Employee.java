package com.capgemini.springjpamanytomany.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")

public class Employee {

	@Id
	@Column(name = "Employee_ID")
	private int empid;

	@Column(name = "Employee_NAME")
	private String empname;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "EMPLOYEE_PROJECT", joinColumns = { @JoinColumn(name = "Employee_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "PROJECT_ID") })
	private Set<Project> project;

	public Employee() {
		super();
	}

	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	public Employee(int empid, String empname, Set<Project> project) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.project = project;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", project=" + project + "]";
	}

}
