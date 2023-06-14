package com.designprinciples.isp.violation;

abstract public class Employee {

	public int id;
	public String name;
	public String role;

	Employee(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;

	}

	abstract void doActions();

	@Override
	public String toString() {
		return "Empolyee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
