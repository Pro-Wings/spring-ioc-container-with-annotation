package com.prowings.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	int id;

	String name;

//	@Autowired
	Department dept;

	public Employee() {
		super();
		System.out.println("setting dept by no-arg constructor");
	}

//	@Autowired
	public Employee(Department dept) {
		super();
		this.dept = dept;
		System.out.println("setting dept by 1-arg constructor");
	}

	@Autowired
	public Employee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("setting id by setter");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setting name by setter");

	}

	public Department getDept() {
		return dept;
	}

//	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
		System.out.println("setting dept by setter");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
