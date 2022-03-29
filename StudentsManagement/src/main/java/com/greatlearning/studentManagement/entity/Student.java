package com.greatlearning.studentManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "studentdetails")
@Getter
@Setter
public class Student {

	// define fields

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Department")
	private String department;

	@Column(name = "Country")
	private String country;

	// define constructors
	public Student() {

	}

	public Student(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

	// define toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", country=" + country + "]";
	}

}