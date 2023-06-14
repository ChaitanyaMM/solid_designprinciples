package com.designprinciples.lsp;

public class EmployeeWorksOnCode extends Employee {

	private String coding;

	public EmployeeWorksOnCode(int id, String name, Role role, String coding) {
		super(id, name, role);
		this.coding = coding;
	}

	public String getCoding() {
		return coding;
	}

}
