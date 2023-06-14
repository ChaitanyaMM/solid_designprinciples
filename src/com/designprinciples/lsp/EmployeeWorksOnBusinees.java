package com.designprinciples.lsp;

public class EmployeeWorksOnBusinees extends Employee {

	private String businees;

	public EmployeeWorksOnBusinees(int id, String name, Role role, String businees) {
		super(id, name, role);
		this.businees = businees;
	}

	public String getBusinees() {
		return businees;
	}

}
