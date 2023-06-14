package com.designprinciples.lsp;

public class EmployeeWorksOnFinance extends Employee {

	private String salarieis;

	public EmployeeWorksOnFinance(int id, String name, Role role, String salarieis) {
		super(id, name, role);
		this.salarieis = salarieis;
	}

	public String getSalarieis() {
		return salarieis;
	}

}
