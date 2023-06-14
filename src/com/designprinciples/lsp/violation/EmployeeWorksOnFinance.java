package com.designprinciples.lsp.violation;

public class EmployeeWorksOnFinance extends Employee {

	private String designation;

	public void setSalarieis(String salarieis) {

		if (salarieis.equalsIgnoreCase("10000K")) {
			this.designation = "CFO";

		} else if (salarieis.equalsIgnoreCase("100k")) {
			this.designation = "FinanaceAnalyst";

		}
	}

	public void setArchitecture(String architecture) {
		// not related
	}

	public void setBusinees(String businees) {
		// not related
	}

	public void setCoding(String coding) {
		// not related
	}

	public String getDesignation() {
		return designation;
	}

}
