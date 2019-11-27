package com.java.core.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1724426648822225919L;
	
	//Initialize Employee attributes
	private String name;
	private int id;
	private String dept;
	private transient int salary;
	static String staticVar = "TEMP";
	
	Employee(String name, int id, String dept, int salary, String staticVar) {
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
		Employee.staticVar = staticVar;
	}
	
	Employee() {
		new Employee("Sam", 10, "Payroll", 20000, "staticVar");
	}
	
	public String toString() {
		return "Employee name " + name + ", id " + id + ", dept " + dept + ", salary " + salary;
	}

}
