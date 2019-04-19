package com.capgemini.springjpamanytomany.entity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "PROJECT")
public class Project {

	@Id
	@Column(name = "PROJECT_ID")
	private int projId;

	@Column(name = "Project_NAME")
	private String projName;

	@ManyToMany()
	private Set<Employee> employee;

	public Project() {
		super();
	}

	public Project(int projId, String projName) {
		super();
		this.projId = projId;
		this.projName = projName;
	}

	public Project(int projId, String projName, Set<Employee> employee) {
		super();
		this.projId = projId;
		this.projName = projName;
		this.employee = employee;
	}

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}

	public String getProjName() {
		return projName;
	}

	public void setProjName(String projName) {
		this.projName = projName;
	}

//
//	public Set<Employee> getEmployee() {
//		return employee;
//	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [projId=" + projId + ", projName=" + projName + ", employee=" + employee + "]";
	}

}
