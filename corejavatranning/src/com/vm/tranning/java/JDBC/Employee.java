package com.vm.tranning.java.JDBC;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String dept;
	public Employee(String name, int salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee(int id ,String name, int salary, String dept) {
		super();
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

}
