package com.designprinciples.lsp;

public class EmployeeWorksOnArchitecture extends Employee {

	private String architecture;

	public EmployeeWorksOnArchitecture(int id, String name, Role role, String architecture) {
		super(id, name, role);
		this.architecture = architecture;
	}

	public String getArchitecture() {
		return architecture;
	}

}
