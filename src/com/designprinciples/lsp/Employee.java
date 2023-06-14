package com.designprinciples.lsp;

public class Employee {

	private int id;
	private String name;
	private Role role;

	public Employee(int id, String name, Role role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Role getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + "]";
	}

}
