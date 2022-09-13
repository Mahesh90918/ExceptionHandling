package com.serialization1;

import java.io.Serializable;

//If we implement Serializable, then we can convert this class instance into stream of bytes
public class Employee implements Serializable {
	/**
	 * If we don't add this, and run SerializeSerialVersionUIDExample then add new
	 * attribute to this class and then run DeserializeSerialVersionUIDExample, then
	 * we hit with java.io.InvalidClassException // private static final long
	 * serialVersionUID = 1L;//
	 * 
	 */
	// This serialVersionUID field is to verify that the saved and loaded objects
	// have the same attributes
	private static final long serialVersionUID = 2L;

	// instance variables get serialized
	// deserialization assign the serialized value
	private int employeeId;
	private String name;

	// transient variables will not be serialized
	// deserialization assign default value, here it is 0.0
	private transient double salary;

	// static variables will not be serialized
	// Since static variables belongs to the class. After de-serialization they get
	// their current values from the loaded class.
	private static String designation;

	// final variables will get serialized
	// deserialization process do not invoke the constructor, but still
	// deserialization process assign value to this final private variable
//	The final variable department cannot be assigned after de-serialization.
	private final String department;

	// Constructor won't be invoked in the deserialization
	public Employee(int employeeId, String name, double salary, String designation, String department) {
		System.out.println("------------Contructor------------");
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		Employee.designation = designation;// Since it is static,it is not part of Object
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + ", designation="
				+ designation + ", department=" + department + "]";
	}

	// Setters & Getters
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static String getDesignation() {
		return designation;
	}

	public static void setDesignation(String designation) {
		Employee.designation = designation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDepartment() {
		return department;
	}

}